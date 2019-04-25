package com.kgisl.qs1;

import java.util.Scanner;

/**
 * Employee
 */
public class Employee {
    // int empid;
    // String name;
    // String dept;
    // float salary;
    int empid;
    String name;
    String dept;
    float salary;

    public void create() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the empid :");
        empid = in.nextInt();
        System.out.print("Enter the name : ");
        name = in.next();
        System.out.print("Enter the salary :");
        salary = in.nextFloat();

    }

    public void display() {
        System.out.println("Employee id :" + empid);
        System.out.println("Employee name : " + name);
        System.out.println("Employee salary : " + salary);

    }

}
