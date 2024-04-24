package lab6.ex5;

import java.util.Scanner;

import static java.lang.System.out;

public class Parent {
    private Integer age;

    public Scanner scanner = new Scanner(System.in);

    public Integer getAge() {
        return age;
    }

    public void setAge() {
        out.println("Введите возраст:");
        age = scanner.nextInt();
    }

    public Parent(int age) {
        this.age = age;
    }

    public Parent() {
    }

    public void displayInformation() {
        System.out.println("age: " + getAge());
    }
}
