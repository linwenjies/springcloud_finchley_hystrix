package com.lwj.hystrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lwj.hystrix.feign.FeignService;
import com.lwj.hystrix.feign.FeignService2;

@RestController
@RequestMapping("/hystrixTest")
public class HystrixTestController {

	@Autowired
	private FeignService feignService;
	
	@Autowired
	private FeignService2 feignService2;
	
	/**
	 * 测试断路
	 * @return
	 */
	@GetMapping("/testHystrix")
	public String testHystrix() {
		return feignService.testRetry();
	}
	
	/**
	 * 测试断路2
	 * @return
	 */
	@GetMapping("/testHystrix2")
	public String testHystrix2() {
		return feignService2.testHystrix();
	}
	
}
