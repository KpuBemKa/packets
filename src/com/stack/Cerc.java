package com.stack;

// класс круга, который имплементирует общий интейрфейс с квадратом, все и так понятно
public class Cerc implements IFigura{
    protected Origin origin;
    protected int radius;

    public Cerc(int originX, int originY, int radius) {
        this.origin = new Origin(originX, originY);
        this.radius = radius;
    }

    @Override
    public String getInfo() {
        return "Cerc cu raza " + radius + ", cu originea in O(" + origin.x + "; " + origin.y + ")";
    }
}
