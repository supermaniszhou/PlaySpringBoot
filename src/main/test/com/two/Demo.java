package com.two;

public class Demo {
    public static void main(String[] args) {
//        imple im = new imple();
//        im.method2();
//        im.method1();

        Sources s=new Sources();
        Wrapper wrapper = new Wrapper(s);
        wrapper.method1();
        wrapper.method2();

    }
}
