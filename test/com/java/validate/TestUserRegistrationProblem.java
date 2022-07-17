package com.java.validate;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestUserRegistrationProblem {

    static UserRegistrationProblem valid;
    @BeforeClass
    public static void beforeClass(){
        valid = new UserRegistrationProblem();
    }

    @Test
    public void givenFirstName_whenProper_shouldReturnTrue() {
        boolean result = valid.isValidFirstName("Shubham");
        Assert.assertTrue(result);
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue(){
        boolean result = valid.isValidLastName("Yerne");
        Assert.assertTrue(result);
    }
}
