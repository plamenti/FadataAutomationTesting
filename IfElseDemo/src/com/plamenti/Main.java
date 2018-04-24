package com.plamenti;

import java.util.Random;

public class Main{

    public static void main(String[] args){
        String quotationId = "";

        // This code generates 0 or 1 randomly
        Random r = new Random();
        int nextInt = r.nextInt(2);

        System.out.println(nextInt);

        // This code simulates generating of the quotationId
        // If nextInt is 1, quotationId is generated
        // If nextInt is 0, quotationId is not generated
        if(nextInt == 1){
            quotationId = "Generated";
        }

        // This code verifies if quotationId has some value
        // Verification is if the string has length greater than 0
        // If the result from the expression is TRUE - SUCCESS
        // If the result is FALSE - FAIL
        if(quotationId.length() > 0){
            System.out.println("SUCCESS! QuotationId is generated");
        }else{
            System.out.println("BIG FAIL! QuotationId is NOT generated");
        }

        System.out.println("This part of code is after the IF statement and will be executed no matter what is the result");
    }
}
