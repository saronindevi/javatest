package com.kgisl.qs1;

/**
 * Employeee
 */
public class Employeee_ch
 {
    String name;
    int id;
    float salary;
    
    
    public Employeee_ch(){
        this("devi");
    }
    public Employeee_ch (String name)
    {
        this(name, 1);
    }
    public Employeee_ch (String name,int id)
    {
         this(name, 1,70987897);
    }
    public  Employeee_ch  (String name, int sal, float salary)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
    } 
    void print() {
        System.out.println("Employee Name: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("Employee salary: "+salary);
    }
    public static void main(String[] args)
    {
        Employeee_ch obj = new  Employeee_ch ();
        obj.print();
    

}

}

