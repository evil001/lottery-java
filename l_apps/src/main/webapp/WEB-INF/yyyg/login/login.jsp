<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link rel="stylesheet" type="text/css" href="/resources/css/comm.css" />
<link rel="stylesheet" type="text/css" href="/resources/css/layout.css" />
</head>
<body>
	<div class="wrapper">
		<div class="g-logo-top g-logo-width">
			<a rel="nofollow" href="http://www.yyyg.com" class="transparent-png fl">
				<img src="img/logo.png">
			</a>
			<span class="fr"><a href="http://www.yyyg.com">返回首页</a></span>
		</div>
		<input name="hidLoginForward" type="hidden" id="hidLoginForward" value="http://www.1yyg.com/">
		<input name="hidQQAppID" type="hidden" id="hidQQAppID" value="100511748">
		<input name="hidWxAppID" type="hidden" id="hidWxAppID" value="wxe61d43f2e02a5b10"> 
		<input name="hidAccount" type="hidden" id="hidAccount">

		<div class="g-login-con clrfix" id="g_login" style="background: #54b1ff url(https://safeimg.1yyg.com/Poster/20150710114148673.jpg) top center no-repeat;">
			<div class="m-login-screen clrfix">
				<div id="loadingPicBlock" class="screen-left fl"></div>
				<div id="div_screen-right" class="screen-right fr">
					<!-- addClass block-code -->
					<div class="login-panel" id="LoginForm">
						<dl>
							<dt>
								<em class="fl">登录</em>
								<a id="hylinkRegisterPage" tabindex="7" class="fr orange" href="register.html?forward=http%3a%2f%2fwww.1yyg.com%2f">免费注册<i class="passport-icon"></i></a>
							</dt>
							<dd>
								<div class="register-form-con clrfix  ">
									<ul id="loginContainerUl">
										<li class="">
											<input id="username" type="text" maxlength="100" tabindex="1" autocomplete="off" value="" style="color: rgb(187, 187, 187);"> <b class="passport-icon user-name transparent-png"></b>
											<em style="">手机号/邮箱地址</em> 
											<a id="a_clear" href="javascript:;" class="passport-icon" style="display: none;"></a>
										</li>
										<li>
											<input id="pwd" type="password" maxlength="20" tabindex="2" value=""> 
											<b class="passport-icon login-password transparent-png"></b> 
											<em style="">密码</em>
											<div class="key-capital gray6" style="display: none;" id="key_capital">
												<i class="passport-icon"></i>键盘大写已锁定，请注意大小写！<b><s></s></b>
											</div>
										</li>
										<li id="vcCodeContainerLi" style="display: none;">
											<div class="vc-wrapper" id="vcCodeTopContainer">
												<div class="vc-btn-container" id="dragBtnContainer">
													<div class="vc-slide-text">
														<span>请按住滑块，拖动到最右边</span>
													</div>
													<div class="vc-slideBtnLeft" id="dragBtnLeft">
														<span class="canvas-Title" style="display: none;">请点击图中的"<strong
															id="selectedChar"></strong>"字
														</span> 
														<span class="canvas-Title" style="display: none;">验证通过！</span>
														<a href="javascript:;" id="refreshVcCode" class="passport-icon refresh" style="display: none;"></a>
													</div>
													<div class="vc-slideBtn ui-draggable ui-draggable-handle" id="dragBtn">
														<i class="passport-icon ready-status"></i>
													</div>
												</div>
												<div class="canvas-wrapper" style="display: none;">
													<div class="canvas-container" id="canvasContainer" style="">
														<img id="vcCanvas" class="vc-canvas" src="" alt="" style="width: 306px;">
													</div>
												</div>
											</div>
										</li>
									</ul>
								</div>
							</dd>
							<dd class="error-message orange" style="display: none;" id="dd_error_msg"></dd>
						</dl>
						<p>
							<a id="btnSubmitLogin" href="javascript:;" class="z-agreeBtn" tabindex="3">登录</a>
						</p>
						<div class="other-login">
							<a id="hylinkGetPassPage" tabindex="4" class="gray9 forget" href="findpassword.html?forward=http%3a%2f%2fwww.1yyg.com%2f">忘记密码？</a>
							<em class="line"></em>
							<div class="fr">
								<span>快捷登录：</span> 
								<a id="qq_login_btn" href="javascript:;" class="qq-icon" tabindex="5">
									<b class="passport-icon transparent-png"></b>
								</a> 
								<a id="wx_login_btn" href="javascript:;" class="wx-icon" tabindex="6">
									<b class="passport-icon transparent-png"></b>
								</a>
							</div>
						</div>
						<ul id="j-tips-wrap" class="j-tips-wrap j-login-page">
						</ul>
					</div>
					<div class="wx-login clrfix" id="wxLogin" style="display: none;">
						<h2 class="gray3">微信登录</h2>
						<p id="p_code"></p>
						<a id="a_return" href="javascript:;"></a>
					</div>
				</div>
			</div>
		</div>
		<jsp:include page="./common/footer.jsp"/>
	</div>
</body>
</html>