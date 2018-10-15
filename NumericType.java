package com.komnacki;

import java.math.BigDecimal;

public class NumericType implements Comparable<NumericType> {
    String name;
    BigDecimal value;

    public NumericType(String name, BigDecimal value){
        this.name = name;
        this.value = value;
    }

    @Override
    public int compareTo(NumericType o) {
        return value.compareTo(o.value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(name);
        sb.append(" & ").append(value);
        return sb.toString();
    }
}
