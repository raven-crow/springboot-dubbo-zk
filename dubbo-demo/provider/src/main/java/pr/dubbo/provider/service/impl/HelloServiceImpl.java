package pr.dubbo.provider.service.impl;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;

import pr.dubbo.common.service.HelloService;

/**
 * @author long
 * @date 2018-12-07
 */
@Component
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String param) {
        return "server:"+param;
    }
}
