package services;

import models.BankAccount;
import models.Customer;
import models.Transaction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BankingServiceTest {
    @Test
    public void addNewCustomerTest(){
        //are pre conditional steps
        BankService bankService = new BankService();
        BankAccount bankAccount1 = new BankAccount("12345",1000.0);
        Customer customer1 = new Customer("Elon Musk", "x1",bankAccount1);

        //this is action test
        bankService.addCustomer(customer1);

        List<Customer> expectedListOfCustomers = new ArrayList<>();
        expectedListOfCustomers.add(customer1);

        assertEquals(expectedListOfCustomers,bankService.getCustomerList(),"two customer lists are not equal");
    }
    @Test
    public void findingCustomerTest(){
        BankService bankService= new BankService();
        BankAccount bankAccount2 = new BankAccount("12345",1000.0);
        Customer customer2 = new Customer("Elon Musk", "x1",bankAccount2);

        bankService.addCustomer(customer2);

        Customer actualResult = bankService.findCustomer("x1");
        Assertions.assertEquals("Elon Musk", actualResult.getName());
        Assertions.assertEquals("Elon Musk", actualResult.getName());
        

    }
    @Test
    public void findingCustomerWithin1CustomerListTest(){
        BankService bankService= new BankService();
        BankAccount bankAccount2 = new BankAccount("12345",1000.0);
        Customer customer2 = new Customer("Elon Musk", "x1",bankAccount2);

        bankService.addCustomer(customer2);

        Customer actualResult = bankService.findCustomer("x1");
        Assertions.assertEquals("Elon Musk", actualResult.getName());
        Assertions.assertEquals("Elon Musk", actualResult.getName());


    }
    @Test
    public void findingCustomerThatDoesntExist(){
        BankService bankService= new BankService();
        BankAccount bankAccount2 = new BankAccount("12345",1000.0);
        Customer customer2 = new Customer("Elon Musk", "x1",bankAccount2);

        bankService.addCustomer(customer2);

        Customer actualResultCustomerObj = bankService.findCustomer("beta123");
        assertNull(actualResultCustomerObj, "finding a customer that doesnt exist should return null");

    }

    @Test
    public void performTransactionWithNullCustomer(){
        BankService bankService = new BankService();

        BankAccount bankAccount1 = new BankAccount("12345",1000.0);
        Customer customer1 = new Customer("Elon Musk", "x1",bankAccount1);

        Transaction transaction = new Transaction("TXN001", "Deposit", 500, "001", "x1");

        //this is action test
//        bankService.performTransaction(transaction);
        try {
            assertThrows(Exception.class, () -> bankService.performTransaction(transaction));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    @Test
    public void testPerformDepositTransaction(){
        BankService bankService = new BankService();

        BankAccount bankAccount1 = new BankAccount("12345",1000.0);
        Customer customer1 = new Customer("Elon Musk", "x1",bankAccount1);

        Transaction transaction = new Transaction("TXN001", "Deposit", 500.0, "12345", "x1");

        bankService.addCustomer(customer1);

        try{
            bankService.performTransaction(transaction);

            assertEquals(1500.00, bankAccount1.getBalance(),"Deposit is not completed");
        }catch (Exception e){
            fail("Perform transaction with a valid transaction failed");
        }
    }
    @Test
    public void testPerformWithdrawSufficientFunds(){
        BankService bankService = new BankService();

        BankAccount bankAccount1 = new BankAccount("12345",1000.0);
        Customer customer1 = new Customer("Elon Musk", "x1",bankAccount1);

        Transaction transaction = new Transaction("TXN001", "Withdraw", 300.0, "12345", "x1");

        bankService.addCustomer(customer1);
        try {
            bankService.performTransaction(transaction);
            assertEquals(700.0, bankAccount1.getBalance(),"withdraw balance mismatch");
        }catch (Exception e){
            fail("withdraw with sufficient funds in not completed"+e.getMessage());//e.getMessage() help me find error
        }
    }
    @Test
    public void testPerformWithdrawInsufficientFunds(){
        BankService bankService = new BankService();

        BankAccount bankAccount1 = new BankAccount("12345",1000.0);
        Customer customer1 = new Customer("Elon Musk", "x1",bankAccount1);

        Transaction transaction = new Transaction("TXN001", "Withdraw", 1500.0, "12345", "x1");

        bankService.addCustomer(customer1);
        try {
            bankService.performTransaction(transaction);
            assertEquals(1000.0, bankAccount1.getBalance(),"withdraw balance mismatch");
        }catch (Exception e){
            fail("withdraw with insufficient funds error"+e.getMessage());//e.getMessage() help me find error
        }
    }
}
