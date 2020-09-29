package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.demo.HelloService;
import com.alibaba.dubbo.rpc.RpcContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author kun.yi
 * @Description HelloServiceImpl
 * @Date 2020/6/4
 * -- 岁月不居，天道酬勤，只争朝夕，不负韶华  --
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) throws Throwable {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddress();
    }
}
