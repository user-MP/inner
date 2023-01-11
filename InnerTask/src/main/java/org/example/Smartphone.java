package org.example;

public class Smartphone {

    private String name;

    private double diagonal;

    private int ram;

    private int memory;

    private int battery;

    private double width;

    private double height;

    private String processor;


    private int megapixelsMainCamera;

    public Smartphone(String name, double diagonal, int ram, int memory, int battery, double width, double height, int megapixelsMainCamera, String processor) {
        this.name = name;
        this.diagonal = diagonal;
        this.ram = ram;
        this.memory = memory;
        this.battery = battery;
        this.width = width;
        this.height = height;
        this.megapixelsMainCamera=megapixelsMainCamera;
        this.processor = processor;
    }

class BtnPower{

    public BtnPower() {
    }

    public void turnOn(){

        System.out.println(name+" is on");

    }

    public void turnOff(){

        System.out.println(name+" is off");

    }

}

class BtnVolume{

     int currentVolume;


    public BtnVolume(){
         currentVolume=20;
     }


    public void volumeUp(){
       if(currentVolume==100){
           System.out.println("Volume up is maximum for "+name);
       }
       else{

           currentVolume +=20;
           System.out.println("Volume up for "+name);
       }

    }
    public void volumeDown(){
        if(currentVolume==0){
            System.out.println("Volume down is minimum for "+name);
        }
        else{
            currentVolume -=20;
            System.out.println("Volume down for "+name);
        }
    }

}

// Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getMegapixelsMainCamera() {
        return megapixelsMainCamera;
    }

    public void setMegapixelsMainCamera(int megapixelsMainCamera) {
        this.megapixelsMainCamera = megapixelsMainCamera;
    }
}
