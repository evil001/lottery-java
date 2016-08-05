<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BA后台系统</title>
<link rel="stylesheet" type="text/css" href="static/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="static/themes/icon.css">
<script type="text/javascript" src="static/third-js/jquery.min.js"></script>
<script type="text/javascript" src="static/third-js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="static/third-js/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="static/uploadify/jquery.uploadify.min.js"></script>
<script type="text/javascript" src="static/sys/common.js"></script>
</head>
<body class="easyui-layout" data-options="fit:true">
	<div region="north" split="false" style="height: 70px;">
		
	</div>
	<div region="south" split="false" style="height: 40px;">
	
	</div>
	<div region="west" title="菜单栏" split="true" style="width: 120px;">
		<div class="easyui-accordion" fit="true" style="width: 100%px;">
			<div title="商品管理" style="text-align: -webkit-center;">
				<a href="#" id="aAddPro" class="easyui-linkbutton" data-options="plain:true" style="width: 103px;padding-left: 5px;">添加商品</a>
				<a href="#" id="aAddPro" class="easyui-linkbutton" data-options="plain:true" style="width: 103px;padding-left: 5px;">封面管理</a>
				<a href="#" id="aAddPro" class="easyui-linkbutton" data-options="plain:true" style="width: 103px;padding-left: 5px;">列表管理</a>
				<a href="#" id="aQueryPro" class="easyui-linkbutton" data-options="plain:true" style="width: 103px;padding-left: 5px;">商品查询</a>
			</div>
			<div title="CMS">
				
			</div>
			<div title="用户管理">
			
			</div>
		</div>
	</div>
	<div region="center" style=" width: 100%px;">
		<div class="easyui-tabs" fit="true" id="divTabs">
			<div title="欢迎页" style="overflow:hidden;">
            	<h3>你好，欢迎来到权限管理系统</h3>  
			</div>
		</div>		
	</div>
<script type="text/javascript" src="../../static/sys/main.js"></script>
</body>
</html>