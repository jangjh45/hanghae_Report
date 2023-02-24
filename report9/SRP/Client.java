package report9.SRP;

import report9.SRP.Calculator;

public class Client {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int firNum = 140;
        int secNum = 60;

        int answer = calculator.AddOperation(firNum, secNum);
        System.out.println("Add answer = " + answer);

        answer = calculator.SubstractOperation(firNum, secNum);
        System.out.println("Sub answer = " + answer);

        answer = calculator.MultiplyOperation(firNum, secNum);
        System.out.println("Multiply answer = " + answer);

        answer = calculator.DivideOperation(firNum, secNum);
        System.out.println("Divide answer = " + answer);
    }
}