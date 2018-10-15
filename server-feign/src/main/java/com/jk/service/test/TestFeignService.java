package com.jk.service.test;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("server-client")
public interface TestFeignService extends TestService {

}
