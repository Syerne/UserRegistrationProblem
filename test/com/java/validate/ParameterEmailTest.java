package com.java.validate;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterEmailTest {
    private String email;
    private boolean expected;
    private  static UserRegistrationProblem validate;

    public ParameterEmailTest(String email, boolean expected) {
        this.email = email;
        this.expected = expected;
    }

    @BeforeClass
    public  static void beforeClass() {
        validate = new UserRegistrationProblem();
    }

    @Test
    public void testEmails() {
        Assert.assertEquals(expected, validate.isValidEmailIds(email));
    }

    @Parameterized.Parameters
    public static Collection emailInputs() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true}
        });
    }
}
