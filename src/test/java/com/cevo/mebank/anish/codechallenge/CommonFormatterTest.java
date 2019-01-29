package com.cevo.mebank.anish.codechallenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

@DisplayName("Tests the Function that Provides a formatted LocalDateTimeObject")
public class CommonFormatterTest {

    @DisplayName("Function from CommonFormatter being tested should return a LocalDateTime object")
    @Test
    void testGetLocalDateTimeFromString(){
        Assertions.assertSame(LocalDateTime.class, CommonFormatter.getLocalDateTimeFromString("20/10/2018 19:45:00").getClass());
    }

    @DisplayName("Should return a long value holding 2523 when a string \"25.23\" is passed")
    @Test
    void testStringToLongCurrencyConversion(){
        ;
        Assertions.assertEquals(2523l, CommonFormatter.convertStringCurrencyToLongStorageInCents("25.23"));
    }

    @DisplayName("Should return a String value 25.23 when a long 2523 is passed")
    @Test
    void testLongToDollarDisplayConversion(){
        Assertions.assertEquals("$25.23", CommonFormatter.convertCentValueIntoDollarDisplay(2523));
    }

}
