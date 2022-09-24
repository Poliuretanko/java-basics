package com.curiositas.java.basics.session6.kronos;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.HashMap;
import java.util.stream.Stream;

public class VoteCalculationTest {

    public static Stream<Arguments> TrueVotes() {
        VoteInformation voteInformation = new VoteInformation();
        List<String> votersList = voteInformation.generateVotersList();
        String expectedCount = "4";
        return Stream.of(
                Arguments.of(voteInformation.generateVoteInformation(votersList),voteInformation.generateSingleCandidate(),expectedCount)
        );
    }

    @ParameterizedTest
    @MethodSource("TrueVotes")
    public void voteCalculationTest(HashMap <String,String> input, List<String> candidates, String expectedCount){
        VoteCalculation voteCalculation = new VoteCalculation();
        String result = voteCalculation.voteCalculation( input, candidates);
        assertTrue(result.contains(expectedCount));
    }
}
