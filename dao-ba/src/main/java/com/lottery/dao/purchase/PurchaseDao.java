package com.lottery.dao.purchase;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.lottery.domain.purchase.Purchase;

@Repository
public interface PurchaseDao {

	void savePurchase(Purchase purchase);

	void updatePurchase(Purchase purchase);

	List<Purchase> getPurchaseAll();

	List<Map<String, Object>> getSyncPurchaseData();

	Map<String, Object> getPurchaseInES();
}
