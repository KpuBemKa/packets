package com.company;

import com.reader.input.Reader;
import com.reader.output.Output;
import com.stack.Stack;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack(10, new ArrayList<>());
        Reader r = new Reader();

        stack.addFigureToStack(r.readFigura());
        stack.addFigureToStack(r.readFigura());
        stack.addFigureToStack(r.readFigura());

        Output o = new Output();
        o.afisare(stack);
    }
}
