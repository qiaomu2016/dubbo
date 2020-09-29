package com.alibaba.dubbo.demo.consumer;

import com.alibaba.dubbo.common.bytecode.ClassGenerator;
import com.alibaba.dubbo.common.bytecode.NoSuchPropertyException;
import com.alibaba.dubbo.common.bytecode.Wrapper;
import com.alibaba.dubbo.demo.DemoService;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/** Wrapper0 是在运行时生成的，大家可使用 Arthas 进行反编译 */
//public class Wrapper0 extends Wrapper implements ClassGenerator.DC {
//    public static String[] pns;
//    public static Map pts;
//    public static String[] mns;
//    public static String[] dmns;
//    public static Class[] mts0;
//
//    /**
//     * ChannelEventRunnable#run()
//     *   —> DecodeHandler#received(Channel, Object)
//     *     —> HeaderExchangeHandler#received(Channel, Object)
//     *       —> HeaderExchangeHandler#handleRequest(ExchangeChannel, Request)
//     *         —> DubboProtocol.requestHandler#reply(ExchangeChannel, Object)
//     *           —> Filter#invoke(Invoker, Invocation)
//     *             —> AbstractProxyInvoker#invoke(Invocation)
//     *               —> Wrapper0#invokeMethod(Object, String, Class[], Object[])
//     *                 —> DemoServiceImpl#sayHello(String)
//     */
//
//
//    @Override
//    public Object invokeMethod(Object object, String string, Class[] arrclass, Object[] arrobject) throws InvocationTargetException {
//        DemoService demoService;
//        try {
//            // 类型转换
//            demoService = (DemoService)object;
//        }
//        catch (Throwable throwable) {
//            throw new IllegalArgumentException(throwable);
//        }
//        try {
//            // 根据方法名调用指定的方法
//            if ("sayHello".equals(string) && arrclass.length == 1) {
//                return demoService.sayHello((String)arrobject[0]);
//            }
//        }
//        catch (Throwable throwable) {
//            throw new InvocationTargetException(throwable);
//        }
//        throw new NoSuchMethodException(new StringBuffer().append("Not found method \"").append(string).append("\" in class com.alibaba.dubbo.demo.DemoService.").toString());
//    }
//
//    // 省略其他方法
//
//    @Override
//    public String[] getPropertyNames() {
//        return new String[0];
//    }
//
//    @Override
//    public Class<?> getPropertyType(String pn) {
//        return null;
//    }
//
//    @Override
//    public boolean hasProperty(String name) {
//        return false;
//    }
//
//    @Override
//    public Object getPropertyValue(Object instance, String pn) throws NoSuchPropertyException, IllegalArgumentException {
//        return null;
//    }
//
//    @Override
//    public void setPropertyValue(Object instance, String pn, Object pv) throws NoSuchPropertyException, IllegalArgumentException {
//
//    }
//
//    @Override
//    public String[] getMethodNames() {
//        return new String[0];
//    }
//
//    @Override
//    public String[] getDeclaredMethodNames() {
//        return new String[0];
//    }
//}