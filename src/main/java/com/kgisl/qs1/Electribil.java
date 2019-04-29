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
            if(b<100){
            System.out.println("customer Idno:"+id+"\n"+"customer name:"+name+"\n"+
            "unit consumed:"+unit);
            }
            else{
                System.out.println("retry");
            }}

// 200 and above but less than 400	@1.50
// 400 and above but less than 600	@1.80
// 600 and above	@2.00
    else if(unit>=200 && unit<400){
    float c=1.50f;
    float d=unit*c;
    if(d>400){
        float e=d-(d*15/100);
        System.out.println("customer Idno:"+id+"\n"+"customer name:"+name+"\n"+
        "unit consumed:"+unit+"amount charges @rs "+d+"unit: "+c+"\n"+"net amount paid by the customer:"
        +d);
    }
else{
            System.out.println("retry");
        }

    }
{

}
}  
    }
