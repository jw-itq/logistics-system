layui.use(['layer', 'form', 'element', 'jquery', 'table', 'laydate'], function() {
    let element = layui.element,
        $ = layui.jquery,
        layer = layui.layer,
        form = layui.form,
        table = layui.table,
        laydate = layui.laydate;

    let employeeCode = $.cookie('loginId');

    let type = decodeURI(window.location.href.split('=')[2]);
    let goodsBillCode = window.location.href.split('=')[1].split('&')[0];

    $.ajax({
        type: 'get',
        url: nginx_url + '/goodsBill/selectByCode/' + goodsBillCode,
        dataType: 'json',
        async: false,
        success: function (result) {
            console.log(result);
            $("#type").val(type);
            $("#writer").val(employeeCode);
            $("#dialNo").val(type === '提货回告' ? result.receiveGoodsCustomerTel : result.sendGoodsCustomerTel);
            laydate.render({
                elem: "#writeTime",
                type: 'date',
                value: new Date()
            });
        }
    });

    form.on('submit(confirm)', function () {

        $("#informForm :input").each(function () {
            $(this).removeAttr("disabled");
        });

        $.ajax({
            type: 'post',
            url: nginx_url + '/callback/add/' + goodsBillCode,
            data: $("#informForm").serialize(),
            //dataType: 'json',
            async: false,
            success: function (result) {
                if (result === 'SUCCESS') {
                    layer.msg('回告信息填写成功', {
                        time: 800,
                        icon: 1
                    }, function () {
                        let index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
                        parent.layer.close(index); //再执行关闭
                    })
                } else {
                    layer.msg('回告信息填写失败', {
                        time: 800,
                        icon: 5
                    })
                }
            }
        });
        return false;
    });

});