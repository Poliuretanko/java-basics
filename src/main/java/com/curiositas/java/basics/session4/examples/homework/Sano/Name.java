package com.curiositas.java.basics.session4.examples.homework.Sano;


import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = sc.next();
        System.out.println("Имя пациента " + name);
        if (name.length() <=1) {
            throw new IllegalArgumentException("Wrong");
        }
    }
}

