package com.kgisl.qs1;

import java.util.Scanner;

/**
 * MilesToKm
 */
public class MilesToKm {

    public static double miletokm(double dis){
        return dis*1.609;
    }
    public static double kmtomile(double dist){
        return dist*0.621;

    }
    public static void main(String[] args) {
        System.out.println("enter the values");
        Scanner sc=new Scanner(System.in);
        double dis=sc.nextDouble();
        System.out.println("miletokm"+miletokm(dis));
        System.out.println("enter the values");
        Scanner sca=new Scanner(System.in);
        double dist=sc.nextDouble();
        System.out.println("kmtomile"+kmtomile(dist));
        

    }
}