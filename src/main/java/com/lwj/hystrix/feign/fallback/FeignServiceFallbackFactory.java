package com.lwj.hystrix.feign.fallback;

import org.springframework.stereotype.Component;

import com.lwj.hystrix.feign.FeignService2;

import feign.hystrix.FallbackFactory;

/**
 * 这种fallback是可以记录下原因的
 * @author linwenjie
 *
 */
@Component
public class FeignServiceFallbackFactory implements FallbackFactory<FeignService2> {

	@Override
	public FeignService2 create(Throwable cause) {
		System.err.println("FeignService 回退：" + cause);
		return new FeignService2() {
			
			@Override
			public String testHystrix() {
				return "fail";
			}
		};
	}

}
