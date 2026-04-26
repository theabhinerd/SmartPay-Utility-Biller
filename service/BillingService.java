package service;  

import model.CustomerBill;                 
import exception.InvalidReadingException;   

 
public class BillingService {
 
    public void processBill(CustomerBill bill) throws InvalidReadingException {

    
        if (bill.getUnits() < 0) {
            throw new InvalidReadingException(
                "Previous reading cannot be greater than current reading!"
            );
        }

         
        bill.calculateTotal();
    }
}