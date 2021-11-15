package com.reader.input;
import com.stack.IFigura;

import java.util.ArrayList;

public interface Handler {
    IFigura readFigura(IFigura f);
    int readOption(IFigura f);
}
