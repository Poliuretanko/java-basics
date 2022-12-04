package com.curiositas.java.basics.archive.c07112022.session2.homework.asergeev95.playingwithclasses;

import java.util.Scanner;
import java.util.Stack;

public class CrossTheStickUserPlayer extends CrossTheStickPlayer {
    private String name;
    public CrossTheStickUserPlayer() {
        super();
        System.out.println("Please, input user name");
        var userName = new Scanner(System.in).nextLine();
        this.name = userName;
    }

    @Override
    public boolean makeMove(Stack sticks) {
        var scanner = new Scanner(System.in);
        var numberOfSticksToCrossOut = Integer.parseInt(scanner.nextLine());
        return super.makeMove(sticks, numberOfSticksToCrossOut);
    }

    @Override
    public String name() {
        return this.name;
    }
}
