package com.lwj.hystrix.feign.fallback;

import org.springframework.stereotype.Component;

import com.lwj.hystrix.feign.FeignService;

@Component
public class FeignServiceFallback implements FeignService {

	@Override
	public String testRetry() {
		return "fail";
	}

}
