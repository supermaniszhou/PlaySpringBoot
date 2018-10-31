package com.six;

public interface Subject {

    public void add(Observer observer);

    public void del(Observer observer);

    public void notifyOb();

    public void operation();
}
