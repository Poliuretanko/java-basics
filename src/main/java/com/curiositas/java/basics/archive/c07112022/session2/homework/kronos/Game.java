package com.curiositas.java.basics.archive.c07112022.session2.homework.kronos;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

import static com.curiositas.java.basics.archive.c07112022.session2.homework.kronos.Game.Figure.maximalFigureIndex;

public class Game {
    private static final Random random = new Random();
    private static final Scanner scan = new Scanner(System.in);
    private static boolean isDraw (Figure pcFigure, Figure userFigure) {
        return pcFigure == userFigure;
    }


    private static Map<String,Boolean> getWinData (Figure pcFigure, Figure userFigure) {
        Map <String,Boolean> winData = new HashMap<>();
        com.curiositas.java.basics.archive.c07112022.session2.homework.kronos.Scissors scissors = new Scissors();
        com.curiositas.java.basics.archive.c07112022.session2.homework.kronos.Stone stone = new Stone();
        com.curiositas.java.basics.archive.c07112022.session2.homework.kronos.Paper paper = new Paper();
        switch (userFigure){
            case Paper -> {if (pcFigure==Figure.Stone) {winData.put(paper.strongness(),paper.isWinner(true));} else {winData.put(paper.strongness(),paper.isWinner(false));}}
            case Stone -> {if (pcFigure==Figure.Scissors) {winData.put(stone.strongness(),stone.isWinner(true));} else {winData.put(stone.strongness(),stone.isWinner(false));}}
            case Scissors ->  {if (pcFigure==Figure.Paper) {winData.put(scissors.strongness(),scissors.isWinner(true));} else {winData.put(stone.strongness(),scissors.isWinner(false));}}
        }
        return winData;
    }

    private static Figure getCustomerFigure(){
        System.out.println("Choose your figure? Please answer 'Stone' or 'Paper' or 'Scissors': ");
        String userFigure = scan.next();
        return Figure.getFigurebyName(userFigure);
    }

    private static Figure generateRandomFigure() {
        var index = random.nextInt(maximalFigureIndex);
        return Figure.getFigureByIndex(index);
    }

    public static void main(String[] args) throws Exception {
        while (true) {
            Figure pcFigure = generateRandomFigure();
            Figure userFigure = getCustomerFigure();
            if (isDraw(pcFigure,userFigure)) {
                System.out.println("It's draw");}
            else {
            Map<String, Boolean> result = getWinData(pcFigure,userFigure);
            Map.Entry<String,Boolean> entry = result.entrySet().iterator().next();
            if (entry.getValue()){
                System.out.println("You win!");
                System.out.println(entry.getKey());
            } else {
                System.out.println("PC wins!");}}
            System.out.println("Would you like to play again? Please answer 'yes' or 'no': ");
            String userAnswer = scan.next();
            if (userAnswer.equals("yes")){
                System.out.println("Next round!!");
            } else {
                System.out.print("Goodbay!");
                break;
            }

        }
    }

    enum Figure {
        Stone(0,"Stone"),
        Scissors(1, "Scissors"),
        Paper(2, "Paper");
        final int index;
        final String name;
        final static int maximalFigureIndex = 2;
        Figure(int index, String name) {
            this.index = index;
            this.name = name;
        }

        public static Figure getFigurebyName(String name) {
            for (var currentName : Figure.values()) {
                if (currentName.name.equals(name)) {
                    return currentName;
                }

            }
            throw new IllegalArgumentException("Incorrect name of Figure " + name);
        }
        public static Figure getFigureByIndex(int index) {
            return Figure.values()[index];
        }
    }

}
