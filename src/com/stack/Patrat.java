package com.stack;

// класс квадрата, который имплементирует общий интейрфейс с кругом, все и так понятно
public class Patrat implements IFigura{
    Origin origin;
    protected int side;

    public Patrat(int originX, int originY, int side) {
        this.origin = new Origin(originX, originY);
        this.side = side;
    }

    @Override
    public String getInfo() {
        return "Patrat cu latura " + this.side + ", cu originea in O(" + this.origin.x + "; " + this.origin.y + ")";
    }
}
