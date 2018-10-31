package com.four;

public class BridgeTest {

    public static void main(String[] args) {
        Bridge bridge=new Mybridge();

        Sourceable s1=new SourceSub1();
        bridge.setSourceable(s1);
        bridge.method();

        Sourceable s2=new SourceSub2();
        bridge.setSourceable(s2);
        bridge.method();

    }
}
