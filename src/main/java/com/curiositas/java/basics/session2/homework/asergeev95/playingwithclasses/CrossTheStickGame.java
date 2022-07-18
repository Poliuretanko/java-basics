package com.curiositas.java.basics.session2.homework.asergeev95.playingwithclasses;

import java.util.Random;
import java.util.Stack;

public class CrossTheStickGame {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("There are ten sticks ( |||||||||| ). There are two players. A player on his move can cross out either 1, 2 or 3 sticks.\n" +
                "The player who crosses out the last stick is a winner.");
        var pc = new CrossTheStickPCPlayer();
        var player = new CrossTheStickUserPlayer();

        var sticks = new Stack();
        initializeSticks(sticks);

        var isGameFinished = false;
        var isUserMove = determineFirstMove();

        System.out.println("Based on random choice first move is for " + (isUserMove ? "user" : "computer"));
        while (!isGameFinished) {
            if (isUserMove) {
                System.out.println("Now it is " + player.name() + "'s turn to make a move");
                System.out.println("Input number between 1 and 3 to cross out such number of sticks");
                isGameFinished = player.makeMove(sticks);
                if (isGameFinished) {
                    System.out.println("Congrats! " + player.name() + " has won!");
                }
            } else {
                System.out.println("Now it is computer turn to make a move");
                Thread.sleep(2000);
                isGameFinished = pc.makeMove(sticks);
                if (isGameFinished) {
                    System.out.println("Congrats! " + pc.name() + " has won!");
                }
            }
            System.out.println("There are " + sticks.size() + " sticks left");
            isUserMove = !isUserMove;
        }
    }

    private static void initializeSticks(Stack sticks) {
        for (var i = 0; i < 10; i++) {
            sticks.push(i);
        }
    }

    private static boolean determineFirstMove() {
        var random = new Random();
        var randomNumber = random.nextInt(100);
        return randomNumber % 2 == 0;
    }
}
