package com.company;

import com.stack.Cerc;
import com.stack.Patrat;
import com.stack.Stack;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // пример загрузки в стек немного объектов:

        Stack stack = new Stack(10, new ArrayList<>());

        stack.addFigureToStack(new Cerc(0, 0, 12));
        stack.addFigureToStack(new Cerc(5, 6, 3));
        stack.addFigureToStack(new Patrat(3, 3, 1));
        stack.addFigureToStack(new Patrat(7, 3, 5));

        stack.showStack();

        // нужно добавить класс для чтения инфы от пользователя с консоли
        // и класс для вывода всей фигни со стека тоже в консоль
    }
}
