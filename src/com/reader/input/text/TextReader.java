package com.reader.input.text;

import com.reader.input.Handler;
import com.stack.Cerc;
import com.stack.IFigura;
import com.stack.Patrat;
import com.sun.jdi.request.DuplicateRequestException;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;
import java.util.Scanner;

public class TextReader implements Handler {


    @Override
    public IFigura readFigura(IFigura f) {
   Scanner cin = new Scanner(System.in);
   Cerc c= new Cerc();
   Patrat p= new Patrat();

            if (Objects.equals(f,c)) {
                int originx=cin.nextInt();
                int originy=cin.nextInt();
                int radius=cin.nextInt();
                Cerc c2= new Cerc(originx,originy,radius);
                return  c2;
            }
            else if(Objects.equals(f,p))
            {
                int originx=cin.nextInt();
                int originy=cin.nextInt();
                int side=cin.nextInt();
                Patrat p2= new Patrat(originx,originy,side);
                return  p2;
            }
            else return null;
    }

    @Override
    public int readOption(IFigura f) {
        return 0;
    }
}
