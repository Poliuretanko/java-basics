package com.curiositas.java.basics.session6.kronos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Vote {
    public static void main(String[] args) {
        final int VOTERS = 1;
        final int CANDIDATES = 0;

        InterOperator interOperator = new InterOperator();
        VoteCalculation voteCalculation = new VoteCalculation();
        VoteValidator voteValidator = new VoteValidator();
        DataPreparation dataPreparation = new DataPreparation();

        while(true) {
            ArrayList<String> voteCondition = interOperator.setVoteCondition();
            int numberOfVoters = dataPreparation.getNumberOfDataElements(voteCondition,VOTERS);
            List<String> candidatesList = dataPreparation.prepareData(voteCondition,CANDIDATES);
            List<String> votersList = dataPreparation.prepareData(voteCondition,VOTERS);
            HashMap<String,String> voteInformation = interOperator.gatherVotes(numberOfVoters);
            voteValidator.validateAndClean(votersList, voteInformation);
            String results = voteCalculation.voteCalculation(voteInformation,candidatesList);
            interOperator.outputResults(results);
            interOperator.receiveCommand();
            /*switch (interOperator.receiveCommand()){
                case "new":
                    continue;
                case "info":
                    interOperator.outputResults(voteInformation.toString());
                default:
                    break;

            }

             */
        }
    }
}
