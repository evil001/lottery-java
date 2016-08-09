package com.lottery.product.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lottery.dao.product.ProductDao;
import com.lottery.dao.product.collect.ProductCollectDao;
import com.lottery.dao.product.detail.ProductDetailDao;
import com.lottery.dao.product.img.ProductImgDao;
import com.lottery.domain.ParamPage;
import com.lottery.domain.prod.Product;
import com.lottery.domain.prod.ProductDetail;
import com.lottery.domain.prod.ProductImg;
import com.lottery.domain.prod.ProductImgCollect;
import com.lottery.mutual.EasyUIMessage;
import com.lottery.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	@Autowired
	private ProductDetailDao productDetailDao;

	@Autowired
	private ProductImgDao productImgDao;

	@Autowired
	private ProductCollectDao productCollectDao;

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
	public EasyUIMessage getProduct(String productName, String createAt, Integer state, ParamPage param) {
		PageHelper.startPage(param.getPage(), param.getRows());
		PageHelper.orderBy(param.getSort().concat(" ").concat(param.getOrder()));
		List<Product> list = this.productDao.getProduct(productName, createAt, state);
		PageInfo<Product> pageInfo = new PageInfo<Product>(list);
		return EasyUIMessage.easyJson(pageInfo.getTotal(), list);
	}

	@Override
	public void updateProduct(Product product) {
		this.productDao.updateProduct(product);
	}

	@Override
	public void saveProductDetail(Long productId, String detailInfo) {
		ProductDetail pd = new ProductDetail(productId, detailInfo, 1, new Date());
		this.productDetailDao.saveProductDetail(pd);
	}

	@Override
	public EasyUIMessage getProductImg(Long productId, int state, String startTime, String endTime, ParamPage param) {
		PageHelper.startPage(param.getPage(), param.getRows());
		PageHelper.orderBy(param.getSort().concat(" ").concat(param.getOrder()));
		List<ProductImg> list = this.productImgDao.getProductImgList(productId, startTime, endTime, state);
		PageInfo<ProductImg> pageInfo = new PageInfo<ProductImg>(list);
		return EasyUIMessage.easyJson(pageInfo.getTotal(), list);
	}

	@Override
	public void updateProductImg(ProductImg img) {
		this.productImgDao.updateProductImg(img);
	}

	@Override
	public EasyUIMessage getProductCollect(String productName, int state, String startTime, String endTime,
			ParamPage param) {
		PageHelper.startPage(param.getPage(), param.getRows());
		PageHelper.orderBy(param.getSort().concat(" ").concat(param.getOrder()));
		List<ProductImgCollect> list = this.productCollectDao.getProductImgCollect(productName, state, startTime,
				endTime);
		PageInfo<ProductImgCollect> pageInfo = new PageInfo<ProductImgCollect>(list);
		return EasyUIMessage.easyJson(pageInfo.getTotal(), list);
	}

}
