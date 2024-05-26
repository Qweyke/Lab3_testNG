package com.example;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TestClass2Alt {
    final Map<String, String> test_base = new HashMap<>();

    @DataProvider(name = "register_provider")
    public Object[][] RegBase(){
        return new Object[][] {
                {"Daniel", "Mypass2007"},
                {"Semien", "12345"},
                {"nerd", "9Super9Mega9PaSsSWord22333319"},
                {"1", "Imfirstmfck1111"}
        };
    }
    @Test(groups = "SignIn", dataProvider = "register_provider")
    public void FullAuthorize(String username, String password) {
        boolean expectedReg = true;
        boolean realReg = Class2.Register(username, password, test_base);
        Assert.assertEquals(expectedReg, realReg, "Registration fail!");

        if (new Random().nextInt(100) < 30) {
            password = "WrongPassword123";
        }
        boolean expectedLogIn = true;
        boolean realLogIn = Class2.LogIn(test_base, username, password);
        Assert.assertEquals(expectedLogIn, realLogIn, "Log in fail!");
    }
}
