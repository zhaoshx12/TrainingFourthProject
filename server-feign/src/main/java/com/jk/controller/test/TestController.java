package com.jk.controller.test;

import com.jk.service.test.TestFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app/test")
public class TestController {

    @Autowired
    private TestFeignService testFeignService;

}
