package com.plamenti;

public class Main {

    public static void main(String[] args) {
        //printSomething();
        //printSomething("Tanya");
        //printSomething(2);
        int count = 10;

        // For loop
//        for(int i = 0; i < count; i++){
//            printSomething(i);
//        }

        // While loop
//        int i = 0;
//
//        while(i < count){
//            printSomething(i);
//
//            i++;
//        }

        // Do While loop
//        int i = 10;
//
//        do{
//            printSomething(i);
//
//            i++;
//        }while(i < count);


        int[] eggs = new int[16];

//        for(int egg: eggs){
//            cookEgg();
//        }

        for(int i = 0; i < eggs.length; i++){
            if( i % 2 == 0){
                System.out.println(i);
                cookEgg();
            }

        }
    }

    private static void cookEgg(){
        System.out.println("#####################");
        System.out.println("Get the egg");
        System.out.println("Broke the egg");
        System.out.println("Fry the egg");
        System.out.println("#####################");
    }

    public static void printSomething(){
        System.out.println( "Print something");
    }

    public static void printSomething(String parameter){
        System.out.println( "Print something: " + parameter);
    }

    public static void printSomething(int parameter){
        System.out.println( "Print something: " + parameter);
    }
}
