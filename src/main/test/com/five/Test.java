package com.five;

public class Test {
    public static void main(String[] args) {
        AbstractCalculator a = new Plus();
        int num = a.calculate(8, 8);
        int snum=a.calculate("9+9","\\+");
        System.out.println(num);
        System.out.println(snum);

    }
}
