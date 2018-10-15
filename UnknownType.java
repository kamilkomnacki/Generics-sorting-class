package com.komnacki;

public class UnknownType implements Comparable<UnknownType> {
    private String someData;
    private int someInt;
    private int lenghtOfData;

    public UnknownType(String someData, int someInt){
        this.someData = someData;
        this.someInt = someInt;
        this.lenghtOfData = someData.length();
    }

    @Override
    public int compareTo(UnknownType o) {
        return Integer.compare(someData.length(), o.someData.length());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("'");
        sb.append(someData).append("' & ").append(someInt);
        return sb.toString();
    }
}
