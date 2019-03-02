package com.jeremy.eureka_common.service.feign;

import com.jeremy.eureka_common.service.TestService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 Created by 胡杰 on 2019/3/1. */

@FeignClient(name="Eureka-Client-1")
public interface TestFeignService extends TestService {

}
