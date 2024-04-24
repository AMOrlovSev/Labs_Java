package lab6.ex2;

public class Employee extends Human implements dataNow {

    private String bankName;

    public String getBankName() {
        return bankName;
    }

    public Employee(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public void displayInformation() {
        System.out.println("Name: " + super.getName());
        System.out.println("Surname: " + super.getSurname());
        System.out.println("Bank Name: " + getBankName());
    }

    @Override
    public void printData() {
        java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
        System.out.println(currentDateTime);
    }
}
