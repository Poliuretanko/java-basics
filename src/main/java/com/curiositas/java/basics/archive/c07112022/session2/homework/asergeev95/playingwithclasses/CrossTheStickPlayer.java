package com.curiositas.java.basics.archive.c07112022.session2.homework.asergeev95.playingwithclasses;

import java.util.Stack;

public abstract class CrossTheStickPlayer implements GamePlayer, Name {
    public boolean makeMove(Stack sticks, int numberOfSticksToCrossOut){
        var isGameFinished = false;
        for (var i = 0; i< numberOfSticksToCrossOut; i++){
            if(sticks.empty()){
                isGameFinished = true;
                break;
            }else{
                sticks.pop();
            }
        }
        return isGameFinished || sticks.empty();
    }
}
