package com.lottery.ba.controller.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lottery.mutual.ClientMessage;
import com.lottery.product.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@RequestMapping("/category/all")
	public ClientMessage getCategory() {
		return ClientMessage.success(this.categoryService.getCategory());
	}

	@RequestMapping("/category/save")
	public ClientMessage saveCategory(String categoryName, String categoryCode) {
		this.categoryService.saveCategory(categoryName, categoryCode);
		return ClientMessage.success();
	}

	@RequestMapping("/category/type/all")
	public ClientMessage getProdType(String categoryCode) {
		return ClientMessage.success(this.categoryService.getProdTypeByCategory(categoryCode));
	}

	@RequestMapping("/category/type/save")
	public ClientMessage saveProdType(String pCode, String typeName, String typeCode) {
		this.categoryService.saveProdType(pCode, typeName, typeCode);
		return ClientMessage.success();
	}
}
