package com.three;

public class Proxy implements Sourceable {

    private Source source;

    public Proxy(Source source) {
        this.source = source;
    }

    @Override
    public void method1() {
        before();
        source.method1();
        after();
    }

    public void before() {
        System.out.println("before");
    }

    public void after() {
        System.out.println("after");
    }
}
