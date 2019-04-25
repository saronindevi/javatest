package com.kgisl.qs1;

import java.util.Arrays;
import java.util.List;

/**
 * ArrayToStng
 */
public class ArrayToStng {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("software", "hardware");

        String[] array = list.toArray(new String[0]);

        System.out.println(Arrays.toString(array));

    }

}