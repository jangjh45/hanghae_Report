package SOLID.SRP;

import SOLID.OCP.AddOperation;
import SOLID.OCP.DivideOperation;
import SOLID.OCP.MultiplyOperation;
import SOLID.OCP.SubstractOperation;
import SOLID.SRP.Calculator;

public class SRP {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(
                new AddOperation(),
                new SubstractOperation(),
                new MultiplyOperation(),
                new DivideOperation()
        );

        int firNum = 140;
        int secNum = 60;

        String operator = "+";
        int answer = calculator.calculate(operator, firNum, secNum);
        System.out.println(operator + " answer = " + answer);

        operator = "-";
        answer = calculator.calculate(operator, firNum, secNum);
        System.out.println(operator + " answer = " + answer);

        operator = "*";
        answer = calculator.calculate(operator, firNum, secNum);
        System.out.println(operator + " answer = " + answer);

        operator = "/";
        answer = calculator.calculate(operator, firNum, secNum);
        System.out.println(operator + " answer = " + answer);
    }
}