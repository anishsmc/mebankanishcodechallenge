package com.cevo.mebank.anish.codechallenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.stream.Stream;

@DisplayName("Test the Code Challenge")
public class CodeChallengeTest {

    @DisplayName("Say something about this")
    @Test
    void testTransformation(){
        Stream<String> stringStream = Mockito.mock(Stream.class);
        Assertions.assertSame(ArrayList.class, CodeChallenge.transformStreamToTransactions(stringStream).getClass());
    }

}
