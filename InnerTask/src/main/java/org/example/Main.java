package org.example;


public class Main {
    public static void main(String[] args) {


        Smartphone samsungS8=new Smartphone("Samsung Galaxy S8",5.8,4,128,3000,68.1,148.9,12,"Exynos 8895");

        Smartphone.BtnPower power=samsungS8.new BtnPower();

        Smartphone.BtnVolume volume=samsungS8.new BtnVolume();

        power.turnOn();

        volume.volumeUp();


        volume.volumeUp();

        volume.volumeDown();


        System.out.println("Volume now is "+volume.currentVolume);

        power.turnOff();

    }
}