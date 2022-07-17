package com.java.validate;

import java.util.regex.Pattern;

public class UserRegistrationProblem {
    private static final String FIRST_NAME_REGEX = "[A-Z][a-z]{2,}";
    private static final String LAST_NAME_REGEX = "[A-Z][a-z]{2,}";

    public boolean isValidFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_REGEX);
        return pattern.matcher(firstName).matches();
    }
    public boolean isValidLastName(String lastName){
        boolean b = Pattern.matches(LAST_NAME_REGEX, lastName);
        return b;
    }
}
