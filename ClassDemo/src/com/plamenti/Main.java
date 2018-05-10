package com.plamenti;

public class Main {

    public static void main(String[] args) {


        Pc naskoPc = new Pc();
        naskoPc.motherboard = "Acer";
        naskoPc.processor = "Intel";
        naskoPc.ram = 4;

        naskoPc.printSettings();
        System.out.println("##################################");

        Pc dariPc = new Pc();
        dariPc.motherboard = "lenovo";
        dariPc.processor = "Amd";
        dariPc.ram = 32;
        dariPc.printSettings();
    }

    static class Pc{
        String motherboard;
        String processor;
        int ram;

        public void printSettings(){
            System.out.println("The pc motherboard is " + this.motherboard);
            System.out.println("The pc processor is " + this.processor);
            System.out.println("The pc has " + this.ram + " ram");
        }
    }
}
