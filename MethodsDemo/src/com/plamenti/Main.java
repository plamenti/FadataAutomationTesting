package com.plamenti;

public class Main {

    public static void main(String[] args) {
        String clientName = "Pesho";
        String carBrand = "BMW";
        String carModel = "320";
        double carValue = 100000;
        int carAge = 5;

        calculatePremium(clientName, carValue, carAge, carBrand);

        clientName = "Gosho";
        carBrand = "Audi";
        carModel = "A4";
        carValue = 120000;
        carAge = 2;

        calculatePremium(clientName, carValue, carAge, carBrand);
    }

    public static void calculatePremium(String clientName, double carValue, int carAge, String carBrand){
        double basePremium = 0.06;
        double ageBase = 0.01;
        double isBmwValue = 0.00;

        if(isBmw(carBrand)){
            isBmwValue = 0.01;
        }

        double premium = (carValue * basePremium )+ (carValue * carAge * ageBase) + (carValue * isBmwValue);
        System.out.println(clientName + " Premium: " + premium);
    }

    public static boolean isBmw(String carBrand){
        return carBrand == "BMW";
    }
}
