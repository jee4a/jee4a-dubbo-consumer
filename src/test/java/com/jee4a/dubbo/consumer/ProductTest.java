package com.jee4a.dubbo.consumer;

import javax.annotation.Resource;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.jee4a.dubbo.consumer.common.utils.JsonUtils;
import com.jee4a.dubbo.consumer.service.ProductService;
import com.jee4a.dubbo.provider.rpc.model.ProductModel;


/**
 * 测试用例
 * <p></p> 
 * @author tpeng 2018年1月8日
 * @email 398222836@qq.com
 */
@Component
public class ProductTest extends BaseJunitTest {

	private static Logger logger = LoggerFactory.getLogger(ProductTest.class) ;
	
	@Resource
	private ProductService productService ;
	
	@Test
	public void test0() {
		ProductModel model = productService.queryProductById(1) ;
		logger.error("product:{}", JsonUtils.toJson(model)); 
	}
	
}
