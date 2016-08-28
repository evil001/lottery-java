package com.lottery.product.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lottery.dao.purchase.PurchaseDao;
import com.lottery.domain.ParamPage;
import com.lottery.domain.purchase.Purchase;
import com.lottery.mutual.EasyUIMessage;
import com.lottery.product.service.PurchaseService;

@Service
public class PurchaseServiceImpl implements PurchaseService {

	@Autowired
	private PurchaseDao purchaseDao;

	@Override
	public void savePurchase(Purchase purchase) {
		purchase.setState(1);
		purchase.setCreateAt(new Date());
		this.purchaseDao.savePurchase(purchase);
	}

	@Override
	public void updatePurchase(Purchase purchase) {
		purchase.setUpdateAt(new Date());
		this.purchaseDao.updatePurchase(purchase);
	}

	@Override
	public EasyUIMessage getPurchaseAll(ParamPage param) {
		PageHelper.offsetPage(param.getPage(), param.getRows());
		PageHelper.orderBy("pc." + param.getSort().concat(" ").concat(param.getOrder()));
		List<Purchase> list = this.purchaseDao.getPurchaseAll();
		PageInfo<Purchase> pageInfo = new PageInfo<Purchase>(list);
		return EasyUIMessage.easyJson(pageInfo.getTotal(), list);
	}

	@Override
	public Map<String, Object> getPurchaseInES() {
		return this.purchaseDao.getPurchaseInES();
	}

	@Override
	public List<Map<String, Object>> getSyncPurchaseData() {
		return this.purchaseDao.getSyncPurchaseData();
	}

}
