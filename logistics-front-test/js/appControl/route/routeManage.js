let range_city = [];
let cityId;

let range_dot = [ '', 'layui-bg-orange', 'layui-bg-green', 'layui-bg-cyan', 'layui-bg-blue', 'layui-bg-black', 'layui-bg-gray' ];


layui.use(['element', 'form', 'laydate', 'layer', 'table', 'jquery'], function() {
    let element = layui.element,
        form = layui.form,
        laydate = layui.laydate,
        layer = layui.layer,
        table = layui.table,
        $ = layui.jquery;

    refreshTable();

    // 监听工具条
    table.on('tool(expandTool)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
        let data = obj.data; //获得当前行数据
        let layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
        // let tr = obj.tr; //获得当前行 tr 的DOM对象

        if(layEvent === 'del'){ //删除
            layer.confirm('真的删除么', function(index){
                //向服务端发送删除指令
                $.ajax({
                    type: "DELETE",
                    url: nginx_url + "/route/delete/" + data.cityId,
                    //dataType: 'json',
                    async: false,
                    success: function (result) {
                        console.log(result);
                        if (result === 'SUCCESS') {
                            layer.msg('删除成功', {
                                time: 800,
                                icon: 1
                            });
                        } else {
                            layer.msg('删除成功', {
                                time: 800,
                                icon: 2
                            });
                        }
                    }

                });
                table.reload('expandTable', {
                    url: nginx_url +  '/route/findAllExpands'
                })
            });
        } else if (layEvent === 'edit'){ //修改
            layer.open({
                type: 2,
                title: '主要城市范围修改',
                content: [ 'routeModify.html?id=' + data.id +"="+data.rangeCity+"="+data.cityId],
                area: [ '75%', '75%' ],
                shadeClose: false,
                move: false,
                end: function() {
                    table.reload('expandTable', {
                        url: nginx_url + '/route/findAllExpands'
                    })
                }
            });
        }
    });

    form.on('submit(addInfo)', function () {
        let cityId = $("#mainroutehidden").val();
        console.log("cityId: " + cityId);
        console.log("range: " + range_city.toString());
        $.ajax({
            type: 'post',
            url: nginx_url + '/route/add',
            data: {
                'cityId': cityId,
                'rangeCity': range_city.toString()
            },
            //dataType: 'json',
            success: function (result) {
                if (result === 'SUCCESS') {
                    layer.msg('添加成功', {
                        time: 800,
                        icon: 1
                    });
                    $("#resetForm").click();
                } else {
                    layer.msg('添加失败', {
                        time: 800,
                        icon: 5
                    })
                }
            }
        });
        return false;
    });

    element.on('tab(demo)', function(data){
        if (data.index === 0) {
            refreshTable();
        } else if (data.index === 1) {

        } else {
            $("#routeInfo").empty();
            $.ajax({
                type: 'get',
                url: nginx_url + '/route/findAllRoutes',
                dataType: 'json',
                success: function (result) {
                    console.log(result);
                    let rand = 0;
                    $.each(result, function (i, item) {
                        let content = '<div class="layui-row layui-col-space15">'+
                            '<div class="layui-col-md12">' +
                            '<div class="layui-card">' +
                            '<div class="layui-card-header">' +
                            '<div class="layui-col-md4">';
                        content += item.startStation + ' - ' + item.endStation;
                        content +=  '</div><div class="layui-col-md4">';
                        content += '里程：' + item.distance + 'km';
                        content +=  '</div><div class="layui-col-md4">';
                        content += '耗时：' + item.fetchTime + '天';
                        content += '</div></div>' +
                            '<div class="layui-card-body layui-col-space10">';
                        if (item.passStation !== '') {
                            let passStation = item.passStation.split(',');
                            $.each(passStation, function (j, temp) {
                                content += j === 0 ? '' : ' - ';
                                content += '<span class="layui-badge-dot ' + range_dot[(rand++ % 7)] + '"></span> ';
                                content += '<span> ' + temp + '</span>'

                            });
                        } else {
                            content += '<span class="layui-badge-dot ' + range_dot[(rand++ % 7)] + '"></span>';
                            content += '<span> 直达</span>'
                        }
                        $("#routeInfo").append(content);
                    });
                }
            })
        }
    });

    $(document).on('click',"#mainroute",function () {


        layer.open({
            type: 2,
            title: '地区选择',
            content: ['index.html?changecity=1'],
            area: ['40%', '75%'],
            shadeClose: true,
            move: false,
            /*end: function() {
                table.reload('billTable', {
                    url: nginx_url + '/bill/findNotRelease'
                })
            }*/
        });
    });

    $(document).on('click','#rangeCity',function () {

        layer.open({
            type: 2,
            title: '地区选择',
            content: ['index.html?changecity=2'],
            area: ['30%', '75%'],
            shadeClose: false,
            move: false,
            end: function() {
                let select_id = $('#rangecityhidden').val();
                let select_value = $('#rangeCity').val();
                range_city.push(select_id.toString());
                if(select_id!=''&&select_id!=null){
                    console.log(select_id+"why");
                    let content = "<button type='button' class='layui-btn layui-btn-sm' id='city-" + select_id +"' onclick='removeSpan(" + select_id + ")'>";
                    content += select_value;
                    content += "<span class='layui-badge layui-bg-gray' style='font-size: 4px; line-height: 16px; height: 16px'>X</span></button>";
                    $("#selectedCity").append(content);
                    console.log(range_city);

                }
            }
        });

    });


    $("#resetForm").click(function () {
        $("#selectedCity").empty();
    });


    function refreshTable() {
        table.render({
            elem: '#expandTable',
            height: 'full-170',
            url: nginx_url + '/route/findAllExpands', //数据接口
            limit: 10,
            limits: [ 10 ],
            request: {
                pageName: 'pageNum', //页码的参数名称，默认：page
                limitName: 'limit' //每页数据量的参数名，默认：limit
            },
            response: {
                statusName: 'code', //数据状态的字段名称，默认：code
                statusCode: 200, //成功的状态码，默认：0
                msgName: 'msg', //状态信息的字段名称，默认：msg
                countName: 'count', //数据总数的字段名称，默认：count
                dataName: 'data' //数据列表的字段名称，默认：data
            },
            page: true, //开启分页
            cellMinWidth: 80,
            cols: [[
                { title: 'ID', fixed: 'left', sort: true, type: 'numbers' },
                { field:'id',title:'城市ID',width:150,align:'center'},
                { field: 'cityId', title: '主要城市', sort: true, templet: '#cityFormat', width: 150, align: 'center' },
                { field: 'rangeCity', title: '范围城市', templet: '#rangeFormat', align: 'center' },
                { fixed: 'right', title:"操作", align:"center", toolbar: '#barDemo', width: 150    }
            ]]
        });
    }

});




function format(id) {
    let array = ('' + id).split(',');
    let result = '';
    $.each(array, function (i, item) {
        result += (i === 0 ? '' : ', ');
        result += cityMap[item];
    });
    return result;
}

function removeSpan(id) {
    let buttonId = '#city-' + id;
    range_city.splice($.inArray(id.toString(),range_city), 1);
    console.log(range_city);
    $(buttonId).remove();
    if(range_city==null||range_city.length==0){
        $('#rangeCity').val("");
    }
}