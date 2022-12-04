package com.curiositas.java.basics.archive.c07112022.session6.kronos;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class VoteValidatorTest {

    @ParameterizedTest
    @MethodSource("wrongTypeOfVotes")
    public void validateAndCleanTest(HashMap<String,String> input, List<String> candidates){
        VoteValidator voteValidator = new VoteValidator();
        HashMap<String,String> result = voteValidator.validateAndClean(input, candidates);
        assertTrue(result.isEmpty());
    }

    public static Stream<Arguments> wrongTypeOfVotes() {
        VoteInformation voteInformation = new VoteInformation();
        List<String> votersList = voteInformation.generateVotersList();
        return Stream.of(
                Arguments.of(voteInformation.generateStrangeVoteInformation(votersList),votersList),
                Arguments.of(voteInformation.generateEmptyVoteInformation(votersList),votersList)
        );
    }

}
