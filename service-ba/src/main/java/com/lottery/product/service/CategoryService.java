package com.lottery.product.service;

import java.util.List;

import com.lottery.domain.category.Category;
import com.lottery.domain.category.ProdType;

public interface CategoryService {

	List<Category> getCategory();

	List<ProdType> getProdTypeByCategory(String categoryCode);

	void saveCategory(String categoryName, String categoryCode);

	void saveProdType(String categoryCode, String typeName, String typeCode);

	void updateCategory(Category category);

	void updateProdType(ProdType prodType);
}
