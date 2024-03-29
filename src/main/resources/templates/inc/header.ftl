<div class="fly-header layui-bg-black">
    <div class="layui-container">
        <a class="fly-logo" href="/">
            <img src="/res/images/logo.png" alt="layui">
        </a>
        <ul class="layui-nav fly-nav layui-hide-xs">
            <li class="layui-nav-item layui-this">
                <a href="/"><i class="iconfont icon-jiaoliu"></i>交流</a>
            </li>
            <li class="layui-nav-item">
                <a href="http://www.java-mindmap.com"><i class="iconfont icon-iconmingxinganli"></i>社区</a>
            </li>
            <li class="layui-nav-item">
                <a href="http://www.layui.com/" target="_blank"><i class="iconfont icon-ui"></i>框架</a>
            </li>
        </ul>

        <ul class="layui-nav fly-nav-user">

<#--            <@shiro.guest>-->
            <!-- 未登入的状态 -->
            <li class="layui-nav-item">
                <a class="iconfont icon-touxiang layui-hide-xs" href="/login"></a>
            </li>
            <li class="layui-nav-item">
                <a href="/login">登入</a>
            </li>
            <li class="layui-nav-item">
                <a href="/register">注册</a>
            </li>
<#--            </@shiro.guest>-->

<#--            <@shiro.user>-->
<#--            <!-- 登入后的状态 &ndash;&gt;-->
<#--            <li class="layui-nav-item">-->
<#--              <a class="fly-nav-avatar" href="javascript:;">-->
<#--                <cite class="layui-hide-xs"><@shiro.principal property="username" /></cite>-->
<#--                <i class="iconfont icon-renzheng layui-hide-xs" title="认证信息：layui 作者"></i>-->
<#--                <i class="layui-badge fly-badge-vip layui-hide-xs">VIP<@shiro.principal property="vipLevel" /></i>-->
<#--                <img src="<@shiro.principal property="avatar" />">-->
<#--              </a>-->
<#--              <dl class="layui-nav-child">-->
<#--                <dd><a href="${base}/center/setting"><i class="layui-icon">&#xe620;</i>基本设置</a></dd>-->
<#--                <dd><a href="${base}/center/message"><i class="iconfont icon-tongzhi" style="top: 4px;"></i>我的消息</a></dd>-->
<#--                <dd><a href="${base}/center"><i class="layui-icon" style="margin-left: 2px; font-size: 22px;">&#xe68e;</i>我的主页</a></dd>-->
<#--                <hr style="margin: 5px 0;">-->
<#--                <dd><a href="/logout" style="text-align: center;">退出</a></dd>-->
<#--              </dl>-->
<#--            </li>-->
<#--            </@shiro.user>-->
        </ul>
    </div>
</div>