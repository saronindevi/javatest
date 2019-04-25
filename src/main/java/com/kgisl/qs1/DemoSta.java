package com.kgisl.qs1;

public class DemoSta extends Der1 {
    {
        System.out.println(" initial block");
    }
    static {
        System.out.println("static block");
    }
 
    public DemoSta() {
        System.out.println("der1 Constructor");
    }
    public static void main(String[] args) {
        new DemoSta();
    }
 }