package week13;

public abstract class Payment {
    
    double amount;
    public Payment(double amount){
        this.amount = amount;
    }
    
    public void displayAmountDue(){
        System.out.println("Amount Due:" + amount);
    }
    
    public abstract void Pay();
    public abstract void savePay();
}
