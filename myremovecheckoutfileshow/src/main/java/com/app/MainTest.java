package com.app;

public class MainTest {

    public static void main(String[] args){
        MainTest mt = new MainTest();
        System.out.println("My testing line 0:  "+mt.add(2,6) );
    }

    public int add(int a, int b){
        return a+b;
    }

    public int multiple(int a, int b){
        return a * b;
    }
}
