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

    public String validateUserRegistration(String firstName, String lastName, String email, String mobileNumber, String password) {
        if (isValidFirstName(firstName) && isValidLastName(lastName) && isValidEmailId(email) && isValidMobileNumber(mobileNumber) && isValidPassword(password))
            return "Happy";
        else
            return "Sad";
    }
    /*public boolean isValidInput(String regex, String userInput){
        boolean result = Pattern.matches(regex, userInput);
        return result;
    }
not work this logic
    public boolean validateUserRegistration(String firstName, String lastName, String email, String mobileNumber, String password) {
        if (isValidInput(FIRST_NAME_REGEX, firstName) && isValidInput(LAST_NAME_REGEX, lastName) && isValidInput(EMAIL_REGEX,email) && isValidInput(MOBILE_NUMBER_REGEX, mobileNumber) && isValidInput(PASSWORD_REGEX, password))
            return true;
        else
            return false;
    }*/
    public boolean isValidEmailIds(String emailId){
        if (isValidInput(EMAIL_REGEX, emailId))
            return true;
        else
            return false;
    }

    private boolean isValidInput(String regex, String name) {
        return Pattern.matches(regex, name);
    }


}
