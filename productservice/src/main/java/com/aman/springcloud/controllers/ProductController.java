package com.aman.springcloud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aman.springcloud.model.Coupon;
import com.aman.springcloud.model.Product;
import com.aman.springcloud.repos.ProductRepo;
import com.aman.springcloud.restclients.CouponClient;

import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("/productapi")
public class ProductController {
	@Autowired
	private ProductRepo productRepo;
	@Autowired
	private CouponClient couponClient;
	
	@RequestMapping(value = "/createprod",method = RequestMethod.POST)
	@Retry(name="product-api",fallbackMethod = "handleError")
	public Product createProduct(@RequestBody Product product)
	{
		Coupon coupon = couponClient.getCoupon(product.getCouponCode());
		product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
		return productRepo.save(product);
	}
	
	public Product handleError(@RequestBody Product product,Exception ex)
	{
		System.out.println("inside handlerror");
		return product;
	}

}
