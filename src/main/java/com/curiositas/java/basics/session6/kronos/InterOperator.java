package com.curiositas.java.basics.session6.kronos;

import java.util.*;


class InterOperator {
    //int NUMBER_OF_VOTERS = 0;
    private final Scanner sc = new Scanner(System.in);

    ArrayList<String> setVoteCondition(){
        System.out.println("Lets start new Vote");
        System.out.println("Please enter list of Candidates via comma:");
        String candidates = sc.nextLine();
        System.out.println("Please enter list of Voters Lastnames via comma:");
        String voters = sc.nextLine();
        ArrayList<String> data = new ArrayList<>();
        //data.add(getNumberOfVoters);
        data.add(candidates);
        data.add(voters);
        return data;
    }

    HashMap<String,String> gatherVotes(int numberOfVoters){
        HashMap<String,String> votes = new HashMap<>();
        System.out.println("Lets starting voting");
        for (int i=1; i<=numberOfVoters; i++) {
            System.out.println("Please enter your Lastname:");
            String voter = sc.nextLine();
            System.out.println("Please enter your candidate:");
            String choice = sc.nextLine();
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
        String command = sc.nextLine();
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
