package com.curiositas.java.basics.session5.examples;

import java.util.*;

public class Step18_2Collections {
    public static void main(String[] args) {
        //ArrayList and LinkedList
        outputArrayListWithIterator();
        sortAndOutputLinkedListWithFor();

        //HashSet and TreeSet
        outputHashSet();
        outputTreeSet();

        //HashMap
        outputHashMap();
    }

    private static void outputArrayListWithIterator() {
        var numbers = new ArrayList<Integer>();
        fillTheCollection(numbers);
        System.out.println("ArrayList = " + numbers);

        var numbersIterator = numbers.iterator();
        while (numbersIterator.hasNext()) {
            var currentNumber = numbersIterator.next();
            System.out.println("Current value is " + currentNumber);
        }
        Integer firstNumber = numbers.get(0);
        System.out.println("The first number is " + firstNumber);
    }

    private static void sortAndOutputLinkedListWithFor() {
        var numbers = new LinkedList<Integer>();
        fillTheCollection(numbers);
        System.out.println("LinkedList = " + numbers);

        var sortedNumbers = numbers.stream().sorted().toList();

        for (var currentNumber : sortedNumbers) {
            System.out.println("Current value is " + currentNumber);
        }
    }

    private static void outputHashSet() {
        var numbers = new HashSet<Integer>();
        fillTheCollection(numbers);
        System.out.println("HashSet = " + numbers);

        for (var currentNumber : numbers) {
            System.out.println("Current value is " + currentNumber);
        }
    }

    private static void outputTreeSet() {
        var numbers = new TreeSet<Integer>();
        fillTheCollection(numbers);
        System.out.println("TreeSet = " + numbers);

        for (var currentNumber : numbers) {
            System.out.println("Current value is " + currentNumber);
        }
    }

    private static void outputHashMap() {
        var personInformationMap = new HashMap<String, String>();
        personInformationMap.put("name", "John");
        personInformationMap.put("age", "20");
        System.out.println("HashMap = " + personInformationMap);

        for (var entry : personInformationMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + "; Value = " + entry.getValue());
        }

        var name = personInformationMap.get("name");
        System.out.println("Name is " + name);

        personInformationMap.put("name", "Kate");
        name = personInformationMap.get("name");
        System.out.println("Name is " + name);
    }

    private static void fillTheCollection(Collection<Integer> numbers) {
        numbers.add(6);
        numbers.add(3);
        numbers.add(3);
        numbers.add(5);
    }
}
