package com.reader.input;

import com.stack.Cerc;
import com.stack.IFigura;
import com.stack.Patrat;

import java.util.Scanner;

public class Reader implements IReader {
    @Override
    public IFigura readFigura() {
        System.out.println("Care figura doriti sa adaugati:\n 1.Cerc\n 2.Patrat");
        Scanner cin = new Scanner(System.in);

        int option = cin.nextInt();

        if (option == 1) {
            System.out.println("Adaugarea unui patrat in stiva");

            System.out.println("Originea: X=");
            int originx = cin.nextInt();

            System.out.println("Originea: Y=");
            int originy = cin.nextInt();

            System.out.println("Radius=");
            int radius = cin.nextInt();

            return new Cerc(originx, originy, radius);
        } else if (option == 2) {
            System.out.println("Adaugarea unui patrat in stiva");

            System.out.println("Origiea: X=");
            int originx = cin.nextInt();

            System.out.println("Originea: Y=");
            int originy = cin.nextInt();

            System.out.println("Latura: ");
            int side = cin.nextInt();

            return new Patrat(originx, originy, side);
        } else return null;

    }
}
