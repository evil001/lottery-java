$(function(){
	$("#aAddPro").click(function(){
		addTab('divTabs','添加商品','static/html/main_add_pro.html')
	});
	
	$("#aProImg").click(function(){
		addTab('divTabs','添加商品','static/html/product_img.html')
	});
	
	$("#aQueryPro").click(function(){
		addTab('divTabs','商品查询','static/html/query_pro.html')
	});
});