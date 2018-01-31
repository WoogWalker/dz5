package com.car.parts;

public class CarDoor {
    private boolean doorStatus; // true - закрыта | false - открыта
    private boolean windowStatus; // true - закрыта | false - открыта

    public boolean isDoorStatus() {
        return this.doorStatus;
    }

    public void setDoorStatus(boolean doorStatus) {
        this.doorStatus = doorStatus;
    }

    public boolean isWindowStatus() {
        return this.windowStatus;
    }

    public void setWindowStatus(boolean windowStatus) {
        this.windowStatus = windowStatus;
    }

    public CarDoor(){

    }

    public CarDoor(boolean doorStatus, boolean windowStatus){
        this.doorStatus = doorStatus;
        this.windowStatus = windowStatus;
    }

    public void openDoor(){
        if (this.doorStatus)
        this.doorStatus = false;

        else if(this.doorStatus = false)
            this.doorStatus = true;

    }

    public void closeDoor(){
        if (this.doorStatus = false)
        this.doorStatus = true;

        else if (this.doorStatus)
            this.doorStatus = false;
    }

    public void openWindow(){
        if (this.windowStatus)
            this.windowStatus = false;

        else if (this.windowStatus = false)
            this.windowStatus = true;
    }

    public void closeWindow(){
        if (this.windowStatus = false)
            this.windowStatus = true;

        else if (this.windowStatus)
            this.windowStatus = false;
    }

    public void show(){
        if (this.doorStatus)
            System.out.println("door is closed");

        if (this.doorStatus = false)
            System.out.println("door is opened");

        if (this.windowStatus)
            System.out.println("window is opened");

        if (this.windowStatus = false)
            System.out.println("window is closed");
    }
}