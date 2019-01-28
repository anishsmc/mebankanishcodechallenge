package com.cevo.mebank.anish.codechallenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

@DisplayName("Tests the Function that Provides a formatted LocalDateTimeObject")
public class CommonDateFormatterTest {

    @DisplayName("Function from CommonDateFormatter being tested should return a LocalDateTime object")
    @Test
    void testGetLocalDateTimeFromString(){
        Assertions.assertSame(LocalDateTime.class, CommonDateFormatter.getLocalDateTimeFromString("20/10/2018 19:45:00").getClass());
    }
}
