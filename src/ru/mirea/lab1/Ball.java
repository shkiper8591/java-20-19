package ru.mirea.lab1;

public class Ball {
    public String colour;
    public int rad;
    public String type;
    public Ball(int rad, String colour, String type){
        this.colour = colour;
        this.rad = rad;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setType(String type) {
    this.type = type;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    @Override
    public String toString() {
        return "Ball's " + " colour is " + colour + ", radius = " + rad + "mm, type is " + type;
    }
}