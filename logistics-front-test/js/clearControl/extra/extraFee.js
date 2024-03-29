layui.use(['element', 'form', 'laydate', 'layer', 'table'], function(){
    let element = layui.element,
    form = layui.form,
    laydate = layui.laydate,
    layer = layui.layer,
    table = layui.table;


    element.on('tab(demo)', function(data){
        if (data.index === 1) {
            table.render({
                elem: '#extraFeeTable',
                height: 'full-170',
                url: nginx_url + '/clear/selectAllExtraClear', //数据接口
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
                    { field: 'id', title: '杂费结算id', sort: true },
                    { field: 'subjectName', title: '科目名称' },
                    { field: 'balanceMoney', title: '结算金额' },
                    { field: 'remark', title: '备注' },
                    { field: 'balanceType', title: '结算类型' },
                    { field: 'balanceDate', title: '结算日期', templet: '#createTime' }
                ]]
            });

            // // 监听工具条
            // table.on('tool(extraFeeTool)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
            //     let data = obj.data; //获得当前行数据
            //     let layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
            //     // let tr = obj.tr; //获得当前行 tr 的DOM对象
            //
            //
            // });
        }
    });


    laydate.render({
        elem: '#balanceDate',
        type: 'date'
        // theme: 'grid'
    });

    // 职员信息添加
    form.on('submit(addExtraFee)', function (data) {
        $.ajax({
            type: "post",
            url: nginx_url + "/clear/addExtraClear",
            data: $("#extraFeeForm").serialize(),
            //dataType: "json",
            success: function (result) {
                if (result === "SUCCESS") {
                    layer.msg('杂费结算表添加成功', {
                        time: 800
                    });
                    $("#resetForm").click();
                } else {
                    layer.msg('杂费结算表添加失败', {
                        time: 800
                    });
                }
            }
        });
        return false;
    });

});

function createTime(v){
    let dateTime;
    let date = new Date(v);
    //date.setTime(v);
    let y = date.getFullYear();
    let m = date.getMonth() + 1;
    m = m < 10 ? '0' + m : m;
    let d = date.getDate();
    d = d < 10 ? "0" + d : d;
    dateTime = y + "-" + m + "-" + d;
    return dateTime;
}





