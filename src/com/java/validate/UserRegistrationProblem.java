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
        try {
            if (pattern.matcher(firstName).matches()) {
                return true;
            } else
                throw new InvalidUserInformationException("INVALID_FIRST_NAME", InvalidUserInformationException.ExceptionType.INVALID_FIRST_NAME);
        } catch (InvalidUserInformationException e) {
            System.out.println(e);
        }
        return true;
    }

    public boolean isValidLastName(String lastName) {
        boolean result = Pattern.matches(LAST_NAME_REGEX, lastName);
        try {
            if (result) {
                return result;
            } else {
                throw new InvalidUserInformationException("INVALID_LAST_NAME", InvalidUserInformationException.ExceptionType.INVALID_LAST_NAME);
            }
        } catch (InvalidUserInformationException e) {
            System.out.println(e);
        }
        return true;
    }

    public boolean isValidEmailId(String emailId) {
        boolean result = Pattern.matches(EMAIL_REGEX, emailId);
        try {
            if (result) {
                return result;
            } else {
                throw new InvalidUserInformationException("INVALID_EMAIL_ID", InvalidUserInformationException.ExceptionType.INVALID_EMAIL_ID);
            }
        } catch (InvalidUserInformationException e) {
            System.out.println(e);
        }
        return true;
    }

    public boolean isValidMobileNumber(String mobileNumber) {
        boolean result = Pattern.matches(MOBILE_NUMBER_REGEX, mobileNumber);
        try {
            if (result) {
                return result;
            } else {
                throw new InvalidUserInformationException("INVALID_MOBILE_NUMBER", InvalidUserInformationException.ExceptionType.INVALID_MOBILE_NUMBER);
            }
        } catch (InvalidUserInformationException e) {
            System.out.println(e);
        }
        return true;
    }

    public boolean isValidPassword(String password) {
        boolean result = Pattern.matches(PASSWORD_REGEX, password);
        try {
            if (result == true) {
                return result;
            } else {
                throw new InvalidUserInformationException("INVALID_PASSWORD", InvalidUserInformationException.ExceptionType.INVALID_PASSWORD);
            }
        } catch (InvalidUserInformationException e) {
            System.out.println(e);
        }
        return true;
    }

    public String validateUserRegistration(String firstName, String lastName, String email, String mobileNumber, String password) {
        try {
            if (isValidFirstName(firstName) && isValidLastName(lastName) && isValidEmailId(email) && isValidMobileNumber(mobileNumber) && isValidPassword(password))
                return "Happy";
            else
                throw new InvalidUserInformationException("INVALID_GROUP_INFORMATION", InvalidUserInformationException.ExceptionType.INVALID_GROUP_INFORMATION);
        } catch (InvalidUserInformationException e) {
            System.out.println(e);
        }
        return "Sad";
    }

    public boolean isValidEmailIds(String emailId) {
        try {
            if (isValidInput(EMAIL_REGEX, emailId))
                return true;
            else
                throw new InvalidUserInformationException("INVALID_EMAIL_ID", InvalidUserInformationException.ExceptionType.INVALID_EMAIL_ID);
        } catch (InvalidUserInformationException e) {
            System.out.println(e);
        }
        return false;
    }

    private boolean isValidInput(String regex, String name) {
        return Pattern.matches(regex, name);
    }


}
