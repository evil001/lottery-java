package com.lottery.dao.category;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.lottery.domain.category.Category;
import com.lottery.domain.category.ProdType;

@Repository
public interface CategoryDao {

	void saveCategory(Category category);

	List<Category> getCategory();

	List<ProdType> getProdTypeByCategoryCode(@Param("categoryCode") String categoryCode);

	void saveProdType(ProdType type);

	void updateCategory(Category category);

	void updateProdType(ProdType type);
}
