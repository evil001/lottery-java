package com.lottery.dao.purchase;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lottery.domain.purchase.Purchase;

@Repository
public interface PurchaseDao {

	List<Purchase> getPurchaseList(List<String> list);
}
