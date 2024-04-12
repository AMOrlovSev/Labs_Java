package lab2;

public class Person {

    private String name;        // имя
    private int age;
    private boolean isMan;

    public Person() {
    }

    public Person (String name, int age, boolean isMan){
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    public Person (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        isMan = man;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", isMan=" + isMan +
                '}';
    }
}
