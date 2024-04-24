package lab6.ex1;

public class Main {
    public static void main(String[] args) {
        Human hClient = new Client("hКлиент", "hКлиентов", "hбанк Клиент");
        Human hEmployee = new Employee("hРаботник", "hРаботников", "hбанк Работник");

        Client client = new Client("Клиент", "Клиентов", "банк Клиент");
        Employee employee = new Employee("Работник", "Работников", "банк Работник");

        System.out.println(hClient.getName());
        System.out.println(hClient.getSurname());
        hClient.displayInformation();

        System.out.println(client.getName());
        System.out.println(client.getSurname());
        System.out.println(client.getBankName());
        client.displayInformation();

        System.out.println(hEmployee.getName());
        System.out.println(hEmployee.getSurname());
        hEmployee.displayInformation();

        System.out.println(employee.getName());
        System.out.println(employee.getSurname());
        System.out.println(employee.getBankName());
        employee.displayInformation();
    }
}
