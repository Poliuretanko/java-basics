package com.curiositas.java.basics.session6.kronos;

import java.util.HashMap;
import java.util.List;

class VoteCalculation {

    String voteCalculation(HashMap <String,String> votes, List<String> candidates) {
        HashMap<String,Long> candidatesResults = new HashMap<>();
        for (String candidate:candidates) {
            candidatesResults.put(candidate,votes.values().stream().filter(f -> f.equals(candidate)).count());
        }
        return candidatesResults.toString();
    }

}
