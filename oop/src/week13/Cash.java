
package week13;

public class Cash extends Payment {
    
    public Cash(double amount){
            super(amount);
        }
    public static void main(String[] args) {
        
        Cash  c = new Cash(1234);
        c.displayAmountDue();
        c.Pay();
        c.savePay();
    }
    
    public void Pay(){
        System.out.println("Amount Pay: " + amount);
    }
    
    public void savePay(){
        System.out.println("Payment Recieved: " + amount);
    }

   
}
