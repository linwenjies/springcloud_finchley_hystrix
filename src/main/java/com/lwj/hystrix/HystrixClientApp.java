package com.lwj.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 各个服务实例
 * @author linwenjie
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients//开启feign客户端调用
@EnableHystrix
@EnableHystrixDashboard//开启断路监控面板
public class HystrixClientApp 
{
    public static void main( String[] args ){
        SpringApplication.run(HystrixClientApp.class, args);
    }
}
