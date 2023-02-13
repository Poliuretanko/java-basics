package com.curiositas.java.basics.btsydenov;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class VotingApplication {

    static int maxAllowedCandidates = 10;
    static int maximumAttemptsToVote = 3;
    static int totalAmountOfVotes = 0;
    static int sleepInterval = 1500; //in milliseconds
    static int amountOfNotVoted = 0;

    public static void main(String[] args) throws Exception {

        beginTheVoting();

        List<Candidate> candidates = new ArrayList<>();
        initialiseAllCandidates(candidates, AllCandidates.values());

        List<Voter> voters = new ArrayList<>();
        initialiseAllVoters(voters, AllVoters.values());

        Scanner scanner = new Scanner(System.in);

        for (Voter voter : voters) {
            System.out.println("Let's start voting.");
            Thread.sleep(sleepInterval);
            System.out.println("Hello, " + voter.getName() + ", please give your vote to one of the candidates.");

            while (true) {
                int vote = getVoteFromInput(scanner);
                if (isValidVote(vote, AllCandidates.values().length)) {
                    processTheVote(candidates, voters, vote);
                    break;
                } else {
                    voter.addDumbAssCounter();
                    if (isDumbAss(voter.getDumbAssCounter(), maximumAttemptsToVote)) {
                        break;
                    }
                }
            }
        }
        closeVoting(candidates);
    }

    private static int getVoteFromInput(Scanner scanner) {
        int vote;
        try {
            vote = scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("The vote should be given to something(or somebody), it cannot be null.");
        }

        return vote;
    }

    private static void beginTheVoting() throws Exception {
        System.out.println("This is voting application R2D2.");
        Thread.sleep(sleepInterval);
        if (!isValidAmountOfCandidates(AllCandidates.values().length, maxAllowedCandidates)) {
            throw new Exception("The maximum allowed amount of candidates is " + maxAllowedCandidates + ". However, you have " + AllCandidates.values().length + " candidates. Please, correct the list of candidates accordingly");
        }
        if (!isValidAmountOfVoters(AllVoters.values().length)) {
            throw new Exception("Really? You don't have voters? Review your list of voters please, there must be people who will vote.");
        }
        System.out.println("How to vote: Just type the number of the candidate. If you don't want to vote, just type 0.");
        Thread.sleep(sleepInterval);
    }

    private static void processTheVote(List<Candidate> candidates, List<Voter> voters, int vote) {
        if (vote != 0) {
            totalAmountOfVotes++;
            candidates.get(vote -1).addVote();
            candidates.get(vote -1).setPercentageOfVotes(((float) candidates.get(vote -1).getCurrentAmountOfVotes()/ voters.size())*100);
        } else {
            amountOfNotVoted++;
        }
    }

    public static boolean isValidAmountOfCandidates (int amountOfCandidates, int limit) {
        return (amountOfCandidates <= limit);
    }

    public static boolean isValidAmountOfVoters (int amountOfVoters) {
        return (amountOfVoters > 0);
    }

    public static void initialiseAllCandidates(List<Candidate> candidates, AllCandidates[] values) throws InterruptedException {
        // this counter is used for the numbered list of candidates
        AtomicInteger counter = new AtomicInteger(1);
        System.out.println("These are our candidates today:");
        Thread.sleep(sleepInterval);
        for (AllCandidates candidate : values) {
            candidates.add(new Candidate(candidate.toDisplayName()));
        }
        for (Candidate cand : candidates) {
            System.out.println("\t" + counter.getAndIncrement() + ". " + cand.getName());
            Thread.sleep(sleepInterval);
        }
    }

    public static void initialiseAllVoters(List<Voter> voters, AllVoters[] values) {
        for (AllVoters voter : values) {
            voters.add(new Voter(voter.toString()));
        }
    }

    public static boolean isValidVote(int vote, int amountOfCandidates) {
        return (vote >= 0 && vote <=amountOfCandidates);
    }

    public static boolean isDumbAss(int dumbAssCounter, int dumbAssLimit) {
        if (dumbAssCounter == dumbAssLimit) {
            System.out.println("You missed your chance to give your vote.");
            return true;
        } else {
            System.out.println("It seems you made a typo when voting. Please try again and keep in mind that you just need to type the number of the candidate (or 0 for nobody).");
            return false;
        }

    }

    public static Candidate findWinnerOfTheVoting(List<Candidate> candidates) {
        Candidate winner = candidates.get(0);
        for (int i = 1; i < candidates.size(); i++) {
            Candidate currentWinner = candidates.get(i);
            if (currentWinner.getPercentage() > winner.getPercentage()) {
                winner = currentWinner;
            }
        }
        return winner;
    }

    public static void showResults(List<Candidate> candidates) {
        float allCandidatesPercentage = 0;
        for (Candidate candidate : candidates) {
            System.out.println("\t" + candidate.getName() + ": " + candidate.getCurrentAmountOfVotes() + " votes / " + candidate.getPercentage() + "%");
            allCandidatesPercentage += candidate.getPercentage();
        }
        float againstAllPercentage = 100 - allCandidatesPercentage;
        System.out.println("\t" + "Didn't vote: " + amountOfNotVoted + " votes / " + againstAllPercentage + "%");
        Candidate winner = findWinnerOfTheVoting(candidates);
        System.out.println("The winner in this voting is " + winner.getName() + "!");
    }

    public static void closeVoting(List<Candidate> candidates) {
        if ((float) totalAmountOfVotes/AllVoters.values().length >= 0.5) {
            System.out.println("More than 50% of voters have voted, therefore the voting is considered successful. These are the results:");
            showResults(candidates);
        }
    }
}
