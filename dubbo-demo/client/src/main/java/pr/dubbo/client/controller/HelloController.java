package pr.dubbo.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

import pr.dubbo.common.service.HelloService;

/**
 * @author long
 * @date 2018-12-07
 */
@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello(String name){
        return helloService.hello(name);
    }
}
