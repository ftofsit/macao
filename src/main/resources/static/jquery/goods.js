function add_collection(){
    var img = $("#scimg").attr('src');
    if( img == "/images/ico_star.png" ){
        $("#scimg").attr("src","/images/ico_star1.png");
        alert("收藏完成");
    }else{
        $("#scimg").attr("src","/images/ico_star.png");
        alert("取消收藏");
    }
}

$(function () {
    $(window).scroll(function () {//为页面添加页面滚动监听事件
        var wst = $(window).scrollTop(); //滚动条距离顶端值
        if( wst+10 >= 650 ){
            $(".scroll-nav").css("display","block");
        }else{
            $(".scroll-nav").css("display","none");
        }
        //console.log(wst);
    });
})

//商品屬性選擇事件
var mSpan = document.getElementById('model').getElementsByTagName('span');
var cSpan = document.getElementById('color').getElementsByTagName('span');
var rSpan = document.getElementById('rom').getElementsByTagName('span');
// var bSpan = document.getElementById('banben').getElementsByTagName('span');
var aSpan = document.getElementsByTagName('span');
var oModel = document.getElementById('model');
var oRom = document.getElementById('rom');
var oPrice = document.getElementById('price');
var goodsnum = document.getElementById('quantity');

mSpan[0].className = 'on';
cSpan[0].className = 'on';
rSpan[0].className = 'on';
// bSpan[0].className = 'on';
//選擇屬性事件切換
for (var i=0;i<aSpan.length;i++ )
{
    aSpan[i].onclick = function() {
        var siblings = this.parentNode.children;
        for (var j=0;j<siblings.length;j++ )
        {
            siblings[j].className = '';
        }
        this.className = 'on';
        if ( this.parentNode == oModel || this.parentNode == oRom )			{
            price();
        }
    };
};
//屬性價格的計算
function price(){
    p1 = 0;
    p2 = 0;
    p3 = 0;
    for (var i=0;i<mSpan.length;i++ )		{
        if ( mSpan[i].className == 'on' )
        {
            p1 = mSpan[i].getAttribute("id");
            break;
        };
    };
    for (var i=0;i<rSpan.length;i++ )		{
        if ( rSpan[i].className == 'on' )
        {
            p2 = rSpan[i].getAttribute("id");
            break;
        }
    };
    for (var i=0;i<cSpan.length;i++ )		{
        if ( cSpan[i].className == 'on' )
        {
            p3 = cSpan[i].getAttribute("id");
            break;
        };
    };
    $("#price").html(((p1+p2+p3)*$("#quantity").val()).toFixed(2));
    // oPrice.innerHTML = (p1+p2+p3)*goodsnum;  //屬性數量價格計算賦予總價
};
//商品數量加減選擇
$(function(){
    $("#add").click(function(){
        $("#quantity") .val(parseInt($("#quantity").val())+1);
        $("#min").removeAttr("disabled");                 //当按加1时，解除$("#min")不可读状态
        price();
    })
    $("#min").click(function(){
        if (parseInt($("#quantity") .val())>1) {                     //判断数量值大于1时才可以减少
            $("#quantity").val(parseInt($("#quantity").val())-1)
        }else{
            $("#min").attr("disabled","disabled")        //当$("#min")为1时，$("#min")不可读状态
            alert("商品數量無法選擇為0");
        }
        price();
    })

    price();
})



//商品數量輸入框
function input_price() {
    var input_num = $("#quantity").val();
    $("#price").html(((p1+p2+p3)*$("#quantity").val()).toFixed(2));
}

