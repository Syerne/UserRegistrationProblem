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

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        Assert.assertEquals(true, valid.isValidEmailId("abc.xyz@bl.co.in"));
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        Assert.assertEquals(true, valid.isValidMobileNumber("91 9876543210"));
    }

    @Test
    public void givenPassword1_WhenProper_ShouldReturnFalse() {
        Assert.assertEquals(false, valid.isValidPassword("abc123AB"));
    }

    @Test
    public void givenPassword2_WhenProper_ShouldReturnTrue() {
        Assert.assertEquals(true, valid.isValidPassword("Abc@23AB"));
    }

}
