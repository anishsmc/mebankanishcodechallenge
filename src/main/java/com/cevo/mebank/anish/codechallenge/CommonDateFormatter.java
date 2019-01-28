package com.cevo.mebank.anish.codechallenge;

import java.time.LocalDateTime;

public class CommonDateFormatter {

    public static LocalDateTime getLocalDateTimeFromString(String input) {
        return LocalDateTime.parse(input, GlobalConstants.formatter);
    }
}
