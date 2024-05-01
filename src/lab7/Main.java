package lab7;

public class Main {
    public static void main(String[] args) {

        Plane plane1 = new Plane();
        Plane plane2 = new Plane("12345", false);

        plane1.displayInformation();
        plane2.displayInformation();
        System.out.println();

        plane1.setTransportName("1111");
        plane1.setFlying(false);
        plane1.wing = plane1.new Wing();

        plane2.setTransportName("22222");
        plane2.setFlying(true);
        plane2.wing = plane1.new Wing(123);

        plane1.displayInformation();
        plane2.displayInformation();
        System.out.println();

        plane1.wing.setWingWeight(111);
        plane2.wing.setWingWeight(222);

        plane1.displayInformation();
        plane2.displayInformation();
        System.out.println();
    }
}
