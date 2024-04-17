package lab4.part2;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbersOK = {1,2,3};
        Ex1(numbersOK);
        int[] numbersNotOK = {1,3,2};
        Ex1(numbersNotOK);

        Ex2();

        int[] numbers = {1,2,3};
        Ex3(numbers);

        int[] numbers3 = {1,2,3,1,2,4};
        Ex4(numbers3);
        int[] numbers1 = {1,2,3,4,5,6};
        Ex4(numbers1);

        int[] ints = {44, 231, 23, 34, 54, 55, 435, 76, 87, 2, 3};
        Ex5(ints);
    }

    // 1. Напишите программу, которая проверяет отсортирован ли массив по возрастанию
    public static void Ex1(int[] numbers) {
        String result = "OK";
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 1 + i; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    result = "Please, try again";
                    break;
                }
            }
        }
        System.out.println(result);
    }

    // 2. Напишите программу, которая считывает с клавиатуры длину массива, затем пользователь вводит числа и на новой строке выводится массив из элементов
    public static void Ex2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Array length: ");
        int arrayLength = scanner.nextInt();

        int[] arrayNumbers = GetNumbers(arrayLength);
        PrintNumbers(arrayNumbers);
    }

    public static int[] GetNumbers(int numbers) {
        System.out.println("Numbers of array:");
        int[] arrayNumbers = new int[numbers];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers; i++) {
            System.out.print("Введите число " + (i + (int) 1) + ": ");
            arrayNumbers[i] = scanner.nextInt();
        }
        return arrayNumbers;
    }

    public static void PrintNumbers(int[] arrayNumbers) {
        System.out.println("Result: " + Arrays.toString(arrayNumbers));
//        System.out.print("Result: ");
//        for (int i : arrayNumbers) {
//            System.out.print(i);
//        }
    }

    //3. Напишите метод, который меняет местами первый и последний элемент массива
    public static void Ex3(int[] numbers) {
        SwapNumbers(numbers);
        PrintNumbers(numbers);
    }

    public static int[] SwapNumbers(int[] numbers) {
        int temp = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = temp;
        return numbers;
    }

    // 4. Дан массив чисел. Найдите первое уникальное в этом массиве число
    public static void Ex4(int[] numbers) {
        System.out.println(UniqueNumber(numbers));
    }

    public static int UniqueNumber(int[] numbers) {
        int number = numbers[0];
        Boolean end = false;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 1 + i; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    break;
                }
                if (j == numbers.length - 1) {
                    end = true;
                }
            }
            if (end) {
                number = numbers[i];
                break;
            }
        }
        return number;
    }

    // 5. Заполните массив случайным числами и отсортируйте его. Используйте сортировку слиянием
    public static void Ex5(int[] numbers) {
        int[] result = mergeSort(numbers);
        System.out.println(Arrays.toString(result));
    }

    private static int[] mergeSort(int[] ints) {

        if (ints.length < 2) {
            return ints;
        }

        int mid = ints.length / 2;

        int[] left = new int[mid];

        int[] right;

        if (ints.length % 2 == 0) {
            right = new int[mid];
        } else {
            right = new int[mid + 1];
        }

        for (int i = 0; i < left.length; i++) {
            left[i] = ints[i];
        }

        for (int i = 0; i < right.length; i++) {
            right[i] = ints[mid + i];
        }

        left = mergeSort(left);
        right = mergeSort(right);


        return mergeParts(left, right);
    }

    private static int[] mergeParts(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }
        }

        return result;
    }

}
