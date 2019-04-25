package com.kgisl.qs1;
import java.util.Comparator;

import java.util.Arrays;

/**
 * Comparatorrr
 */
public class Comparatorrr implements Comparable< Comparatorrr> {
    private int empid;
    private String empname;
    private float salary;
    public Comparatorrr (int id, String name,  float salary) {
        this.empid = id;
        this.empname = name;
        this.salary = salary;
    }

    /**
     * @return the empid
     */
    public int getEmpid() {
        return empid;
    }

    /**
     * @return the salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }

    /**
     * @return the empname
     */
    public String getEmpname() {
        return empname;
    }

    /**
     * @param empname the empname to set
     */
    public void setEmpname(String empname) {
        this.empname = empname;
    }

    /**
     * @param empid the empid to set
     */
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    @Override
    public int compareTo(Comparatorrr com) {
        return 0;
    }


   
public String toString() {
 return "[getid"+empid+"\tgetempname:"+empname+"\tgetsalary:"+salary+"]";

}

//     Comparatorrr com[0]=new Comparatorrr(2, "devi", 50000);
//     Comparatorrr com[1] =new Comparatorrr(1, "aruna", 10000);
//     Comparatorrr com[2]=new Comparatorrr(3, "abi", 56653);


// Arrays.sort(com);
// System.out.println(""+Arrays.toString(com));

}

  