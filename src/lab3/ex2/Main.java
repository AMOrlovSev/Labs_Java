package lab3.ex2;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("red");
        Car car2 = new Car("blue",1000);
        Car car3 = new Car();

        out.println(car1);
        out.println(car2);
        out.println(car3);

        car1.setColor("black");
        car1.setName("bmw");
        car1.setWeight(2575);

        out.println(car1);
    }
}

