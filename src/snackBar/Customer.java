package snackBar;

public class Customer extends Functions {
    private double cashOnHand = 0.00;

    public Customer(String name, double cashOnHand){
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    public void addCash(double cash) {
        cashOnHand += cash;
    }
    public void buyItem(double cash) {

        cashOnHand -= cash;        
    }

    public double countCash() {
        return cashOnHand;
    }



}