package com.curiositas.java.basics.archive.c07112022.session6.kronos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Vote {
    public static void main(String[] args) {
        final int VOTERS = 1;
        final int CANDIDATES = 0;

        InterOperator interOperator = new InterOperator(new ConsoleInput());
        VoteCalculation voteCalculation = new VoteCalculation();
        VoteValidator voteValidator = new VoteValidator();
        DataPreparation dataPreparation = new DataPreparation();

        ArrayList<String> voteCondition = interOperator.setVoteCondition();
        int numberOfVoters = dataPreparation.getNumberOfDataElements(voteCondition,VOTERS);
        List<String> candidatesList = dataPreparation.prepareData(voteCondition,CANDIDATES);
        List<String> votersList = dataPreparation.prepareData(voteCondition,VOTERS);
        HashMap<String,String> voteInformation = interOperator.gatherVotes(numberOfVoters);
        HashMap<String,String> cleanedVotes = voteValidator.validateAndClean(voteInformation,votersList);
        String results = voteCalculation.voteCalculation(cleanedVotes,candidatesList);
        interOperator.outputResults(results);
    }
}
