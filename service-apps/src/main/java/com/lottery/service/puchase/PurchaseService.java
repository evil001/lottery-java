package com.lottery.service.puchase;

import java.util.List;

import com.lottery.domain.purchase.Purchase;

public interface PurchaseService {

	List<Purchase> getPurchaseList(List<String> periodList);
}
