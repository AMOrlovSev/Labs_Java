package lab3.ex3;

import lab3.ex2.Car;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {

        House house1 = new House();
        House house2 = new House();

        out.println(house1);
        out.println(house2);
        out.println(" ");

        house1.SetHouse(4,1945,"Сталинка");
        house2.SetHouse(5,1965,"Хрущевка");
        out.println(house1);
        out.println(house2);
        out.println(house1.YearsSinceConstruction());
        out.println(house2.YearsSinceConstruction());
        out.println(" ");
    }
}

