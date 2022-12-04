package com.curiositas.java.basics.archive.c07112022.session6.kronos;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class InterOperatorTest {

    @Test
    public void setVoteConditionTest(){
        Input input = mock(Input.class);
        when(input.inputCandidates()).thenReturn("Vasya,Misha");
        when(input.inputVoters()).thenReturn("Kolya,Dima");
        InterOperator interOperator = new InterOperator(input);
        var setVoteConditionResult = interOperator.setVoteCondition();
        assertEquals("Vasya,Misha",setVoteConditionResult.get(0));
        assertEquals("Kolya,Dima",setVoteConditionResult.get(1));
    }

    @Test
    public void gatherVotesTest(){
        int NUMBER_VOTERS = 1;
        Input input = mock(Input.class);
        when(input.inputVoter()).thenReturn("Misha");
        when(input.inputChoice()).thenReturn("Dima");
        InterOperator interOperator = new InterOperator(input);
        var setVoteConditionResult = interOperator.gatherVotes(NUMBER_VOTERS);
        assertTrue(setVoteConditionResult.containsKey("Misha") && setVoteConditionResult.containsValue("Dima"));
    }

}
