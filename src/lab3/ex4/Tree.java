package lab3.ex4;

public class Tree {
    private Integer age;
    private Boolean isAlive;
    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tree(Integer age, String name) {
        this.setAge(age);
        this.setName(name);
    }

    public Tree(Integer age, Boolean alive, String name) {
        this.setAge(age);
        this.setAlive(alive);
        this.setName(name);
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "age='" + age + '\'' +
                ", isAlive='" + isAlive + '\'' +
                ", name=" + name +
                '}';
    }
}
