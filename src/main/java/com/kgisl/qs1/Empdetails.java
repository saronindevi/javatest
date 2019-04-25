package com.kgisl.qs1;

/**
 * Empdetails
 */
public class Empdetails {
 
   private int empid;
   private String name;
    private String dept;
     private float salary;

    public Empdetails(int empid, String name, String dept, float salary) {
        this.empid=empid;
        this.name=name;
        this.dept=dept;
        this.salary=salary;
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
     * @return the dept
     */
    public String getDept() {
        return dept;
    }

    /**
     * @param dept the dept to set
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the empid
     */
    public int getEmpid() {
        return empid;
    }

    /**
     * @param empid the empid to set
     */
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    public String toString(){
        return "id:"+empid+"\tempname:"+name+"\tempdept:"+dept+"\tsalary:"+salary+"\n";

    }
}