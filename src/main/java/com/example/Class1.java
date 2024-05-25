package com.example;

import static java.lang.Math.*;

public class Class1 {
    public static void main(String[] args) {
        System.out.printf("%.0f\n", SumOfSum());
        int[] test = new int[] {9, 6, 3, 1, 2};
        int[] test2 = new int[] {9, 1, 1, 1, 2};
        BubbleSort(test);
        for (int i : test) {
            System.out.print(i + " ");
        }
        System.out.println();
        InsertSort(test2);
        for (int i : test2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.printf("%f\n", Functions(4));
        System.out.println(SumOfProd());
        }
    public static double SumOfSum ()
    {
        int j, i;
        double Sj = 0, Si = 0;
        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= 8; j++) {
                if (j != i) {
                    Sj += (j * j);
                }
            }
            Si += Sj;
            Sj = 0;
        }
        return Si;
    }
    public static double SumOfProd() {
        int j, i;
        double Pj = 1, Si = 0;
        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= 3; j++) {
                Pj*= ((pow(j, 3)) + (i * i));
            }
            Si += Pj;
            Pj=1;
        }
        return Si;
    }
    public static void BubbleSort(int[] arr) {
        boolean flag = true;
        while (flag){
            flag = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int chaos_temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = chaos_temp;
                    flag = true;
                }
            }
        }
    }
    public static void InsertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j];
                j --;
            }
            arr[j + 1] = curr;
        }
    }

    public static double Functions(double x) {
        double y = 0;
        if (x == 5 || x == 10) {
            y = 1 - x + 5 * pow(x, 3);
        }
        else if (x < 5) {
            y = pow(sin(2), pow(x, 2));
        }
        else if (x > 5 && x < 10) {
            y = (cos(2 * x)) / (pow(sin(x), 2));
        }
        else if (x > 10) {
            y = (x + 5 * cos(PI));
        }
        return y;
    }

}
