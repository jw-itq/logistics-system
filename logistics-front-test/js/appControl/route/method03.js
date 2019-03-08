//****************针对第三种方式的具体js实现部分******************//
//var addrShow03 = $('addr-show03');
var addrShow03 = document.getElementById('addr-show03');
//****************所使用的数据是city02.js******************//
//alert("--hahah");
var dataOrder = document.getElementById('data-order').querySelectorAll('li');
var dataShow = document.getElementById('data-show');

var changecity = window.location.href.split("=")[1];

(function init() {
    showHotCity();
})();

/*自动加载热门城市*/
function showHotCity() {
    dataOrder[0].className = 'cityOn';
    var citysLen = cityAll[0].city.length;
	//alert("hahahah"+citysLen);
    var dl = document.createElement('dl');
    var dt = document.createElement('dt');
    dt.innerText = cityAll[0].name;
    var dd = document.createElement('dd');
    dl.appendChild(dt);
    dl.appendChild(dd);

    for (var i = 0; i < citysLen; i++) {
        var aCity = document.createElement('a');
        aCity.innerText = cityAll[0].city[i].cityname;
        dd.appendChild(aCity);
    }
    dataShow.appendChild(dl);

}

/*点击不同的字母集显示对于的城市*/
dataOrder.forEach(function (value, index, array) {
    value.onclick = function () {
        for (var z = 0; z < 7; z++) {
            if (z == index)
                dataOrder[index].className = 'cityOn';
            else
                dataOrder[z].className = '';
        }
        dataShow.innerHTML = '';
        switch (index) {
            case 0:
                showHotCity();
                break;
            case 6:
                showCitys(index, 2);
                break;
            default:
                showCitys(index, 4);
        }
    }
});

/*显示城市的具体方法*/
function showCitys(index, m) {
    var currentAll = cityAll.slice(4 * index - 3, 4 * index + m - 3);
       // alert(currentAll[0].name);
    var dl = [];
    for (var j = 0; j < m; j++) {
        dl[j] = document.createElement('dl');
        var dt = document.createElement('dt');
        dt.innerText = currentAll[j].name;
        dl[j].appendChild(dt);
        var citysLen = currentAll[j].city.length;
        var dd = document.createElement('dd');
		
        for (var k = 0; k < citysLen; k++) {
            var aCity = document.createElement('a');
            aCity.innerText = currentAll[j].city[k].cityname;
            //aCity.value=currentAll[j].city[k].cityname;
            //console.log(aCity.value()+"  --");
                //alert(aCity.innerText+" "+city[k].id);

            dd.appendChild(aCity);
        }
        dl[j].appendChild(dd);
        dataShow.appendChild(dl[j]);
    }
}

/*点击城市时，将结果显示在输入框中(该点击事件绑定在父元素上)*/
dataShow.onclick = function (e) {
    var cityShow = dataShow.querySelectorAll('a');
    var e = e || window.event;
    var target = e.target || e.srcElement;
    if (target && target.nodeName == 'A') {
        addrShow03.value = target.innerText;
    }
    addrShow03.focus();
}


layui.use(['element', 'form', 'laydate', 'layer', 'table', 'jquery'], function() {
    let element = layui.element,
        form = layui.form,
        laydate = layui.laydate,
        layer = layui.layer,
        table = layui.table,
        $ = layui.jquery;

    form.on('submit(addInfo)', function () {

        let data = $('#addr-show03').val();

        if(data==''||data==null){
            alert("地区不能以空提交！");
        }else {
            if(changecity==1){
                var id = "";
                for(var i = 0;i<cityAll.length;i++){
                    var t = cityAll[i].city.length;
                    for(var j = 0;j<t;j++){
                        var ct = cityAll[i].city[j].cityname;
                        if(ct==data){
                            id = cityAll[i].city[j].id;
                            //alert(ct+"找到了"+id);
                            break;
                        }
                    }
                }
                window.parent.document.getElementById("mainroutehidden").value=id;

                window.parent.document.getElementById("mainroute").value = data;
            }else{
                var id = "";
                for(var i = 0;i<cityAll.length;i++){
                    var t = cityAll[i].city.length;
                    for(var j = 0;j<t;j++){
                        var ct = cityAll[i].city[j].cityname;
                        if(ct==data){
                            id = cityAll[i].city[j].id;
                            //alert(ct+"找到了"+id);
                            break;
                        }
                    }
                }
                window.parent.document.getElementById("rangecityhidden").value=id;
                window.parent.document.getElementById("rangeCity").value = data;
            }
            let index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
            parent.layer.close(index); //再执行关闭

        }

        /*let cityId = $("#city").val();
        console.log("cityId: " + cityId);
        console.log("range: " + range_city.toString());
        $.ajax({
            type: 'post',
            url: nginx_url + '/route/add',
            data: {
                'cityId': cityId,
                'rangeCity': range_city.toString()
            },
            dataType: 'json',
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
        return false;*/
    });


});
