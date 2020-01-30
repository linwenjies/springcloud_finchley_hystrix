package com.lwj.hystrix.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.lwj.hystrix.feign.fallback.FeignServiceFallback;

/**
 * 验证断路器
 * @author linwenjie
 *
 */
@FeignClient(value = "eureka-client", fallback = FeignServiceFallback.class)
public interface FeignService {
	
	/**
	 * 下面是一个简单的调用，具体的接口的入参协议，返回值协议，可以自定义设置consumes与produces
	 * @return
	 */
	@GetMapping(value = "/ribbonTest/testRetry")
	public String testRetry();
	
}
