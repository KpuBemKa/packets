package com.stack;

public class Patrat extends Figura{
    protected int side;

    public Patrat() {

    }

    public Patrat(int originX, int originY, int side) {
        super(originX, originY);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
