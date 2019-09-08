<#-- Layout -->
<#macro layout title mods>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!--[if IE]>
    <meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1'/>
    <![endif]-->

    <title>${title?default('java思维导图')}</title>

    <link rel="stylesheet" href="${base}/res/layui/css/layui.css">
    <link rel="stylesheet" href="${base}/res/css/global.css">

    <script src="${base}/res/layui/layui.js"></script>
    <script src="${base}/res/js/jquery.min.js"></script>
    <script src="${base}/res/js/stomp.js"></script>
    <script src="${base}/res/js/sockjs.js"></script>

</head>
<body>

<#include "/inc/common.ftl" />
<#include "/inc/header.ftl" />

<#nested>

<#include "/inc/footer.ftl" />

<script>
    layui.cache.page = 'jie';
    <#--layui.cache.user = {-->
    <#--    username: '${profile.username!"游客"}'-->
    <#--    ,uid: ${profile.id!'-1'}-->
    <#--    ,avatar: '${profile.avatar!"/res/images/avatar/00.jpg"}'-->
    <#--    ,experience: 0-->
    <#--    ,sex: '${profile.sex!'未知'}'-->
    <#--};-->
    layui.config({
        version: "3.0.0"
        ,base: '/res/mods/'
    }).extend({
        fly: 'index'
    }).use('fly').use('jie').use('user');
</script>

<script>
    // function showTips(count) {
    //     var msg = $('<a class="fly-nav-msg" href="javascript:;">'+ count +'</a>');
    //
    //     var elemUser = $('.fly-nav-user');
    //     elemUser.append(msg);
    //     msg.on('click', function(){
    //         location.href = '/center/message/';
    //     });
    //     layer.tips('你有 '+ count +' 条未读消息', msg, {
    //         tips: 3
    //         ,tipsMore: true
    //         ,fixed: true
    //     });
    //     msg.on('mouseenter', function(){
    //         layer.closeAll('tips');
    //     })
    // }
    <#--$(function () {-->
    <#--    var elemUser = $('.fly-nav-user');-->

    <#--    if(layui.cache.user.uid !== -1 && elemUser[0]){-->
    <#--        var socket = new SockJS("/websocket");-->
    <#--        stompClient = Stomp.over(socket);-->
    <#--        stompClient.connect({},function (frame) {-->
    <#--            //subscribe订阅-->
    <#--            stompClient.subscribe('/user/' + ${profile.id} + '/messCount',function (res) {-->
    <#--                showTips(res.body);-->
    <#--            })-->
    <#--        })-->
    <#--    }-->
    <#--});-->
</script>

<script src="/res/js/chat.js"></script>
<script src="/res/js/im.js"></script>

<#--<script type="application/javascript">-->
    <#--$(function () {-->
        <#--layui.use('layim', function(layim){-->
            <#--//先来个客服模式压压精-->
            <#--layim.config({-->
                <#--brief: true //是否简约模式（如果true则不显示主面板）-->
                <#--,min: true-->
            <#--}).chat({-->
                <#--name: '客服姐姐'-->
                <#--,type: 'friend'-->
                <#--,avatar: 'http://tp1.sinaimg.cn/5619439268/180/40030060651/1'-->
                <#--,id: -2-->
            <#--});-->

            <#--layim.setChatMin(); //收缩聊天面板-->
        <#--});-->
    <#--});-->
<#--</script>-->
</body>
</html>
</#macro>