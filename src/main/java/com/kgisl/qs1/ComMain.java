package com.kgisl.qs1;
import java.util.ArrayList;
import java.util.Collections;
/**
 * C
 */
public class ComMain{
    public static void main(String[] args) {
        ConCom c1 = new  ConCom(101, "mary", "DD", 12000f);
        ConCom c2 = new  ConCom(55, "amala", "BB", 9000f);
        ConCom c3 = new  ConCom(88,"aruna ", "ZZ", 67000f);
        ConCom c4 = new ConCom(1, "nivi", "AA", 55000f);
    ArrayList< ConCom> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        System.out.println("ID");
        Collections.sort(list,new Id());  
        for( ConCom aa: list){  
        System.out.println(aa.empid+" "+aa.name+" "+aa.salary);  
        } 
        System.out.println("Name");
        Collections.sort(list,new Name());  
        for( ConCom cc: list){  
        System.out.println(cc.empid+" "+cc.name+" "+cc.salary);  
        }  
        System.out.println(" Salary");
        Collections.sort(list,new Salary());  
        for( ConCom bb: list){  
        System.out.println(bb.empid+" "+bb.name+" "+bb.salary);  
        }  
      
        }
  
}