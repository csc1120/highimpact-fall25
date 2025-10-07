package wk6;

import java.util.Scanner;

public class SimpleCalulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 4;
        double num2 = 5;

        System.out.println("Enter an operationr (+, -, *, /)");
        String operation = scanner.next();
        CalcOperations op;
        switch (operation){
            case "+":
                op = (a,b) ->{
                    return a + b;
                };
                break;
            case "-":
                op = (a,b) ->{
                    return a - b;
                };
                break;
            default:
                op = (a,b) ->{
                    return a * b;
                };
        }
        op.operate(num1, num2);

    }
}
