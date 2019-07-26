package com.nekopara.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.nekopara.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author shkstart
 * @create 2019-07-25 19:30
 * @name dubbo - com.nekopara.controller    Administrator
 */
@Controller
@RequestMapping("/demo")
public class HelloController {

    @Reference(check = false,loadbalance = "random")
    private HelloService helloService;

    @RequestMapping("hello")
    @ResponseBody
    public String getMsg(String name){
        String show = helloService.show(name);
        System.out.println(show);
        return show;
    }
}
