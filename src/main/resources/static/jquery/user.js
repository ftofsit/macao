// 更換註冊頁驗證碼
$(function() {
    $("#usercode").click(function(){
        console.log($(this).attr("src"));
        alert("更換圖片");
    })

})
//打開頁面
function open1(ob)
{
   var id=$(ob).attr("name");
   var num = $(".option a").length;
    for( var i=0; i<num; i++    ){
        $(".option a").removeClass("on");
    }
   $(ob).addClass("on");
   $(".usercontent").empty();
    $('.usercontent').load(id);
}

function open2(ob)
{
    var id=$(ob).attr("id");
    var num = $(".option a").length;
    for( var i=0; i<num; i++    ){
        $(".option a").removeClass("on");
    }
    $("a[name*='userinfo']").addClass("on");
    $(".usercontent").empty();
    $('.usercontent').load(id);
}

function open3(ob)
{
    var id=$(ob).attr("id");
    $(".usercontent").empty();
    $('.usercontent').load(id);
}

function open4(ob)
{
    var id=$(ob).attr("id");
    var num = $(".option a").length;
    for( var i=0; i<num; i++    ){
        $(".option a").removeClass("on");
    }
    $("a[name*='userbonus']").addClass("on");
    $(".usercontent").empty();
    $('.usercontent').load(id);
}

//活動詳情
function seedetail(ob)
{
    var id=$(ob).attr("id");
    var num = $(".option a").length;
    for( var i=0; i<num; i++    ){
        $(".option a").removeClass("on");
    }
    $("a[name*='apply']").addClass("on");
    $(".usercontent").empty();
    $('.usercontent').load(id);
}

//用戶名檢查
function checkusernum(){
    var len = $(".login-id").val();
    if( len.length == 0 ){
        $("#usernum_notice").text("用戶名不能為空");
        $(".usernum .error_icon").css("background-position","0 0");
    }
    else if( len.length <4  ){
        $(".usernum .error_icon").css("background-position","0 0");
        $("#usernum_notice").text("");
    }else{
        $(".usernum .error_icon").css("background-position","0 -18px");
        $("#usernum_notice").text("");
    }
}
//用戶密碼檢查
function checkuserpwd(){
    var len = $(".login-pw").val();
    if( len.length == 0 ){
        $("#userpwd_notice").text("登陸密碼不能為空");
        $(".userpwd .error_icon").css("background-position","0 0");
    }
    else if( len.length <4  ){
        $(".userpwd .error_icon").css("background-position","0 0");
        $("#userpwd_notice").text("登錄密碼不能少於4位");
    }else{
        $(".userpwd .error_icon").css("background-position","0 -18px");
        $("#userpwd_notice").text("");
    }
}
//更改密碼code獲取
function checkcode() {
    var len = $(".login-code").val();
    if( len.length == 0 ){
        $("#usercode_notice").text("登陸密碼不能為空");
        $(".usernum .error_icon").css("background-position","0 0");
    }
    else if( len.length <4  ){
        $(".code .error_icon").css("background-position","0 0");
        $("#usercode_notice").text("");
    }else{
        $(".code .error_icon").css("background-position","0 -18px");
        $("#usercode_notice").text("");
    }
}
//檢查用戶登錄
function userlogin() {
    var user =  document.forms['formlogin'];
    var username = user.elements['login-id'].value;
    var userpwd = user.elements['login-pw'].value;
    var usercode = user.elements['login-code'].value;
    var msg = '';

    if ( username.length == 0){
        msg += "用戶名不能為空" + '\n';
    }else if(username.length < 4){
        msg += "用戶名錯誤" + '\n';
    }

    if ( userpwd.length == 0){
        msg += "密碼不能為空" + '\n';
    }else if( userpwd.length < 4 ){
        msg += "密碼錯誤" + '\n';
    }

    if ( usercode.length == 0 ){
        msg += "驗證碼不能為空" + '\n';
    }else if ( usercode.length <4 ){
        msg += "驗證碼錯誤" + '\n';
    }

    if (msg.length > 0)
    {
        alert(msg);
        return false;
    }
    else
    {
        return true;
    }
}

//判斷手機號格式
function check(tel){
    var myreg = /^6\d{7}$/;
    if (!myreg.test(tel)) {
        return false;
    }
    return true;
}
//獲取手機驗證碼
function getscode(){
    var tel = $(".login-tel").val();
    if( check(tel) ){
        alert("手機號正確");
    }else{
        alert("手機號錯誤");
    }

}
//檢查手機號
function checktel(){
    var mobile = $(".login-tel").val();
    if( check(mobile) ){
        $(".telnum .error_icon").css("background-position","0 -18px");
        $("#telnum_notice").text("");
    }else{
        $("#telnum_notice").text("手機號格式錯誤");
        $(".telnum .error_icon").css("background-position","0 0");
    }
}
//檢查code
function checkcode(){
    var code = $(".vcode").val();
    if ( code == "1234" ){
        $(".sms-code .error_icon").css("background-position","0 -18px");
        $("#smscode_notice").text("");
    }else{
        $("#smscode_notice").text("驗證碼錯誤");
        $(".sms-code .error_icon").css("background-position","0 0");
    }
}
//判斷輸入密碼長度
function inputpw(){
    var newpw = $(".new-pw").val();
    if( newpw.length >= 6  ){
        $(".input-pw .error_icon").css("background-position","0 -18px");
        $("#new-pw_notice").text("");
    }else{
        $(".input-pw .error_icon").css("background-position","0 0px");
        $("#new-pw_notice").text("密碼長度不得少於6個字符");
    }
}
//判斷更改密碼中的兩次密碼是否重複
function checkpw(){
    var newpw = $(".new-pw").val();
    var againpw = $(".confirm-pw").val();
    if( newpw ==  againpw  ){
        $(".change-pw .error_icon").css("background-position","0 -18px");
        $("#confirm-pw_notice").text("");
    }else{
        $(".change-pw .error_icon").css("background-position","0 0px");
        $("#confirm-pw_notice").text("兩次密碼輸入不一致");
    }
}
//忘記密碼頁面的數據判斷
function retrievepw(){
    var change =  document.forms['retrieve'];
    var usertel = change.elements['login-tel'].value;
    var vcode = change.elements['vcode'].value;
    var newpw = change.elements['new-pw'].value;
    var confirmpw = change.elements['confirm-pw'].value;
    var msg = '';

    if ( usertel.length == 0){
        msg += "手機號不能為空" + '\n';
    }else if(usertel.length < 8){
        msg += "手機號錯誤" + '\n';
    }

    if ( vcode.length == 0){
        msg += "驗證碼不能為空" + '\n';
    }else if( vcode.length < 4 ){
        msg += "驗證碼位數錯誤" + '\n';
    }

    if ( newpw.length == 0 ){
        msg += "密碼不能為空" + '\n';
    }else if ( newpw.length < 6 ){
        msg += "驗證碼不能少於6位" + '\n';
    }

    if ( newpw != confirmpw ){
        msg += "兩次輸入密碼不一致" + '\n';
    }

    if (msg.length > 0)
    {
        alert(msg);
        return false;
    }
    else
    {
        return true;
        location.href="http://localhost:8080/user?id=resetpwsuccess";
    }
}
//更改密碼頁面數據判斷
function changePassword(){
    var change =  document.forms['change'];
    var newpw = change.elements['new-pw'].value;
    var confirmpw = change.elements['confirm-pw'].value;
    var msg = '';

    if ( newpw.length == 0 ){
        msg += "密碼不能為空" + '\n';
    }else if ( newpw.length < 6 ){
        msg += "驗證碼不能少於6位" + '\n';
    }

    if ( confirmpw == "" ){
        msg += "確認密碼不能為空" + '\n';
    }

    if ( newpw != confirmpw ){
        msg += "兩次輸入密碼不一致" + '\n';
    }

    if (msg.length > 0)
    {
        alert(msg);
        return false;
    }
    else
    {
        return true;
    }
}


function register(){
    var change =  document.forms['register'];
    var usertel = change.elements['login-tel'].value;
    var vcode = change.elements['vcode'].value;
    var newpw = change.elements['new-pw'].value;
    var confirmpw = change.elements['confirm-pw'].value;
    var msg = '';

    if ( usertel.length == 0){
        msg += "手機號不能為空" + '\n';
    }else if(usertel.length < 6){
        msg += "手機號錯誤" + '\n';
    }

    if ( vcode.length == 0){
        msg += "驗證碼不能為空" + '\n';
    }else if( vcode.length < 4 ){
        msg += "驗證碼位數錯誤" + '\n';
    }

    if ( newpw.length == 0 ){
        msg += "密碼不能為空" + '\n';
    }else if ( newpw.length < 6 ){
        msg += "驗證碼不能少於6位" + '\n';
    }

    if ( newpw != confirmpw ){
        msg += "兩次輸入密碼不一致" + '\n';
    }

    if (msg.length > 0)
    {
        alert(msg);
        return false;
    }
    else
    {
        return true;
    }
}
//判斷職業名稱是否輸入
function checkcareer(){
    var career = $(".usercareer").val();
    if ( career == "" ){
        $(".career .error_icon").css("background-position","0 0px");
        $("#usercareer").text("職業不能為空");
    }else{
        $(".career .error_icon").css("background-position","0 -18px");
        $("#usercareer").text("");
    }
}

function checkuser(){
    var username = $(".username").val();
    if(  username.length < 3  ){
        $(".name .error_icon").css("background-position","0 0px");
        $("#userNametip").text("用戶名長度不能少於三個字符");
    }else if(  username == "12345" ){
        $(".name .error_icon").css("background-position","0 0px");
        $("#userNametip").text("用戶名已存在，請重新輸入");
    }else{
        $(".name .error_icon").css("background-position","0px -18px");
        $("#userNametip").text("");
    }
}

function openidcare(){
      $("#idcardinput").click();
}
function openstaffImage() {
    $("#staffImageinput").click();
}


function opeva(){
    $("#easyDialogbox").css("display","block");
    $("#overlay").css("display","block");
    var goods_name = $(".goods_comment").attr("name");
    alert(goods_name);
}


function Commentclose(){
    $("#easyDialogbox").css("display","none");
    $("#overlay").css("display","none");
}

function submitComment(frm) {
    {
        var cmt = new Object;
        cmt.content = frm.elements['content'].value;
        cmt.id = frm.elements['id'].value;
        cmt.order_id = frm.elements['order_id'].value;
        cmt.captcha = frm.elements['captcha'] ? frm.elements['captcha'].value : '';
        cmt.rank = frm.elements['comment_rank'].value;
        for (i = 0; i < frm.elements['comment_rank'].length; i++) {
            if (frm.elements['comment_rank'][i].checked) {
                cmt.rank = frm.elements['comment_rank'][i].value;
            }

            if (cmt.content.length == 0) {
                alert("評論內容不能為空");
                return false;
            }

            if (cmt.captcha.length == 0) {
                alert("驗證碼不能為空");
                return false;
            }

            Ajax.call('comment.php', 'cmt=' + $.toJSON(cmt), commentResponse, 'POST', 'JSON');
            return false;
        }

        /**
         * 处理提交评论的反馈信息
         */
        function commentResponse(result) {
            if (result.message) {
                alert(result.message);
            }

            if (result.error == 0) {
                var layer = document.getElementById('ECS_COMMENT');

                if (layer) {
                    layer.innerHTML = result.content;
                }
            }
            $("#easyDialogbox").css("display","none");
            window.location.reload();
        }
    }
}

function actnum(){
    var year = $("#selPeriods").val();
    alert(year);
}

function bindmobile(){
     var ghphone =  document.forms['formmobile'];
    var usermobile = ghphone.elements['mobile'].value;
    var vcode = ghphone.elements['verifycode'].value;
    var msg = '';

    if ( usermobile.length == 0){
        msg += "手機號不能為空" + '\n';
    }else if(usermobile.length < 8){
        msg += "手機號位數錯誤" + '\n';
    }
    if ( vcode.length == 0){
        msg += "驗證碼不能為空" + '\n';
    }else if( vcode.length < 4 ){
        msg += "驗證碼位數錯誤" + '\n';
    }

    if (msg.length > 0)
    {
        alert(msg);
        return false;
    }
    else
    {
        return true;
    }
}


function returntocart() {
    $num = $(".returncart").val();
    console.log($mun);
}
