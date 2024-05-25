package com.example;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TestClass1 {

    @Test(groups = "Sums")
    public void Test1Methode1(){
        double exp_res = 1428;
        double real_res = Class1.SumOfSum();
        Assert.assertEquals(real_res, exp_res, "SumOfSum must return expected result");
    }
    @Test(groups = "Sums")
    public void Test1Methode2(){
        double exp_res = 815688;
        double real_res = Class1.SumOfProd();
        double delta = 0.1;
        Assert.assertEquals(real_res, exp_res, delta, "SumOfSum must return expected result");
    }

    @Test(groups = "Sorts")
    public void Test1Methode3(){
        int[] exp_arr = new int[] {1, 4, 6, 9, 9, 22, 37};
        int[] real_arr = new int[] {9, 9, 1, 4, 6, 22, 37};
        Class1.BubbleSort(real_arr);
        Assert.assertEquals(real_arr, exp_arr, "Arrays must be equaled by bubble");
    }
    @Test(groups = "Sorts")
    public void Test1Methode4(){
        int[] exp_arr = new int[] {0, 1, 6, 9, 37, 39, 72};
        int[] real_arr = new int[] {9, 39, 1, 0, 6, 72, 37};
        Class1.InsertSort(real_arr);
        Assert.assertEquals(real_arr, exp_arr, "Arrays must be equaled by insert");
    }

    @Test
    public void Test1Methode5(){
        double exp_res = 0.218;
        double real_res = Class1.Functions(4);
        double delta = 0.001;
        Assert.assertEquals(real_res, exp_res, delta, "Functions result must return expected result with" +
                " acceptable inaccuracy");
    }

}
