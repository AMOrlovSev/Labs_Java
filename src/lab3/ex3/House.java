package lab3.ex3;

import java.time.Year;

public class House {
    private Integer numberOfFloors;
    private Integer yearOfConstruction;
    private String name;

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public Integer getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(Integer yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public House() {

    }

    public void SetHouse(Integer numberOfFloors, Integer yearOfConstruction, String name) {
        this.setNumberOfFloors(numberOfFloors);
        this.setYearOfConstruction(yearOfConstruction);
        this.setName(name);
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfFloors='" + numberOfFloors + '\'' +
                ", yearOfConstruction='" + yearOfConstruction + '\'' +
                ", name=" + name +
                '}';
    }

    public Integer YearsSinceConstruction() {
        int currentYear = Year.now().getValue();
        Integer yearsSinceConstruction = currentYear - this.getYearOfConstruction();
        return yearsSinceConstruction;
    }
}
