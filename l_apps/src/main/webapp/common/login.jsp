<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="divRTLogin" class="cartLogin-wrapper clrfix" style="display: none; height:230px;">
	<div class="cartLogin-title" style="display: block;">
	    <a href="https://passport.1yyg.com/register.html" target="_blank" class="orange fr">免费注册<em class="f-tran">&gt;&gt;</em></a>登录
	</div>
	<div class="cartLogin-con clrfix" style="display: block;">
	                 <ul>
	                     <li>
	                         <p class="z-zhangh">
	                             <label class="z-clump-icon"></label>
	                             <input type="text" value="" placeholder="手机号/邮箱" id="username">
	                         </p>
	                     </li>
	                     <li>
	                         <p class="z-mim">
	                             <label class="z-clump-icon"></label>
	                             <input type="password" value="" placeholder="密码" id="password">
	                         </p>
	                     </li>
	<li id="vcCodeContainerLi" style="display: none;">
	 <div class="vc-wrapper">
	     <div class="vc-btn-container" id="dragBtnContainer">
	         <div class="vc-slide-text"><span>请按住滑块，拖动到最右边</span></div>
	         <div class="vc-slideBtnLeft" id="dragBtnLeft">
	             <span class="canvas-Title" style="display: none;">请点击图中的"<strong id="selectedChar"></strong>"字</span>
	             <span class="canvas-Title" style="display: none;">验证通过！</span>
	             <a href="javascript:;" class="passport-icon refresh" id="refreshVcCode" style="display: none;"></a>
	         </div>
	         <div class="vc-slideBtn" id="dragBtn"><i class="passport-icon ready-status"></i></div>
	     </div>
	     <div class="canvas-wrapper" style="display: none;">
	         <div class="canvas-container" id="canvasContainer" style="">
	                <img id="vcCanvas" class="vc-canvas" src="" alt="验证码">
	            </div>
	        </div>
	    </div>
	</li>
	        <li class="f-error-message orange" id="miniLoginErrorMsgLi"></li>
	        <li class="cart-login-btn"><input type="button" name="vCode" value="登录" id="miniLoginBtn"></li>
	        <li class="f-wjpwd">
	            <a class="gray9 fl" href="https://passport.1yyg.com/findpassword.html" target="_blank">忘记密码？</a>
	            <span class="fr">快捷登录：
	                <a href="javascript:;" id="btnQQLogin" class="z-clump-icon qq-login"></a>
	                <a href="javascript:;" id="btnWXLogin" class="z-clump-icon wx-login"></a>
	            </span>
	        </li>
	    </ul>
	</div>
	
	<div class="wxLogin-con clrfix" style="display: none;">
	        <h2>微信登录</h2>
	        <p id="wxLoginImgContainer"></p>
	        <a href="javascript:;"></a>
	    </div>
	    <a class="delete-close"></a>
	</div>