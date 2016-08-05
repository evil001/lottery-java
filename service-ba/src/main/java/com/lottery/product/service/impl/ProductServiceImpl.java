package com.lottery.product.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lottery.dao.common.CommonDao;
import com.lottery.dao.product.ProductDao;
import com.lottery.domain.Product;
import com.lottery.mutual.EasyUIMessage;
import com.lottery.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	@Autowired
	private CommonDao commonDao;

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void saveProduct(Product product, String productImg, String[] productImglist) {
		Map<String, Object> map = new HashMap<String, Object>();
		// 添加商品
		product.setState(1);
		product.setCreateAt(new Date());
		this.productDao.saveProduct(product);
		// 添加封面
		map.put("productId", product.getId());
		map.put("productImg", productImg);
		map.put("createAt", new Date());
		map.put("state", 1);
		this.productDao.saveProductImg(map);
		// 添加封面列表
		this.productDao.saveProductImgList(product.getId(), productImglist);
	}

	@Override
	public EasyUIMessage getProduct(String productName, String createAt, Integer state) {
		return new EasyUIMessage(this.commonDao.getObject("tl_product"),
				this.productDao.getProduct(productName, createAt, state));
	}

	@Override
	public void updateProduct(Product product) {
		this.productDao.updateProduct(product);
	}

}
