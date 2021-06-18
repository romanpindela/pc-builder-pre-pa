package com.codecool.pcbuilder.print;

import com.codecool.pcbuilder.component.Component;
import com.codecool.pcbuilder.computer.Computer;

public class PrintComputer {
    public static String print( Computer c){
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(": \n");
        for (Component e : c.getComponents()){
            sb.append(e).append("\n");
        }
        return sb.toString();
    }
}
