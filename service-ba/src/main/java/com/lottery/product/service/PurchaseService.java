package com.lottery.product.service;

import java.util.Map;

import com.lottery.domain.ParamPage;
import com.lottery.domain.purchase.Purchase;
import com.lottery.mutual.EasyUIMessage;

public interface PurchaseService {

	void savePurchase(Purchase purchase);

	void updatePurchase(Purchase purchase);

	EasyUIMessage getPurchaseAll(ParamPage param);

	Map<String, Object> getPurchaseInES();
}
