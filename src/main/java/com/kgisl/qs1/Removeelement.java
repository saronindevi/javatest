package com.kgisl.qs1;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * Removeelement
 */
public class Removeelement {

  
              public static void main(String[] args){
    
            ArrayList<Object> arr = new ArrayList<Object>();
            
            arr.add("mary");
            arr.add("devi");
            arr.add("aruna");
            arr.add("mary");
            arr.add("aruna");
          
            
        System.out.println("Before Remove Duplicate elements:"+arr);
         
        for(int i=0;i<arr.size();i++){
         
         for(int j=i+1;j<arr.size();j++){
                    if(arr.get(i).equals(arr.get(j))){
                        arr.remove(j);
                        j--;
                    }
            }
         
        }
         
            System.out.println("After Removing duplicate elements:"+arr);
        }
        }
         
        