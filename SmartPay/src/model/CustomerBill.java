package model;  

 
public class CustomerBill implements Billable {

    private String customerName;   
    private int previousReading;   
    private int currentReading;   
    private int units;             
    private double totalAmount;    

    
    public CustomerBill(String name, int prev, int curr) {
        this.customerName = name;         
        this.previousReading = prev;      
        this.currentReading = curr;       
        this.units = curr - prev;         
    }
 
    public int getUnits() {
        return units;
    }

    
    public String getCustomerName() {
        return customerName;
    }

  
    public double getTotalAmount() {
        return totalAmount;
    }

   
    @Override
    public double calculateTotal() {

        int u = units;    
        double total = 0;  
 
        if (u <= 100) {
            total = u * 1.0;  // first slab
        } 
        else if (u <= 300) {
            total = (100 * 1.0) + (u - 100) * 2.0;  
        } 
        else {
            total = (100 * 1.0) + (200 * 2.0) + (u - 300) * 5.0; 
        }

        this.totalAmount = total; 
        return total;              
    }
}