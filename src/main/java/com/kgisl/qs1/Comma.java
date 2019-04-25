package com.kgisl.qs1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Comma
 */
public class Comma {
    public static void main(String[]args){

String commaSeparated ="item1 , item2 , item3";

ArrayList<String>items = new ArrayList<String>(Arrays.asList(commaSeparated.split(",")));
System.out.println(items);

}

}
