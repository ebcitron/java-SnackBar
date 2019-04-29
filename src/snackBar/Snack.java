package snackBar;

public class Snack extends Functions{

    public Snack(String vID, int quantity, String name, double cost){
        this.vID = vID;
        this.quantity = quantity;
        this.name = name;
        this.cost = cost;
    }

    private int quantity = 0;

    private double cost = 0.00;
    
    private int vID = 0;

    public void setCost(String sCost){ 
        cost = sCost;
    }

    public String getCost(){
        return cost;
    }
    public void setVID(String sVID){ 
        vid = sVID;
    }

    public String getID(){
        return vid;
    }

    public int getQuant(){
        return quantity;
    }
    public void addQuant(int howMany){
        quantity += howMany;
    }
    public void subQuant(int howMany){
        quantity -= howMany;
    }
    public double getTotal(int quant){
        return quant * cost;
    }

    //do the same for the rest of the methods


}