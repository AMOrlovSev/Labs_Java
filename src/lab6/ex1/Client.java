package lab6.ex1;

public class Client extends Human{

    private String bankName;

    public String getBankName() {
        return bankName;
    }

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public void displayInformation() {
        System.out.println("Name: " + super.getName());
        System.out.println("Surname: " + super.getSurname());
        System.out.println("Bank Name: " + getBankName());
    }
}
