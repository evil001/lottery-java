package com.lottery.dao.category;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lottery.domain.category.Category;
import com.lottery.domain.category.ProdType;

@Repository
public interface CategoryDao {

	void saveCategory(Category category);

	List<Category> getCategory();

	List<ProdType> getProdTypeByCategoryCode(String categoryCode);

	void saveProdType(ProdType type);
}
