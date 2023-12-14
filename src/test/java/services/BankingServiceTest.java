package services;

import models.BankAccount;
import models.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}
