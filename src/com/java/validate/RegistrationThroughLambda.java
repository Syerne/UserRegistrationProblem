package com.java.validate;

import java.util.regex.Pattern;

@FunctionalInterface
interface Validator {
    static void printResult(Validator fObj, String regex, String input) {
        if (fObj.validate(regex, input))
            System.out.println(input + " : is Verified");
        else
            System.out.println(input + " : is Denied; Enter Validate Input");
    }
    boolean validate(String regex, String input);
}

public class RegistrationThroughLambda {
    public static void main(String[] args) {

        Validator inputVerification = (String regex, String input) -> Pattern.matches(regex, input);

        Validator.printResult(inputVerification, "^[A-Z][a-z]{2,}", "Shubham");
        System.out.println(inputVerification.validate("^[A-Z][a-z]{2,}", "Shubham"));
        Validator.printResult(inputVerification,"^[A-Z][a-z]{2,}", "Sh" );

        Validator.printResult(inputVerification, "^[A-Z][a-z]{2,}", "Yerne");
        Validator.printResult(inputVerification, "^[A-Z][a-z]{2,}", "re");

        Validator.printResult(inputVerification, "[a-zA-Z0-9]+[-.+]?[a-z0-9]*@[a-z0-9]+[.][a-z]{2,3}[.]?[a-z]{0,3}", "abc@gmail.com");
        Validator.printResult(inputVerification, "[a-zA-Z0-9]+[-.+]?[a-z0-9]*@[a-z0-9]+[.][a-z]{2,3}[.]?[a-z]{0,3}", "com.bl@");

        Validator.printResult(inputVerification, "^91 [1-9][0-9]{9}", "91 1112223344");
        Validator.printResult(inputVerification, "^91 [1-9][0-9]{9}", "111222344");

        Validator.printResult(inputVerification, "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&]{1}).{8,}", "@hoWaRe8you");
        Validator.printResult(inputVerification, "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&]{1}).{8,}", "1112223344");
    }

}
