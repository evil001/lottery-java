package com.lottery.product.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.dao.category.CategoryDao;
import com.lottery.domain.category.Category;
import com.lottery.domain.category.ProdType;
import com.lottery.product.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDao categoryDao;

	@Override
	public List<Category> getCategory() {
		return this.categoryDao.getCategory();
	}

	@Override
	public void saveCategory(String categoryName, String categoryCode) {
		this.categoryDao.saveCategory(new Category(categoryName, categoryCode, new Date()));
	}

	@Override
	public void saveProdType(String categoryCode, String typeName, String typeCode) {
		this.categoryDao.saveProdType(new ProdType(categoryCode, typeName, typeCode, new Date()));
	}

	@Override
	public List<ProdType> getProdTypeByCategory(String categoryCode) {
		return this.categoryDao.getProdTypeByCategoryCode(categoryCode);
	}

	@Override
	public void updateCategory(Category category) {
		category.setUpdateAt(new Date());
		this.categoryDao.updateCategory(category);
	}

	@Override
	public void updateProdType(ProdType prodType) {
		prodType.setUpdateAt(new Date());
		this.categoryDao.updateProdType(prodType);
	}

}
