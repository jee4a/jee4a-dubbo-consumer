package com.jee4a.dubbo.consumer.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jee4a.dubbo.provider.rpc.exceptions.ApiException;
import com.jee4a.dubbo.provider.rpc.interfaces.ProductRpcService;
import com.jee4a.dubbo.provider.rpc.model.ProductModel;

/**
 * <p></p> 
 * @author tpeng 2018年1月8日
 * @email 398222836@qq.com
 */
@Service
public class ProductService    {

	@Resource
	private ProductRpcService productRpcService ;
	/** 
	 * @author tpeng 2018年1月8日
	 * @email 398222836@qq.com
	 */
	public ProductModel queryProductById(Integer productId) {
		if(productId ==null || productId<=0) {
			throw new ApiException(-10000,"productId 不能为空");
		}
		ProductModel model = productRpcService.queryProductById(productId) ;
		if(null != model ) {
			System.out.println(model.toString()) ;
		} 
		return model;
	}

}
