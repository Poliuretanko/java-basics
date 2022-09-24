package com.curiositas.java.basics.session6.kronos;


import java.util.Scanner;

public class ConsoleInput implements Input {
    private final Scanner scanner;

    public ConsoleInput() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public String inputVoters() {
        return scanner.nextLine();
    }

    @Override
    public String inputCandidates() {
        return scanner.nextLine();
    }

    @Override
    public String inputVoter() {
        return scanner.nextLine();
    }

    @Override
    public String inputChoice() {
        return scanner.nextLine();
    }

    @Override
    public String inputCommand() {
        return scanner.nextLine();
    }
}
