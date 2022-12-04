package com.curiositas.java.basics.archive.c07112022.session6.kronos;

import java.util.*;
import java.util.Map.Entry;

class VoteValidator {
    final int VOTERS = 1;
    HashMap<String,String> validateAndClean(HashMap<String,String> votes,List<String> votersList){
        List<String> voted = new ArrayList<>();
        for (Entry<String,String> entry: votes.entrySet()){
            voted.add(entry.getKey());
        }
        for (String s : voted) {
            if (!votersList.contains(s)){
                System.out.println("Some strange " + s + " tried to vote.");
                votes.remove(s);
            }
        }
        for (String s : voted){
            if(votes.get(s)==null || votes.get(s).equals("")){
                System.out.println("This voter " + s + "does not vote");
                votes.remove(s);
            }
        }
        return votes;
    }
}
