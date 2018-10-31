package com.six;

public class MySubject extends AbstractSubject {
    @Override
    public void operation() {
        System.out.println("operation self");
        notifyOb();
    }
}
