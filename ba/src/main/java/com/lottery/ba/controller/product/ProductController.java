package com.lottery.ba.controller.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lottery.domain.Product;
import com.lottery.mutual.ClientMessage;
import com.lottery.mutual.EasyUIMessage;
import com.lottery.product.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/prod/saveProduct")
	public ClientMessage saveProduct(Product product, @RequestParam("productImg") String productImg,
			@RequestParam String[] productImgList) {
		this.productService.saveProduct(product, productImg, productImgList);
		return ClientMessage.success();
	}

	@RequestMapping("/prod/query")
	public EasyUIMessage queryProduct(@RequestParam(required = false) String productName,
			@RequestParam(required = false) String createAt,
			@RequestParam(defaultValue = "1", required = false) int state, @RequestParam(required = false) String rows,
			@RequestParam(required = false) String page, @RequestParam(required = false) String order,
			@RequestParam(required = false) String sort) {
		System.out.println(rows);
		System.out.println(page);
		System.out.println(productName);
		System.out.println(createAt);
		System.out.println(state);
		System.out.println(order);
		System.out.println(sort);
		return this.productService.getProduct(productName, createAt, state);
	}

	@RequestMapping("/prod/update")
	public ClientMessage updateProduct(Product pro) {
		this.productService.updateProduct(pro);
		return ClientMessage.success();
	}
}
