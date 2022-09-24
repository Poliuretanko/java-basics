package com.curiositas.java.basics.session6.kronos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.github.javafaker.Faker;

public class VoteInformation {
    Faker faker = new Faker();
    String candidate = faker.name().firstName();

    HashMap<String,String> generateVoteInformation(List<String> voters){
        HashMap<String,String> votes = new HashMap<>();
        List<String> vote = generateSingleCandidate();
        for (String voter:voters) {
            votes.put(voter,candidate);
        }
        return votes;
    }
    List<String> generateSingleCandidate(){
        List<String> candidateList = new ArrayList<>();
        candidateList.add(candidate);
        return candidateList;
    }

    List<String> generateVotersList(){
        List<String> voters = new ArrayList<>();
        for (int x=1; x<5; x++){
            voters.add(faker.name().firstName());
        }
        return voters;
    }

    HashMap<String,String> generateEmptyVoteInformation(List<String> voters){
        HashMap<String,String> votes = new HashMap<>();
        for (String voter:voters) {
            votes.put(voter,"");
        }
        return votes;
    }

    HashMap<String,String> generateStrangeVoteInformation(List<String> voters){
        HashMap<String,String> votes = new HashMap<>();
        for (String ignored :voters) {
            votes.put(faker.name().firstName(),faker.name().firstName());
        }
        return votes;
    }

}
