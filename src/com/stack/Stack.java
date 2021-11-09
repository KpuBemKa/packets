package com.stack;

import com.sun.jdi.request.DuplicateRequestException;
import java.util.ArrayList;
import java.util.Objects;

// класс стека, в котором хранятся все фигуры
public class Stack {
    // размер стека
    public int stackSize;
    // массив в фигурами. тут используется интерфейс, чтоб можно было всунуть разные объекты, как уже говорилось
    public ArrayList<IFigura> figuri;

    public Stack(int stackSize, ArrayList<IFigura> figuri) {
        this.stackSize = stackSize;
        this.figuri = figuri;
    }

    /**
     * добавляет в стек передаваемую фигуру
     * @param figura фигура, которую нужно добавить в стек
     * @exception ArrayIndexOutOfBoundsException если стек уже полный и некуда добавлять фигуры
     * @exception DuplicateRequestException если в стеке уже есть объект с такими параметрами
     * */
    public void addFigureToStack(IFigura figura) {
        int currentStackSize = figuri.size();

        if (currentStackSize >= this.stackSize)
            throw new ArrayIndexOutOfBoundsException("Stiva cu figuri deja este plina!");

        for(IFigura f : figuri){
            if (Objects.equals(f.getInfo(), figura.getInfo())) {
                throw new DuplicateRequestException("Figura \"" + f.getInfo() + "\" deja exista in stiva!");
            }
        }

        figuri.add(figura);
    }

    /**
     * возвращает последнюю фигуру в стеке, а потом удаляет ее
     * @return последнюю фигуру в стеке
     * @exception IndexOutOfBoundsException если стек уже пустой
     * */
    public IFigura getLastFigura() {
        if (figuri.size() == 0) {
            throw new IndexOutOfBoundsException("Stiva deja este goala!");
        }

        int lastElementIndex = figuri.size() - 1;

        IFigura figura = figuri.get(lastElementIndex);
        figuri.remove(lastElementIndex);

        return figura;
    }

    /**
     * выводит на экран весь стек, начиная с конца
     * */
    public void showStack() {
        System.out.println("-====< Toate figurile in stiva >====-");
        for (int i = figuri.size() - 1; i >= 0; i--) {
            System.out.println(i + ". " + figuri.get(i).getInfo());
        }
    }
}
