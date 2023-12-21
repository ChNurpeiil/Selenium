package steps;

import io.cucumber.java.DataTableType;
import models.Claim;
import models.Order;

import java.util.Map;

public class DatatableTransformer {
//    @DataTableType
//    public Order orderEntry(Map<String, String> entry){
//        int orderId = Integer.valueOf(entry.get("orderId"));
//        String product = entry.get("product");
//        int quantity = Integer.valueOf(entry.get("quantity"));
//
//        return new Order(orderId, product, quantity);
//    }


    @DataTableType
    public Claim claimEntry(Map<String, String> entry){

        String claimId = entry.get("claimId");
        double amount = Double.valueOf(entry.get("amount"));
        String date = entry.get("date");
        String description = entry.get("description");
        String supportingDocuments = entry.get("supportingDocuments");

        return  new Claim(amount, date, description, supportingDocuments);

    }

    @DataTableType
    public Order orderEntry(Map<String, String> entry){
        String customerName = entry.get("customerName");
        String address = entry.get("address");
        String productName = entry.get("productName");
        int quantity = Integer.valueOf(entry.get("quantity"));
        double unitPrice = Double.valueOf(entry.get("unitPrice"));
        double subtotal = Double.valueOf(entry.get("subtotal"));
        int taxRate = Integer.valueOf(entry.get("taxRate"));
        double taxAmount = Double.valueOf(entry.get("taxAmount"));
        double totalAmount = Double.valueOf(entry.get("totalAmount"));

        return new Order(address, productName, quantity, unitPrice, subtotal, taxRate, taxAmount, totalAmount);


    }
}
