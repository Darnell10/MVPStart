package com.example.mvpstart;

public class Calculator {

    public int featureOne (String input){
        int result = 0;
        int inputNumber = Integer.parseInt(input);
        result = inputNumber *10 - 6/3 %2;
        return result;
    }




}
