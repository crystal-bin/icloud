<#macro userCenterMenus current>
<aside class="us-nav">
    <nav>
        <h3>用户中心</h3>
        <dl>
            <dt>
                <i class="ucnav_07"></i>我的淘宝</dt>
            <dd>
                <a <#if current=="所有链接">class="current"</#if> href="${basepath}/usertb/tbList">所有链接</a>
            </dd>
            <dd>
                <a <#if current=="访问数据">class="current"</#if> href="${basepath}/usertb/trafficCurrentDay">访问数据</a>
            </dd>
            <dd>
                <a <#if current=="总体统计">class="current"</#if> href="${basepath}/usertb/allUrlStatistics">总体统计</a>
            </dd>
        </dl>
        
        <dl>
            <dt>
                <i class="ucnav_22"></i>账户资料</dt>
            <dd>
                <a <#if current=="信息维护">class="current"</#if> href="${basepath}/user/baseUserInfo">信息维护</a>
            </dd>
            <dd>
                <a <#if current=="密码管理">class="current"</#if> href="${basepath}/user/modifyPassword">密码管理</a>
            </dd>
        </dl>
    </nav>
</aside>
</#macro>