package com.curiositas.java.basics.archive.c07112022.session6.kronos;

import java.util.*;

class InterOperator {
    private Input sc;

    public InterOperator(Input sc){
        this.sc = sc;
    }

    ArrayList<String> setVoteCondition(){
        System.out.println("Lets start new Vote");
        System.out.println("Please enter list of Candidates via comma:");
        String candidates = sc.inputCandidates();
        System.out.println("Please enter list of Voters Lastnames via comma:");
        String voters = sc.inputVoters();
        ArrayList<String> data = new ArrayList<>();
        data.add(candidates);
        data.add(voters);
        return data;
    }

    HashMap<String,String> gatherVotes(int numberOfVoters){
        HashMap<String,String> votes = new HashMap<>();
        System.out.println("Lets starting voting");
        for (int i=1; i<=numberOfVoters; i++) {
            System.out.println("Please enter your Lastname:");
            String voter = sc.inputVoter();
            System.out.println("Please enter your candidate:");
            String choice = sc.inputChoice();
            votes.put(voter,choice);
            System.out.println("Thank you next");
        }
        return votes;
    }

    public void outputResults(String results){
        System.out.println("Please see result of Voting");
        System.out.println(results);
    }

    public String receiveCommand() {
        System.out.println("Please enter command. Available commands:");
        System.out.println("new vote, close vote, detailed info");
        String command = sc.inputCommand();
        if (command.contains("new")) {
            return "new";
        } else if (command.contains("close")) {
            return "close";
        } else if (command.contains("info")) {
            return "info";
        } else {
            System.out.println("You command strange");
            return "strange";
        }
    }

}
