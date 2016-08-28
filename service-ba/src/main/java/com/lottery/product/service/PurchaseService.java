package com.lottery.product.service;

import java.util.List;
import java.util.Map;

import com.lottery.domain.ParamPage;
import com.lottery.domain.purchase.Purchase;
import com.lottery.mutual.EasyUIMessage;

public interface PurchaseService {

	void savePurchase(Purchase purchase);

	void updatePurchase(Purchase purchase);

	EasyUIMessage getPurchaseAll(ParamPage param);

	List<Map<String, Object>> getSyncPurchaseData();

	Map<String, Object> getPurchaseInES();
}
