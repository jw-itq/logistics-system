layui.use(['element', 'form', 'laydate', 'layer', 'table', 'jquery'], function() {
    let element = layui.element,
        form = layui.form,
        laydate = layui.laydate,
        layer = layui.layer,
        table = layui.table,
        $ = layui.jquery;

    lay('.test-item').each(function () {
        laydate.render({
            elem: this,
            trigger: 'click'
        })
    });

    $.ajax({
        type: "get",
        url: nginx_url + "/vehicle/selectLeftCodes",
        async: false,
        success: function (result) {
            $.each(result, function (i, item) {
                let option = "<option value='" + item + "'>";
                option += item;
                option += "</option>";
                $("#goodsRevertBillCode").append(option);

            });
            form.render('select');
        }
    });

    //以前的方法，现在不用了
    /* $.ajax({
         type: 'get',
         url: nginx_url + '/route/findAllRegions',
         dataType: 'json',
         async: false,
         success: function (result) {
             $.each(result, function (i, item) {
                 let option = '<option value="' + item.city + '">';
                 option += item.city;
                 option += '</option>';
                 $("#loadStation").append(option);
                 $("#dealGoodsStation").append(option);
             });
             form.render('select');
         }
     });*/


    $.ajax({
        type: "get",
        url: nginx_url + "/route/startRouteinfo",
        async: false,
        success: function (result) {
            $.each(result, function (i, item) {
                let option = "<option value='" + item.startStation + "'>";
                option += item.startStation;
                option += "</option>";
                $("#loadStation").append(option);

            });
            form.render('select');
        }
    });



    //选择地址开始
    /*$(document).on('click', "#loadStation", function () {


        layer.open({
            type: 2,
            title: '地区选择',
            content: ['index.html?changecity=1'],
            area: ['40%', '75%'],
            shadeClose: true,
            move: false,
            /!*end: function() {
                table.reload('billTable', {
                    url: nginx_url + '/bill/findNotRelease'
                })
            }*!/
        });
    });*/

    /*$(document).on('click', '#dealGoodsStation', function () {

        layer.open({
            type: 2,
            title: '地区选择',
            content: ['index.html?changecity=2'],
            area: ['40%', '75%'],
            shadeClose: false,
            move: false,
            /!*end: function() {
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
            }*!/
        });
    });*/
    //选择地址结束


    //收获地址的开始
   /* $.ajax({
        url: nginx_url+"/getchildarea",
        data: {
            parent_id: 0
        },
        type: 'get',
        dataType: 'json',
        success: function(result) {
            $.each(result, function (i, item) {
                let option = "<option name='"+item.areaName+"' value='" + item.id + "'>";
                option += item.areaName;
                option += "</option>";
                $("#province1").append(option);
                form.render('select');
            });
        }
    });

    form.on('select(province1)',
        function(data) {
            $("#city1").empty();
            $("#area1").empty();
            $("#street1").empty();
            $("#city1").append("<option value=''>--请选择--</option>");
            $.ajax({
                url: nginx_url+"/getchildarea",
                data: {
                    parent_id: data.value
                },
                type: 'get',
                dataType: 'json',
                success: function(result) {
                    $.each(result, function (i, item) {
                        let option = "<option name='"+item.areaName+"' value='" + item.id + "'>";
                        option += item.areaName;
                        option += "</option>";
                        $("#city1").append(option);
                        form.render('select');
                    });
                }
            });
        });
    //监听省份选择
    form.on('select(city1)',
        function(data) {
            $("#area1").empty();
            $("#street1").empty();
            $("#area1").append("<option value=''>--请选择--</option>");
            $.ajax({
                url: nginx_url+"/getchildarea",
                data: {
                    parent_id: data.value
                },
                type: 'get',
                dataType: 'json',
                success: function(result) {
                    $.each(result, function (i, item) {
                        let option = "<option name='"+item.areaName+"' value='" + item.id + "'>";
                        option += item.areaName;
                        option += "</option>";
                        $("#area1").append(option);
                        form.render('select');
                    });
                }
            });
        });
    form.on('select(area1)',
        function(data) {
            $("#street1").empty();
            $("#street1").append("<option value=''>--请选择--</option>");
            $.ajax({
                url: nginx_url+"/getchildarea",
                data: {
                    parent_id: data.value
                },
                type: 'get',
                dataType: 'json',
                success: function(result) {
                    $.each(result, function (i, item) {
                        let option = "<option name='"+item.areaName+"' value='" + item.id + "'>";
                        option += item.areaName;
                        option += "</option>";
                        $("#street1").append(option);
                        form.render('select');
                    });
                }
            });

            //let sendStr = $("#province").attr()+$("#city").val()+$("#area").val()+$("#street").val()+$("#other").val();
            //alert($('#province option:selected').html());
        });*/
    //收获地址结束

        form.on('select(changeload)',function () {
            $.ajax({
                type: "get",
                url: nginx_url + "/route/findRouteByCode/"+$("#loadStation").val(),
                async: false,
                success: function (result) {
                    $.each(result, function (i, item) {
                        let option = "<option value='" + item.id + "'>";
                        if(item.passStation==""||item.passStation==null||item.passStation.length==0){
                            option += item.endStation+"<无中转>";
                        }else{
                            option += item.endStation+"<有中转>"+item.passStation;
                        }
                        option += "</option>";
                        $("#dealGoodsStation").append(option);

                    });
                    form.render('select');
                }
            });
        });





        //-----------------------------------------------------------------------《《
        form.on('select(changeSend)', function (data) {
            //alert($("#loadStation").val());
            // ajax
            $.ajax({
                type: 'get',
                url: nginx_url + '/vehicle/findGoodsBill/' + data.value,
                success: function (result) {
                    $("#receiveGoodsLinkman").val(result.receiveGoodsCustomer);
                    $("#linkmanPhone").val(result.receiveGoodsCustomerTel);
                    $("#receiveGoodsDetailAddr").val(result.receiveGoodsCustomerAddr);
                }
            });
        });

        laydate.render({
            elem: '#signTime',
            value: new Date()
        });

        // 货运单回执信息添加
        form.on('submit(addCargoReceipt)', function () {

            $("#receiveGoodsLinkman").removeAttr("disabled");
            $("#linkmanPhone").removeAttr("disabled");
            $("#receiveGoodsDetailAddr").removeAttr("disabled");
            $("#backBillState").removeAttr("disabled");


            //去掉不需要提交的数据
            /*$("#province1").attr("disabled","disabled");
            $("#city1").attr("disabled","disabled");
            $("#area1").attr("disabled","disabled");
            $("#street1").attr("disabled","disabled");
            $("#other1").attr("disabled","disabled");*/

            //汇总发货地址
            //汇总收获地址
            /*let sr = $('#other1 option:selected').html();
            if(sr==null){
                sr = '';
            }
            let receive = $('#province1 option:selected').html()+$('#city1 option:selected').html()+$('#area1 option:selected').html()+$('#street1 option:selected').html()+sr;
            $("#receiveGoodsDetailAddr").val(receive);*/


            $.ajax({
                type: "post",
                url: nginx_url + "/vehicle/add/"+$("#dealGoodsStation").val(),
                data: $("#cargoReceiptForm").serialize(),
                //dataType: "json",
                async: false,
                success: function (result) {
                    if (result === "SUCCESS") {
                        layer.msg('货运回执单添加成功', {
                            time: 800,
                            icon: 1
                        });
                        $("#resetForm").click();
                    } else {
                        layer.msg('货运回执单添加失败', {
                            time: 800,
                            icon: 2
                        });
                    }
                }
            });
            return false;
        });

    });