import java.util.Scanner;   

import model.CustomerBill;
import service.BillingService;
import util.ReceiptPrinter;
import exception.InvalidReadingException;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  
        BillingService service = new BillingService();  

        
        while (true) {

            System.out.print("\nEnter Customer Name (or type Exit): ");
            String name = sc.nextLine();  

            
            if (name.equalsIgnoreCase("Exit")) {
                System.out.println("Exiting SmartPay...");
                break;
            }

            try {
                
                System.out.print("Enter Previous Reading: ");
                int prev = sc.nextInt();

              
                System.out.print("Enter Current Reading: ");
                int curr = sc.nextInt();
                sc.nextLine();  

               
                CustomerBill bill = new CustomerBill(name, prev, curr);

               
                service.processBill(bill);

              
                ReceiptPrinter.print(bill);

            } 
            catch (InvalidReadingException e) {
                // handle invalid reading
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            } 
            catch (Exception e) {
                // handle wrong input
                System.out.println("Invalid input. Try again.");
                sc.nextLine();
            }
        }

        sc.close();  
    }
}