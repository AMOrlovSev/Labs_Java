package lab6.ex5;

public class Main {
    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.displayInformation();
        parent.setAge();
        parent.displayInformation();
        System.out.println();

        Parent parent2 = new Parent(22);
        parent2.displayInformation();
        parent2.setAge();
        parent2.displayInformation();
        System.out.println();

        Parent pChild = new Child();
        pChild.displayInformation();
        pChild.setAge();
        pChild.displayInformation();
        System.out.println();

        Parent pChild2 = new Child(33,"Alex");
        pChild2.displayInformation();
        pChild2.setAge();
        pChild2.displayInformation();
        System.out.println();

        Child child = new Child();
        child.displayInformation();
        child.setAge();
        child.setName();
        child.displayInformation();
        System.out.println();

        Child child2 = new Child(44, "qwerty");
        child2.displayInformation();
        child2.setAge();
        child2.setName();
        child2.displayInformation();
        System.out.println();
    }
}
