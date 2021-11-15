package com.reader.output;

import com.stack.Stack;

public class Output implements IOutput{

    @Override
    public void afisare(Stack stack) {
        stack.showStack();
    }
}
