package lab6.ex3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(500, "car", 'b', 220);

        Car cTruck1 = new Truck();
        Car cTruck2 = new Truck(500, "cTruck", 'b', 220, 4,600);

        Truck truck1 = new Truck();
        Truck truck2 = new Truck(500, "truck", 'b', 220, 4,600);

        car1.color = 'a';
        car1.model = "aaa";
        car1.outPut();
        System.out.println();

        car2.outPut();
        System.out.println();

        cTruck1.color = 'c';
        cTruck1.speed = 180;
        cTruck1.outPut();
        System.out.println();

        cTruck2.outPut();
        System.out.println();

        truck1.weight = 3300;
        truck1.newWheels(6);
        truck1.outPut();
        System.out.println();

        truck2.newWheels(5);
        truck2.outPut();
        System.out.println();
    }
}
