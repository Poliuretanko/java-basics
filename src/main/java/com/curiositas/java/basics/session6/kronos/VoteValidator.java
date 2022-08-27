package com.curiositas.java.basics.session6.kronos;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Stream;

class VoteValidator {
    final int VOTERS = 1;

    void validateAndClean(List<String> votersList, HashMap<String,String> votes){
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
        for (Map.Entry<String, String> entry : votes.entrySet()) {
            if (entry.getValue()==null || entry.getValue().equals("")){
                System.out.println("This voter does not vote " + entry.getKey());
                votes.remove(entry.getKey());
            }
        }
    }
}
