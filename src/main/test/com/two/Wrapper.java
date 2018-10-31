package com.two;

public class Wrapper implements Adapt {

    private Sources sources;

    public Wrapper(Sources sources) {
        super();
        this.sources = sources;

    }

    @Override
    public void method1() {
        sources.method1();
    }

    @Override
    public void method2() {
        System.out.println("这是方法二");
    }
}
