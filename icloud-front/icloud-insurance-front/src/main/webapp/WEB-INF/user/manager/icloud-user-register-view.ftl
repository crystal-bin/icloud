<#import "/icloud/icloud-main-container.ftl" as imc/>
<@imc.mainContainer jsFiles=['common/jquery.validate.js','common/messages_cn.js','icloud/register.js'] cssFiles=['icloud/icloud_usercenter.css'] >
<div class="regist">
    <!--regist start-->
    <div class="chief">
        <h3>会员注册</h3>
    </div>
    <div class="message">
        <!--message start-->
        <h3>账号信息</h3>
        <form action="${basepath}/userManager/doRegisterUser" method="post" id="registerForm">
        <table cellpadding="0" cellspacing="0" class="mes_tab">
            <colgroup>
                <col width="150px" />
            </colgroup>
            <tr>
                <td>
                    <i>*</i>用户名</td>
                <td>
                    <input type="text" id="username" name="username"/>
                    <em>字母开头，由4～16个数字或字母组成。</em>
                </td>
            </tr>
            <tr>
                <td>
                    <i>*</i>电子邮箱</td>
                <td>
                    <input id="email" type="text"  name="email"/>
                    <em>此邮箱用户找回密码等服务，请确保地址正确。</em>
                </td>
            </tr>
            <tr>
                <td>
                    <i>*</i>手机号码</td>
                <td class="hint">
                    <input type="text" id="telphone" name="telphone"/>
                    <small>
                        <span></span>请填写手机号码</small>
                </td>
            </tr>
            <tr>
                <td>QQ</td>
                <td>
                    <input type="text" id="qq" name="qq"/>
                </td>
            </tr>
            <tr>
                <td>性别</td>
                <td>
                    <select id="usersex" name="usersex">
						<option value="0">男</option>
						<option value="1">女</option>
					</select>
                </td>
            </tr>
            <tr>
                <td>
                    <i>*</i>设置密码</td>
                <td>
                    <input type="password" id="password" name="password"/>
                    <em>4~20位数字或者字母的组合，区分大小写。</em>
                </td>
            </tr>
            <tr>
                <td>
                    <i>*</i>确认密码</td>
                <td>
                    <input type="password" id="confirm_password" name="confirm_password"/>
                </td>
            </tr>
<tr>
                <td></td>
                <td>
                    <textarea>必有网服务协议
特别提示
欢迎申请使用必有网提供的服务。请服务使用人（以下称"用户"）仔细阅读以下全部内容。如用户不同意本服务协议任意内容，请不要注册或使用必有网络服务。如用户通过进入注册程序，即表示用户与必有网及必有达成协议，自愿接受本服务协议的所有内容。此后，用户不得以未阅读本服务协议内容作任何形式的抗辩。用户注册成功后，必有将给予每个用户一个用户帐号及相应的密码，该用户帐号和密码由用户自行负责保管；用户应当对以其用户帐号进行的所有活动和事件负法律责任。

服务内容
(1) 本网站具体内容由必有网根据实际情况提供，例如新闻资讯、论坛、日记、博客、微博、评论、股票行情、公司信息等。必有网并不承诺服务在开始、变更或者结束时，均事先知会用户。

(2) 本网站的服务若为收费的网络服务，用户使用收费网络服务需要向本网站支付一定的费用。对于收费的网络服务，本网站会在用户使用之前给予用户明确的提示，只有用户根据提示确认其愿意支付相关费用，用户才能使用该等收费网络服务。如用户拒绝支付相关费用，则网站有权不向用户提供该收费网络服务。

(3) 本网站仅提供相关的互联网服务，用户必须自行负责上网设备，如个人电脑、手机或其他上网设备，以及自行解决互联网接入和支付与此服务有关的费用。

服务协议变更
必有网有权在必要时通过在网页上发出公告等合理方式修改本服务协议以及各单项服务的相关协议。用户在享受各项服务时，应当及时查阅了解修改的内容，并自觉遵守本服务协议以及该单项服务的相关协议。用户如继续使用本服务协议涉及的服务，则视为对修改内容的同意；用户在不同意修改内容的情况下，有权停止使用本服务协议涉及的服务。

服务变更、中断或终止
鉴于互联网服务的特殊性，用户同意必有网有权随时变更、中断或终止部分或全部的网络服务（包括收费网络服务）。如变更、中断或终止的网络服务，必有网无需通知用户，也无需对任何用户或任何第三方承担任何责任；

用户资料合法性和真实性
考虑到本网站产品服务的重要性，用户同意：

(1) 提供及时、详尽及准确的个人资料。

(2) 不断更新自己的注册资料，符合及时、详尽准确的要求。所有原始键入的资料将引用为注册资料。

(3) 不冒用他人资料（包括不限于姓名、图片、公司机构名称、昵称等）如果用户提供的资料不准确，不真实，不合法有效，或者冒用他人资料，本网站保留直接修改资料或者结束用户使用必有各项服务的权利。用户同意，用户提供的准确的个人资料作为认定用户与帐号的关联性以及用户身份的唯一证据。用户在享用各项服务的同时，同意接受本网站各类信息服务。

隐私保护
保护用户隐私是本网站基本政策，非经用户许可，必有网保证不对外公开或向第三方提供单个用户的注册资料及用户在使用网络服务时存储在必有网的非公开内容，但下列情况除外：

(1) 遵守有关法律、法规的规定，包括在国家有关机关查询时，提供用户的注册信息、用户在必有的网页上发布的信息内容及其发布时间、互联网地址或者域名。

(2) 保持维护必有网的知识产权和其他重要权利。

(3) 在紧急情况下竭力维护用户个人和社会大众的隐私安全。

(4) 根据本协议相关规定或者必有网认为必要的其他情况下。

免责声明
(1) 用户明确同意其使用必有网服务所存在的风险将完全由其自己承担；因其使用必有网服务而产生的一切后果也由其自己承担，必有网对用户不承担任何责任。

(2) 必有所提供的任何信息（包括但不限于必有官方提供的、必有用户发布的、必有邀请的嘉宾提供的），必有并不能保证其完全实时或完全准确，也不表明必有证实其描述或赞同其观点。所有内容仅供参考，不构成投资建议或者其他实际的操作意见，用户据此操作所造成的后果自行负责。

(3) 必有财和旗下必有不保证服务一定能满足用户的要求，也不保证服务不会中断，对服务的及时性、安全性、准确性也都不作保证。对于各种原因造成的网络服务中断、资料丢失、数据损毁或其他缺陷，必有网和旗下必有不承担任何责任。

(4) 用户明确同意使用必有网的风险由用户个人承担。对于所有的用户注册资料、姓名、身份、发言内容以及其他行为，必有网拒绝提供任何担保。

(5) 用户知晓并且同意，对于必有网因为计算机系统、网络安全等问题，而导致用户资料意外泄漏，必有网并不对此负责。除非用户能证明，该泄漏是由于必有网的故意行为。

内容的所有权
(1) 内容的定义包括：文字、软件、声音、相片、视频、图表等。

(2) 用户同意，其发布上传到必有网旗下必有的任何内容，必有网获得其全世界范围内免费的、永久性的、不可撤销的、非独家的、完全许可的权利和许可。必有网有权将内容用于其他合法用途，包括但不限于部分或者全部地复制、修改、改编、翻译、组装、分拆、推广、分发、广播、表演、演绎、出版。

用户责任和义务
用户独立承担其发布内容相关的所有责任。用户对必有服务的使用必须遵守所有适用于服务的地方法律、国家法律和国际法律。用户已经知晓并且承诺：

(1) 用户在必有网的网页上发布信息或者利用必有网的服务时必须符合中国有关法律法规，不得在必有网的网页上或者利用必有网的服务制作、复制、发布、传播以下信息：

违反宪法确定的基本原则的；

危害国家安全，泄露国家秘密，颠覆国家政权，破坏国家统一的；

损害国家荣誉和利益的；

煽动民族仇恨、民族歧视，破坏民族团结的；

破坏国家宗教政策，宣扬邪教和封建迷信的；

散布谣言，扰乱社会秩序，破坏社会稳定的；

散布淫秽、色情、赌博、暴力、恐怖或者教唆犯罪的；

侮辱或者诽谤他人，侵害他人合法权益的；

煽动非法集会、结社、游行、示威、聚众扰乱社会秩序的；

以非法民间组织名义活动的；

含有法律、行政法规禁止的其他内容的。

(2) 用户在必有网的网页上发布信息或者利用必有网的服务时还必须符合其他有关国家和地区的法律规定以及国际法的有关规定。

(3) 用户发表在必有网上的任何内容，必有网可以根据自己标准和立场进行管理或者删除，而无需提前或者事后向用户说明；管理或者删除的标准，也完全由必有网独立制订，无需征求用户意见，也无需向用户公开。

(4) 用户不得以任何方式干扰必有网的服务。

(5) 用户应遵守必有网的所有其他规定和程序。

(6) 用户须对自己在使用必有网服务过程中的行为承担法律责任。用户承担法律责任的形式包括但不限于：对受到侵害者进行赔偿，以及在必有网首先承担了因用户行为导致的行政处罚或侵权损害赔偿责任后，用户应给予必有网等额的赔偿。

(7) 用户理解，如果必有网发现其网站传输的信息明显属于上段第(1)条所列内容之一，依据中国法律，必有网有义务立即停止传输，保存有关记录，向国家有关机关报告，并且删除含有该内容的地址、目录或关闭服务器。

(8) 用户使用必有网电子公告服务，包括电子布告牌、电子白板、电子论坛、网络聊天室和留言板等以交互形式为上网用户提供信息发布条件的行为，也须遵守本条的规定。若用户的行为不符合以上提到的服务协议，必有网将作出独立判断立即取消用户服务帐号或者其他有必要的措施。

帐号的有效期限
用户在必有网注册的帐号，如果连续超过3个月没有登录，必有网有权删除用户的帐号，而无需另行通知。

通知和送达
用户知晓并且同意，必有网的各类通知，通过网页公告、系统通知、官方管理帐号通知（公开或者私下）、电子邮件或者常规信件进行，通知发出时，即被视为已送达收件人。 用户对必有网的通知，需要通过必有网正式公布的通信地址、传真号码、电子邮件地址等联系信息进行送达。

适用法律和管辖权
本协议适用中华人民共和国的法律，并且排除一切冲突法规定的适用。 如出现纠纷，用户和必有网一致同意将纠纷交由必有网所在地法院管辖。

解释权
在法律允许的最大范围内，必有网保留对本服务协议的最终解释权。

修订时间
本协议最后修订时间：2014年6月10日
                    </textarea>
                </td>
            </tr>
             <tr>
                <td></td>
                <td>
                    <label>
                        <input type="checkbox" id="readContract" name="readContract"/>我已阅读并同意以上协议</label>
                </td>
            </tr>
            <tr>
                <td></td>
                <td>
                    <a class="adaptiveButton brightRed_btn" id="register_button">
                        <span class="left"></span>
                        <span class="center">注 册</span>
                        <span class="right"></span>
                    </a>
                </td>
            </tr>
        </table>
        </form>
    </div>
</div>
<!--regist end-->
</@imc.mainContainer>