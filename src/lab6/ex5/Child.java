package lab6.ex5;

import static java.lang.System.out;

public class Child extends Parent {
    private String name;

    public String getName() {
        return name;
    }

    public void setName() {
        out.println("Введите имя:");
        super.scanner.nextLine();
        this.name = super.scanner.nextLine();
    }

    public Child(int age, String name) {
        super(age);
        this.name = name;
    }

    public Child() {
        super();
    }

    @Override
    public void displayInformation() {
        System.out.println("age: " + super.getAge());
        System.out.println("name: " + getName());
    }
}
