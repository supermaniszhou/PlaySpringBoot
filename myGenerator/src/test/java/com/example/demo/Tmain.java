package com.example.demo;

public class Tmain {
    public static void main(String[] args) {
        String path="static/yi/kk.txt";
        System.out.println(path.substring(0,path.lastIndexOf("/")+1));
    }
}
