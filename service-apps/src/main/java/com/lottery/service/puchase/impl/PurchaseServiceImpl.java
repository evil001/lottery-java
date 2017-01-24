package com.lottery.service.puchase.impl;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.dao.purchase.PurchaseDao;
import com.lottery.domain.purchase.Purchase;
import com.lottery.service.puchase.PurchaseService;

@Service
public class PurchaseServiceImpl implements PurchaseService {

	@Autowired
	private PurchaseDao purchaseDao;

	@Override
	public List<Purchase> getPurchaseList(List<String> perodsList) {
		return this.purchaseDao.getPurchaseList(perodsList);
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		String val = URLDecoder.decode("3%7C4%7C8676200%2C62%2C1%7C8386692%2C46%2C1%7C8392266%2C209%2C2", "UTF-8");
		System.out.println(val);
		String[] arr = val.split("|");
		String totalCount = arr[0];
		String totalMoney = arr[1];
		System.out.println(totalCount);
		System.out.println(totalMoney);
		// for (String string : arr) {
		// System.out.println(string);
		// }
	}
}
