package com.alibaba.fastjson;

import com.alibaba.fastjson.serializer.SerializerFeature;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;

public class TestExternal2 {
    @Test
    public void test_0() throws Exception {
        ExtClassLoader classLoader = new ExtClassLoader();

        Class theClass = classLoader.loadClass("com.alibaba.mock.demo.service.MockDemoService");
        Method[] methods = theClass.getMethods();

        //基本类型
        if (void.class.isPrimitive()) {
            System.out.println("void");
        }
        if (boolean.class.isPrimitive()) {
            System.out.println("boolean");
        }

        for (Method method : methods) {
            System.out.println("name: " + method.getName());

            Class[] paraClassArray = method.getParameterTypes();
            for (Class paraClass : paraClassArray) {
                System.out.println("parameters: " + paraClass);

                Package pkg = paraClass.getPackage();
                if (pkg == null || !pkg.getName().equals("java.lang")) {
                    Object obj = paraClass.newInstance();
                    String kaka = JSON.toJSONString(obj, SerializerFeature.WriteMapNullValue);
                }
            }
        }
    }

    public static class ExtClassLoader
            extends ClassLoader {
        public ExtClassLoader() throws IOException {
            super(Thread.currentThread().getContextClassLoader());

            {
                byte[] bytes;
                InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("external/Demo.clazz");
                bytes = IOUtils.toByteArray(is);
                is.close();

                super.defineClass("com.alibaba.mock.demo.api.Demo", bytes, 0, bytes.length);
            }
            {
                byte[] bytes;
                InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("external/MockDemoService.clazz");
                bytes = IOUtils.toByteArray(is);
                is.close();

                super.defineClass("com.alibaba.mock.demo.service.MockDemoService", bytes, 0, bytes.length);
            }
        }
    }
}
