package lab6.ex4;

public class Child extends Parent{

    public Child(int i) {
        super(i);
    }

    public Child() {
        super();
    }

    public void showNumber() {
        System.out.println(super.number);
    }
}
