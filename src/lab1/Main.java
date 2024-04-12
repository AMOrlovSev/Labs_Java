package lab1;

import static java.lang.System.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Выведите строки в следующем порядке:
        out.println("Я");
        out.println("хорошо");
        out.println("знаю");
        out.println("Java.");
        out.println(" ");

        // 2. Посчитайте результат выражения
        int resultInt = (46 + 10) * (10 / 3);
        out.println(resultInt);
        out.println((46 + 10) * (10 / 3));
        Double resultDouble = (46 + 10) * (10 / 3.0);
        out.println(resultDouble);
        out.println((29) * (4) * (-15));
        out.println(" ");

        // 3. В переменной
        int number = 10500;
        int result = number / 10 / 10;
        out.println(result);
        out.println(" ");

        // 4. Даны три числа
        Double resultThree = 3.6 * 4.1 * 5.9;
        out.println(resultThree);
        out.println(" ");

        // 5. Считать целые числа
        Scanner scanner = new Scanner(System.in);

        out.println("Введите первое число:");
        int number1 = scanner.nextInt();

        out.println("Введите второе число:");
        int number2 = scanner.nextInt();

        out.println("Введите третье число:");
        int number3 = scanner.nextInt();

        out.println(" ");
        out.println(number1);
        out.println(number2);
        out.println(number3);

        // 6. Условные действия

        out.println("Введите число b:");
        int numberB = scanner.nextInt();

        if (numberB % 2 != 0 )
        {
            out.println("Нечетное");
        }
        else if (numberB > 100){
            out.println("Выход за пределы диапазона");
        }
        else {
            out.println("Четное");
        }

    }
}
