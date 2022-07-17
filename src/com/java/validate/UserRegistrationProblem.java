package com.java.validate;

import java.util.regex.Pattern;

public class UserRegistrationProblem {
    private static final String FIRST_NAME_REGEX = "[A-Z][a-z]{2,}";

    public boolean isValidFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_REGEX);
        return pattern.matcher(firstName).matches();
    }
}
