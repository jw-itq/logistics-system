layui.use(['layer', 'form', 'element', 'jquery', 'table', 'laydate'], function() {
    let element = layui.element,
        $ = layui.jquery,
        layer = layui.layer,
        form = layui.form,
        table = layui.table,
        laydate = layui.laydate;

    let driverId = $.cookie('loginId');
    let href = window.location.href;
   // let goodBillCode = href.split('=')[1].split('&')[0];

    let infrom = href.split("=");
    let goodBillCode = infrom[1];
    $("#sendGoodsCustomer").val(decodeURIComponent(infrom[2]));
    $("#sendGoodsCustomerTel").val(infrom[3]);
    $("#receiveGoodsCustomer").val(decodeURIComponent(infrom[4]));
    $("#receiveGoodsCustomerTel").val(infrom[5]);

    //alert(infrom);
    let goodsRevertBillCode;
    $.ajax({
        type: 'get',
        url: nginx_url + '/vehicle/findRevertId/' + goodBillCode,
        //dataType: 'json',
        async: false,
        success: function (result) {
            goodsRevertBillCode = result;
        }
    });
    $("#goodsRevertCode").val(goodsRevertBillCode);
    /*let receiveGoodsLinkman = decodeURI(href.split('=')[2]);

    $.ajax({
        type: 'get',
        url: nginx_url + '/driverInfo/selectById/' + driverId,
        dataType: 'json',
        async: false,
        success: function (result) {
            console.log(result);
            $("#driverName").val(result.driverName);
        }
    });
    $("#goodsRevertCode").val(goodsRevertBillCode);
    $("#receiveGoodsPerson").val(receiveGoodsLinkman);

    laydate.render({
        elem: '#rceiveGoodsDate',
        type: 'date',
        value: new Date()
    });*/

    form.on('submit(confirm)', function () {
        $("#releaseForm :input").each(function () {
            $(this).removeAttr("disabled");
        });

        $.ajax({
            type: 'get',
            url: nginx_url + '/bill/addTransfer/' + goodsRevertBillCode,
            //data: $("#releaseForm").serialize(),
            //dataType: 'json',
            async: false,
            success: function (result) {
                if (result === 'SUCCESS') {
                    layer.msg('到货中转成功', {
                        time: 800,
                        icon: 1
                    }, function () {
                        let index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
                        parent.layer.close(index); //再执行关闭
                    })
                } else {
                    layer.msg('到货中转失败', {
                        time: 800,
                        icon: 1
                    });
                }
            }
        });
        return false;
    });
});