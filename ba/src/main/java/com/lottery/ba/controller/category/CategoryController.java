package com.lottery.ba.controller.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.druid.util.StringUtils;
import com.lottery.domain.category.ProdType;
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
		if (!StringUtils.isEmpty(categoryName) && !StringUtils.isEmpty(categoryCode)) {
			this.categoryService.saveCategory(categoryName, categoryCode);
			return ClientMessage.success();
		}
		return ClientMessage.faild();
	}

	@RequestMapping("/category/type/all")
	public List<ProdType> getProdType(String categoryCode) {
		return this.categoryService.getProdTypeByCategory(categoryCode);
	}

	@RequestMapping("/category/type/save")
	public ClientMessage saveProdType(String pCode, String typeName, String typeCode) {
		if (StringUtils.isEmpty(pCode) || StringUtils.isEmpty(typeName) || StringUtils.isEmpty(typeCode)) {
			return ClientMessage.faild();
		}
		this.categoryService.saveProdType(pCode, typeName, typeCode);
		return ClientMessage.success();
	}
}
