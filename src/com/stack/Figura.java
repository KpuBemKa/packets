package com.stack;

public class Figura {
    protected int originX;
    protected int originY;

    public Figura(){

    }

    public Figura(int originX, int originY) {
        this.originX = originX;
        this.originY = originY;
    }

    public int getOriginX() {
        return originX;
    }

    public void setOriginX(int originX) {
        this.originX = originX;
    }

    public int getOriginY() {
        return originY;
    }

    public void setOriginY(int originY) {
        this.originY = originY;
    }
}
