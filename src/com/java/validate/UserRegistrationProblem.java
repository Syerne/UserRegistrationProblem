package com.java.validate;

import java.util.regex.Pattern;

public class UserRegistrationProblem {
    private static final String FIRST_NAME_REGEX = "[A-Z][a-z]{2,}";
    private static final String LAST_NAME_REGEX = "[A-Z][a-z]{2,}";
    private static final String EMAIL_REGEX = "^[0-9a-zA-Z]+([.+_*-][0-9a-zA-Z]+)*@([0-9a-zA-Z][-]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";

    private static final String MOBILE_NUMBER_REGEX = "^[91]{2}[ ][6789]{1}[0-9]{9}$";

    private static final String PASSWORD_REGEX = "(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&]{1}).{8,}";

    public boolean isValidFirstName(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_REGEX);
        return pattern.matcher(firstName).matches();
    }

    public boolean isValidLastName(String lastName) {
        boolean result = Pattern.matches(LAST_NAME_REGEX, lastName);
        return result;
    }

    public boolean isValidEmailId(String emailId) {
        boolean result = Pattern.matches(EMAIL_REGEX, emailId);
        return result;
    }

    public boolean isValidMobileNumber(String mobileNumber) {
        boolean result = Pattern.matches(MOBILE_NUMBER_REGEX, mobileNumber);
        return result;
    }

    public boolean isValidPassword(String password) {
        boolean result = Pattern.matches(PASSWORD_REGEX, password);
        return result;
    }
}
