package lab2;

public class Calculator {

    //Sum
    public double Sum(double number1, double number2) {
        double result = number1 + number2;
        return result;
    }

    public long Sum(long number1, long number2) {
        long result = number1 + number2;
        return result;
    }

    public int Sum(int number1, int number2) {
        int result = number1 + number2;
        return result;
    }

    //Division
    public double Division(double number1, double number2) {
        double result = number1 / number2;
        return result;
    }

    public double Division(long number1, long number2) {
        double result = number1 / Double.valueOf(number2);
        return result;
    }

    public double Division(int number1, int number2) {
        double result = number1 / Double.valueOf(number2);
        return result;
    }

    //Multiplication
    public double Multiplication(double number1, double number2) {
        double result = number1 * number2;
        return result;
    }

    public long Multiplication(long number1, long number2) {
        long result = number1 * number2;
        return result;
    }

    public int Multiplication(int number1, int number2) {
        int result = number1 * number2;
        return result;
    }

    //Subtraction
    public double Subtraction(double number1, double number2) {
        double result = number1 - number2;
        return result;
    }

    public long Subtraction(long number1, long number2) {
        long result = number1 - number2;
        return result;
    }

    public int Subtraction(int number1, int number2) {
        int result = number1 - number2;
        return result;
    }
}
