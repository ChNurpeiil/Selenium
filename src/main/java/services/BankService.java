package services;

import models.BankAccount;
import models.Customer;
import models.Transaction;

import java.util.ArrayList;
import java.util.List;

public class BankService {
    private List<Customer> customerList;
    private List<Transaction> transactions;

    public BankService() {
        this.customerList = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customerList.add(customer);
    }

    public Customer findCustomer(String customerId) {
        for (Customer customer : customerList) {
            if (customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }
        return null;
//        return  new Customer("hello","12", new BankAccount("123",1232));
    }

    public BankAccount findAccount(String accountId) {
        for (Customer customer : customerList) {
            if (customer.getBankAccount().getAccountNumber().equals(accountId)) {
                return customer.getBankAccount();
            }
        }
        return null;

    }




    public void performTransaction(Transaction transaction) throws Exception{
        String accountId= transaction.getAccountId();
        BankAccount account = findAccount(accountId);

        if(account!= null){
            String customerId= transaction.getCustomerId();
            Customer customer = findCustomer(customerId);
            if(customer!=null){
                if(transaction.getType().equals("Deposit")){
                    account.deposit(transaction.getAmount());
                }
                else if(transaction.getType().equals("Withdraw")){
                    account.withdraw(transaction.getAmount());
                }
                transactions.add(transaction);

            } else {
                throw new Exception("Customer not found");
//                System.out.println("Customer not found");
            }
        }
        else {
//            System.out.println("Account not found");
            throw new Exception("Bank account not found");

        }


    }
    public List<Customer> getCustomerList() {
        return customerList;
    }
}
