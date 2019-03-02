package com.jeremy.eureka_common.service;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 Created by 胡杰 on 2019/3/1. */


@RequestMapping(value = "/client1")
public interface TestService {

    @RequestMapping(value = "/inner/test")
    String innerTest();

}
