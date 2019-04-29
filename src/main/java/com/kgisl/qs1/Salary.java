package com.kgisl.qs1;

import java.util.Comparator;

class Salary implements Comparator<ConCom> {
    public int compare(ConCom s1,ConCom s2){  
    if(s1.salary==s2.salary)  
    return 0;  
    else if(s1.salary>s2.salary)  
    return 1;  
    else  
    return -1;  
    }


    }  