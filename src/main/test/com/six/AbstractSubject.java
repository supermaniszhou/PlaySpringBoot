package com.six;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {
    private Vector<Observer> vector = new Vector<>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    public void notifyOb() {
        Enumeration<Observer> enumo=vector.elements();
        while(enumo.hasMoreElements()){
            enumo.nextElement().update();
        }
    }
}
