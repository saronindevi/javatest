package com.kgisl.qs1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * EmDetailsStream
 */
public class EmDetailsStream {
    public static void main(String[] args) {
        
    
    List<Empdetails> arr = Arrays.asList(new Empdetails(101,"vijay","AA",50000),
    new Empdetails(101,"vijay","AA",52000),
    new Empdetails(102,"raja","cc",60000),
    new Empdetails(103,"anbu","cc",570000),
    new Empdetails(104,"arun","AA",550000),
    new Empdetails(105,"viji","cc",750000),
    new Empdetails(106,"vijaya","AA",540000));
    System.out.println(arr);
    System.out.println("**************");
    System.out.print("Total salary of all employees:");
  
   double f1=arr.stream().mapToDouble(Empdetails::getSalary).sum();
   System.out.print(f1);
   System.out.println("---------");
   System.out.print("\nTotal Salary of AA-dept: ");
   Predicate<Empdetails> pre= x -> x.getDept() == "AA";
   List<Empdetails> f2 = arr.stream().filter(pre).collect(Collectors.toList());
   double f3 = f2.stream().mapToDouble(Empdetails::getSalary).sum();
   System.out.print(f3);
   System.out.println("---------");
    System.out.print("\n Total Salary of cc-dept: ");
 Predicate<Empdetails> pred=x->x.getDept()=="cc";
 List<Empdetails>f4=arr.stream().filter(pred).collect(Collectors.toList());
 double f5=f4.stream().mapToDouble(Empdetails::getSalary).sum();
 System.out.print(f5);
 System.out.println("---------");
 arr.stream().max(Comparator.comparing(z -> z.getSalary() + "dept:" + z.getDept()))
    .ifPresent(m->System.out.println("dept highest Salary:"+m));
    arr.stream().min(Comparator.comparing(z->z.getSalary()+"dept:"+z.getDept())).
    ifPresent(m->System.out.println("dept lowest Salary:"+m));
    
    }

    
}
