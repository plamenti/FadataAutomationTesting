package com.plamenti;

public class Main {

    public static void main(String[] args) {
        //int productNumber = 103;

//        switch(productNumber){
//            case 100:
//                System.out.println("The product No: " + productNumber);
//            case 101:
//                System.out.println("The product No: " + productNumber);
//                break;
//            case 102:
//                System.out.println("The product No: " + productNumber);
//                break;
//
//            default:
//                System.out.println("NO such product");
//        }
        int result = getProductNumber(100);

        System.out.println("Result: " + result);
    }

    public static int getProductNumber(int productNumber){
        switch(productNumber){
            case 100:
                System.out.println("The product No: " + productNumber);
                return productNumber+1;
            case 101:
                System.out.println("The product No: " + productNumber);
                return productNumber+2;
            case 102:
                System.out.println("The product No: " + productNumber);
                return productNumber+3;

            default:
                System.out.println("NO such product");
                return 0;
        }
    }
}
