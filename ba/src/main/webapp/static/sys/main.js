$(function(){
	$("#aAddPro").click(function(){
		addTab('divTabs','添加商品','static/html/good_manager/main_add_pro.html')
	});
	
	$("#aProImg").click(function(){
		addTab('divTabs','封面管理','static/html/good_manager/product_img.html')
	});
	
	$("#aProImgList").click(function(){
		addTab('divTabs','列表管理','static/html/good_manager/img_list.html')
	});
	
	$("#aQueryPro").click(function(){
		addTab('divTabs','商品查询','static/html/good_manager/query_pro.html')
	});
	
	$("#aCategory").click(function(){
		addTab('divTabs','分类管理','static/html/cms/category.html')
	});
	
	$("#aBanner").click(function(){
		addTab('divTabs','banner管理','static/html/cms/banner_manager.html')
	});
});