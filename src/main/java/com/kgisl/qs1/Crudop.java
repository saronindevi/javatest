package com.kgisl.qs1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Crudop {

    static ArrayList<Crudop1> arraylist = new ArrayList<Crudop1>();

    public static void main(String[] args) {
     create();
     read();
     update();
     delete();

    } 
 static void create() {
 System.out.println(arraylist.isEmpty());
 arraylist.add(new Crudop1(101, "Aruna", "AA", 210000));
 arraylist.add(new Crudop1(102, "amala", "BB", 55000));
 arraylist.add(new Crudop1(103, "mary", "AA", 55000));
 arraylist.add(new Crudop1(104, "devi", "BB", 34000));

 }
    private static void delete() {
      arraylist.clear();
     System.out.println("delete: "+arraylist);

  }
  static void read() {
    System.out.println("read Array List:");
  for(Crudop1 a : arraylist) {
   System.out.print(a.empid+" "+a.name+" "+a.Salary+" "+a.dept); 
  
  } 
}
private static void update() {
  arraylist.set(1, new Crudop1(105, "viji","BB", 24000));
  System.out.println(" Update arraylist :");
 for(Crudop1 e : arraylist) {
 System.out.print(e.empid+" "+e.name+" "+e.Salary+" "+e.dept); 
 } 
 }

}

