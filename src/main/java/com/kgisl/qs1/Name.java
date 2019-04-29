package com.kgisl.qs1;

import java.util.Comparator;

/**
 * NameC
 */
public class Name implements Comparator<ConCom> {

    @Override
    public int compare(ConCom o1, ConCom o2) {
        return o1.name.compareTo(o2.name);
    }

    
}