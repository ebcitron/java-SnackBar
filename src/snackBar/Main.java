package snackBar;

public class Main {


    public static void main(String args[]){

       Customer Jane = new Customer(Jane, 45.25);
        Customer Bob = new Customer(Bob, 33.14);

        VendingMachine Food1 = new VendingMachine(1, "Food");
        VendingMachine Drink2 = new VendingMachine(2, "Drink");
        VendingMachine Office3 = new VendingMachine(3, "Office");
    

        Snack Chips = new Snack(1, 36, "Chips", 1.75);
        Snack Choc = new Snack(1, 36, "Chocolate Bar", 1.00);
        Snack Pretz = new Snack(1, 30, "Pretzel", 2.00);
        
        Snack Soda = new Snack(2, 24, "Soda", 2.50);
        Snack Water = new Snack(2, 20, "Water", 2.75);
        
        
    }

  

    
}