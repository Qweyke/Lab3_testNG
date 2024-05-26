package com.example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

public class TestClass2 {
    final Map<String, String> test_base = new HashMap<>();
    @Parameters({"username_reg", "password_reg"})
    @Test(groups = "SignIn")
    public void Test2Reg(String username, String password) {
        boolean expected = true;
        boolean real = Class2.Register(username, password, test_base);
        Assert.assertEquals(expected, real);
    }
    @Parameters({"username_in", "password_in"})
    @Test(dependsOnMethods = {"Test2Reg"}, groups = "SignIn")
    public void Test2LogIn(String username, String password) {
        boolean expected = true;
        boolean real = Class2.LogIn(test_base, username, password);
        Assert.assertEquals(expected, real);
    }
}
