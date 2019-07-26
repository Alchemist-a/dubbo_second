package com.nekopara.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.nekopara.service.HelloService;

/**
 * @author shkstart
 * @create 2019-07-25 18:53
 * @name dubbo - com.nekopara.service.impl    Administrator
 */
@Service(loadbalance = "random")
public class HelloServiceImpl implements HelloService {

    public String show(String name) {
        return "FUCK2 "+name;
    }
}
