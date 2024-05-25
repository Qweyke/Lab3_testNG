package com.example;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

public class TestClass2 {
    final Map<String, String> test_base = new HashMap<>();

    @Test(groups = "SignIn")
    public void Test2Reg() {
        boolean expected = true;
        boolean real = Class2.Register("freddie", "Fred1337", test_base);
        Assert.assertEquals(expected, real, "Real Registration must be equal to expected");
    }
    @Test(dependsOnMethods = {"Test2Reg"}, groups = "SignIn")
    public void Test2LogIn() {
        boolean expected = true;
        boolean real = Class2.LogIn(test_base, "freddie", "Fred1337");
        Assert.assertEquals(expected, real, "Real LogIn must be equal to expected");
    }
}
