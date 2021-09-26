package banking_exersiceWIthAutoboxing;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("National Greece Bank");

        bank.addBranch("Volos");

        bank.addCustomer("Volos", "Anestis",2000.40);
        bank.addCustomer("Volos", "Ioanna",1500.85);
        bank.addCustomer("Volos", "John",1800);
//
//        bank.addBranch("Igoumenitsa");
//
//        bank.addCustomer("Igoumenitsa", "Mike",1600.50);
//        bank.addCustomer("Igoumenitsa", "Paris",2700.85);
//        bank.addCustomer("Igoumenitsa", "Chris",950.92);

        bank.addCustomerTransaction("Volos", "Anestis",125);
        bank.addCustomerTransaction("Volos", "Ioanna",85);
        bank.addCustomerTransaction("Volos", "John",45.7);

        bank.listCustomers("Volos",true);
        bank.listCustomers("Volos",false);
//        bank.listCustomers("Igoumenitsa",false);
    }
}
