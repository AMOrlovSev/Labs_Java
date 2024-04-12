package lab2;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        // 1. Calculator
        Calculator calculator = new Calculator();
        {
            double x1 = 1.1;
            double x2 = 2.2;
            double resultSumDouble = calculator.Sum(x1, x2);
            long resultSumLong = calculator.Sum(1000000000L, 300000000L);
            int a = 1;
            int b = 2;
            int resultSumInt = calculator.Sum(a, b);
            out.println("Сумма");
            out.println(resultSumDouble);
            out.println(resultSumLong);
            out.println(resultSumInt);
        }
        {
            double x1 = 1.1;
            double x2 = 2.2;
            double resultDivisionDouble = calculator.Division(x1, x2);
            long resultDivisionLong = calculator.Division(1000000000L, 300000000L);
            int a = 1;
            int b = 2;
            int resultDivisionInt = calculator.Division(a, b);
            out.println("Деление");
            out.println(resultDivisionDouble);
            out.println(resultDivisionLong);
            out.println(resultDivisionInt);
        }
        {
            double x1 = 1.1;
            double x2 = 2.2;
            double resultMultiplicationDouble = calculator.Multiplication(x1, x2);
            long resultMultiplicationLong = calculator.Multiplication(1000000000L, 300000000L);
            int a = 1;
            int b = 2;
            int resultMultiplicationInt = calculator.Multiplication(a, b);
            out.println("Умножение");
            out.println(resultMultiplicationDouble);
            out.println(resultMultiplicationLong);
            out.println(resultMultiplicationInt);
        }
        {
            double x1 = 1.1;
            double x2 = 2.2;
            double resultSubtractionDouble = calculator.Subtraction(x1, x2);
            long resultSubtractionLong = calculator.Subtraction(1000000000L, 300000000L);
            int a = 1;
            int b = 2;
            int resultSubtractionInt = calculator.Subtraction(a, b);
            out.println("Вычитание");
            out.println(resultSubtractionDouble);
            out.println(resultSubtractionLong);
            out.println(resultSubtractionInt);
        }

        // 2. Сущность Person
        Person igor = new Person();
        out.println(igor);
        igor.setAge(13);
        out.println(igor);

        Person ivor = new Person("Ivor", 33, true);
        out.println(ivor);

        Person egor = new Person("Egor");
        out.println(egor);

    }
}
