package com.kgisl.qs1;

import java.util.Comparator;

class Id implements Comparator< ConCom> {
    public int compare( ConCom s1, ConCom s2){  
    if(s1.empid==s2.empid)  
    return 0;  
    else if(s1.empid>s2.empid)  
    return 1;  
    else  
    return -1;  
    }


    }  