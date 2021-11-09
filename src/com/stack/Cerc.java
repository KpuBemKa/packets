package com.stack;

public class Cerc extends Figura{
    protected int radius;

    public Cerc() {

    }

    public Cerc(int originX, int originY, int radius) {
        super(originX, originY);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
