package lab6.ex3;

public class Truck extends Car{
    private Integer numberWheels;
    private Integer mawWeight;

    public void newWheels(Integer number) {
        numberWheels = number;
        System.out.println(numberWheels);
    }

    public Truck(int w, String m, char c, float s, int nW, int mW) {
        super(w, m, c, s);
        numberWheels = nW;
        mawWeight = mW;
    }

    public Truck() {
        super();
    }

    // не по заданию, для понимания работы
    @Override
    public void outPut() {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
        System.out.println("Количество колес - " + numberWheels + " и максимальный вес - " + mawWeight);
    }
}
