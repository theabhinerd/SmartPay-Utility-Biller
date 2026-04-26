package exception; 
 
public class InvalidReadingException extends Exception {

    // Constructor to pass error message
    public InvalidReadingException(String msg) {
        super(msg);  
    }
}