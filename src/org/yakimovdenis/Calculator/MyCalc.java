package org.yakimovdenis.Calculator;

import java.util.Scanner;

/**
 * Created by Gvozd on 12.09.2016.
 */
public class MyCalc {
    CalcAction[] actions;

    public MyCalc() {
        this.actions = new CalcAction[]{new MCAdd()};
        String data = getInputLine();
    }

    private String getInputLine(){
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    private String[] parseLine(String data){
        char[] dataChar = data.toCharArray();
        for (int argNum =0; argNum<3;argNum++){
            for (int i=0; i<dataChar.length; i++){
                if (dataChar[i]
            }
        }

    }
}
