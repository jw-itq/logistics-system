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

    laydate.render({
        elem: '#writeDate',
        value: new Date()
    });

    laydate.render({
        elem: '#sendGoodsDate',
        value: new Date()
    });

    let employeeId = $.cookie('loginId');
    $("#writeBillPerson").val(employeeId);
    $("#employeeCode").val(employeeId);

    $.ajax({
        type: "get",
        url: nginx_url + "/selectAllCusCode",
        async: false,
        success: function (result) {
            $.each(result, function (i, item) {
                let option = "<option value='" + item+ "'>";
                option += item;
                option += "</option>";
                $("#sendGoodsCustomerNo").append(option);
                $("#receiveGoodsCustomerCode").append(option);
                form.render();
            });
        }

    });

    form.on('select(changeSend)', function (data) {
        // ajax
        $.ajax({
            type: 'get',
            url: nginx_url + '/selectCusByCode/' + data.value,
            success: function (result) {
                $("#sendGoodsCustomer").val(result.customer);
                $("#sendGoodsCustomerTel").val(result.phone);
                $("#sendGoodsCustomerAddr").val(result.address);
            }
        });
    });

    form.on('select(changeSend2)', function (data) {
        // ajax
        $.ajax({
            type: 'get',
            url: nginx_url + '/selectCusByCode/' + data.value,
            success: function (result) {
                $("#receiveGoodsCustomer").val(result.customer);
                $("#receiveGoodsCustomerTel").val(result.phone);
                $("#receiveGoodsCustomerAddr").val(result.address);
            }
        });

    });

    //------------------------------------------------------------------------------------------->>>
    //监听省份选择
    /*form.on('select(province)',
        function(data) {
           /!* $('#city').html('<option value="">请选择市/县</option>');
            $('#area').html('<option value="">请选择镇区</option>');
            $('#street').html('<option value="">请选择街道</option>');*!/

        });*/
    $.ajax({
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
                $("#province").append(option);
                form.render('select');
            });
        }
    });

    form.on('select(province)',
        function(data) {
            $("#city").empty();
            $("#area").empty();
            $("#street").empty();
            $("#city").append("<option value=''>--请选择--</option>");
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
                        $("#city").append(option);
                        form.render('select');
                    });
                }
            });
        });
    //监听省份选择
    form.on('select(city)',
        function(data) {
            $("#area").empty();
            $("#street").empty();
            $("#area").append("<option value=''>--请选择--</option>");
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
                        $("#area").append(option);
                        form.render('select');
                    });
                }
            });
        });
    form.on('select(area)',
        function(data) {
            $("#street").empty();
            $("#street").append("<option value=''>--请选择--</option>");
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
                        $("#street").append(option);
                        form.render('select');
                    });
                }
            });

            //let sendStr = $("#province").attr()+$("#city").val()+$("#area").val()+$("#street").val()+$("#other").val();
            //alert($('#province option:selected').html());
        });


    //收获地址的开始
    $.ajax({
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
        });
    //收获地址的结束

    //----------------------------------------------------------------------------------------------<<<

    form.on('switch(checkSettle)', function(data){
        if (data.elem.checked === true) {
            $("#ifSettleAccounts").val('true');
        } else {
            $("#ifSettleAccounts").val('false');
        }
        // form.render();
    });



    // 货运单信息添加
    // $("#addGoodsBill").click(function () {
    form.on('submit(addGoodsBill)', function () {

        $("#goodsBillForm :input").each(function () {
            $(this).removeAttr("disabled");
        });
        $("#factDealDate").attr("disabled", "disabled");
        $("#transferFee").attr("disabled", "disabled");
        $("#moneyOfChangePay").attr("disabled", "disabled");

        //去掉不需要提交的数据
        $("#province").attr("disabled","disabled");
        $("#city").attr("disabled","disabled");
        $("#area").attr("disabled","disabled");
        $("#street").attr("disabled","disabled");
        $("#other").attr("disabled","disabled");

        $("#province1").attr("disabled","disabled");
        $("#city1").attr("disabled","disabled");
        $("#area1").attr("disabled","disabled");
        $("#street1").attr("disabled","disabled");
        $("#other1").attr("disabled","disabled");

        //汇总发货地址
        let sr = $('#other option:selected').html();
        if(sr==null){
            sr = '';
        }
        let sendStr = $('#province option:selected').html()+$('#city option:selected').html()+$('#area option:selected').html()+$('#street option:selected').html()+sr;
        $("#sendGoodsAddr").val(sendStr);
        //汇总收获地址
        sr = $('#other1 option:selected').html();
        if(sr==null){
            sr = '';
        }
        let receive = $('#province1 option:selected').html()+$('#city1 option:selected').html()+$('#area1 option:selected').html()+$('#street1 option:selected').html()+sr;
        $("#receiveGoodsAddr").val(receive);

        //alert($("#sendGoodsAddr").val());

        $.ajax({
            type: "post",
            url: nginx_url + "/goodsBill/add",
            data: $("#goodsBillForm").serialize(),
            dataType: "json",
            async: false,
            success: function (result) {
                if (result.status === "SUCCESS") {
                    layer.msg('货运单添加成功', {
                        time: 800,
                        icon: 1
                    });
                    layer.open({
                        type: 2,
                        title: '货运单编号：' + result.goodsBillCode,
                        content: [ 'editGoods.html?id=' + result.goodsBillCode, 'no' ],
                        area: [ '85%', '85%' ],
                        shadeClose: true,
                        move: false
                    });
                    $("#resetForm").click();
                } else {
                    layer.msg('货运单添加失败', {
                        time: 800,
                        icon: 2
                    });
                }
                console.log(result);
            }
        });
        return false;
    });

});