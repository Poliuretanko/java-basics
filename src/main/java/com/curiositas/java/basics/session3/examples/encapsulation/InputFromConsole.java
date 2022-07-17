package com.curiositas.java.basics.session3.examples.encapsulation;

import java.util.Scanner;

public class InputFromConsole implements Input {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String read() {
        return scanner.nextLine();
    }
}
