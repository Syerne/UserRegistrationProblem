package com.java.validate;

import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistrationProblem {


    @Test
    public void givenFirstName_whenProper_shouldReturnTrue() {
        UserRegistrationProblem valid = new UserRegistrationProblem();
        boolean result = valid.isValidFirstName("Shubham");
        Assert.assertTrue(result);
    }
}
