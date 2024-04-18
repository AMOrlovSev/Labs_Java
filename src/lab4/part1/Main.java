package lab4.part1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Ex1();
        Ex2();
        Ex3();
        Ex4();
        Ex5();
        Ex6();

        }


    // 1. Напишите программу, которая выводит на консоль нечетные числа от 1 до 99. Каждое число печатается с новой строки
    public static void Ex1() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1)
                System.out.println(i);
        }
    }

    // 2. Напишите программу, которая выводит числа от 1 до 100, которые делятся на 3, 5 и на то и другое
    public static void Ex2() {
        System.out.print("Делится на 3:");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 )
                System.out.print(" " + i);
        }
        System.out.println();

        System.out.print("Делится на 5:");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0 )
                System.out.print(" " + i);
        }
        System.out.println();

        System.out.print("Делится на 3 и на 5:");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0  && i%5==0)
                System.out.print(" " + i);
        }
        System.out.println();
    }

    // 3. Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true, если сумма равна третьему целому числу
    public static void Ex3() {
        int[] numbersEx3 = get3Numbers();

        Boolean result = isCompareSum(numbersEx3[0], numbersEx3[1], numbersEx3[2]);
        System.out.println(result);
    }

    public static int[] get3Numbers()
    {
        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число:");
        numbers[0] = scanner.nextInt();
        System.out.print("Введите второе число:");
        numbers[1] = scanner.nextInt();
        System.out.print("Введите третье число:");
        numbers[2] = scanner.nextInt();
        return numbers;
    }

    public static Boolean isCompareSum(int number1, int number2, int number3) {
        return number1 + number2 == number3;
    }

    // 4. Напишите программу, которая принимает от пользователя три целых числа и возвращает true, если второе число больше первого числа, а третье число больше второго числа
    public static void Ex4() {
        int[] numbersEx4 = get3Numbers();

        Boolean result = isMoreMore(numbersEx4[0], numbersEx4[1], numbersEx4[2]);
        System.out.println(result);
    }

    public static Boolean isMoreMore(int number1, int number2, int number3) {
        return number2 > number1 && number3 > number2;
    }

    // 5. Напишите программу, чтобы проверить, появляется ли число 3 как первый или последний элемент массива целых чисел
    public static void Ex5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива:");
        int arrayLength = scanner.nextInt();

        int[] arrayNumbers = getNumbers(arrayLength);
        Boolean result = is3inArray(arrayNumbers);
        System.out.println(result);
    }

    public static int[] getNumbers(int numbers)
    {
        int[] arrayNumbers = new int[numbers];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i<numbers; i++) {
            System.out.print("Введите число " + (i+(int)1) + ":");
            arrayNumbers[i] = scanner.nextInt();
        }
        return arrayNumbers;
    }

    public static Boolean is3inArray(int[] numbers) {
            if (numbers[0] == 3 || numbers[numbers.length-1] == 3)
                return true;
            else
                return false;
    }

    // 6. Напишите программу, чтобы проверить, что массив содержит число 1 или 3
    public static void Ex6() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива:");
        int arrayLength = scanner.nextInt();

        int[] arrayNumbers = getNumbers(arrayLength);

        Boolean result = is1or3inArray(arrayNumbers);
        System.out.println(result);
    }

    public static Boolean is1or3inArray(int[] numbers) {
        for (int number : numbers){
            if (number == 1 || number == 3)
                return true;
        }
        return false;
    }

}
