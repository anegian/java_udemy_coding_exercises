package banking_exersiceWIthAutoboxing;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.name = branchName;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName,initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount){

        Customer existingCustomer = findCustomer(customerName);

        if(existingCustomer != null){
          existingCustomer.addTransaction(amount);
          return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName){

        for (int i =0; i<this.customers.size(); i++){
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return  null;
    }

}
