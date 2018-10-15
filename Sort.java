package com.komnacki;

import java.util.Collections;
import java.util.List;

public class Sort<T extends Comparable<T>> {
    private List<T> list;

    Sort(List<T> list){
        this.list = list;
    }

    List<T> getSortedList(){
        sort();
        return list;
    }

    private void sort(){
        Collections.sort(list);
    }
}
