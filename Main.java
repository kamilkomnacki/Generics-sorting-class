package com.komnacki;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<NumericType> numbers = new ArrayList();
        numbers.add(new NumericType("Jeden", BigDecimal.ONE));
        numbers.add(new NumericType("Dziesiec", BigDecimal.valueOf(10)));
        numbers.add(new NumericType("Pi", BigDecimal.valueOf(3.14)));
        numbers.add(new NumericType("Piecdziesiat piec", BigDecimal.valueOf(55)));
        numbers.add(new NumericType("Minus cztery", BigDecimal.valueOf(-4)));
        System.out.println("Numbers before sorting:");
        System.out.println(numbers);

        Sort<NumericType> sortNumericType = new Sort<>(numbers);
        System.out.println("Numbers after sorting:");
        System.out.println(sortNumericType.getSortedList());

        System.out.println("-------------------------------------------");

        List<UnknownType> unknowns = new LinkedList<>();
        unknowns.add(new UnknownType("Kamil", 5));
        unknowns.add(new UnknownType("TPO", 45));
        unknowns.add(new UnknownType("UP", -120));
        unknowns.add(new UnknownType("Alfabetyczny-wyraz", 47));
        unknowns.add(new UnknownType("Kamil", 4));
        System.out.println("Unknowns before sorting:");
        System.out.println(unknowns);

        Sort<UnknownType> sortUnknownType = new Sort<>(unknowns);
        System.out.println("Unknown after sorting:");
        System.out.println(sortUnknownType.getSortedList());
        numbers.get(0).name = "asd";

    }
}
