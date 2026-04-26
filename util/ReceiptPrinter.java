package util; // belongs to util folder

import model.CustomerBill; // import model

// Utility class to print receipt
public class ReceiptPrinter {

    // Static method to print bill
    public static void print(CustomerBill bill) {

        System.out.println("\n===== SMARTPAY RECEIPT ====="); // header
        System.out.println("Customer: " + bill.getCustomerName()); // name
        System.out.println("Units Consumed: " + bill.getUnits());  // units
        System.out.println("Total Amount: $" + bill.getTotalAmount()); // total
        System.out.println("============================\n"); // footer
    }
}