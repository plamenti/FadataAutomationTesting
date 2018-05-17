package com.plamenti;

public class Main {

    public static void main(String[] args) {
        Client pesho = new Client();
        pesho.setName("pesho");
        pesho.setAddress("Sofia, Iskar 23");
        pesho.setContact("0888112233");

        Client gosho = new Client();
        gosho.setName("Gosho");
        gosho.setAddress("Plovdiv, Lom 23");
        gosho.setContact("0888442233");

        pesho.printClientData();

        gosho.printClientData();
    }

}
