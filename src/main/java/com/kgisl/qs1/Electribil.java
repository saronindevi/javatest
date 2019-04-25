package com.kgisl.qs1;

import java.util.Scanner;

/**
 * Electribil
 */
public class Electribil {

    public static void main(String[] args) {
        System.out.println("Ebil");
        Scanner sc=new Scanner(System.in);
        System.out.println("customer IDNO:");
        int id=sc.nextInt();
        System.out.println("customer Name:");
        String name=sc.next();
        System.out.println("unit consumed:");
        float unit=sc.nextFloat();
        if(unit<199)
        {
            float a=1.20f;
            float b=unit*a;
            if(b>100){
            System.out.println("customer Idno:"+id+"\n"+"customer name:"+name+"\n"+
            "unit consumed:"+unit);
            }
            else{
                System.out.println("retry");
            }
        }
    }

    
}