package shrai.ee.expensemanager;

public class Expenses {
    public float price;
    public String context;
    public String date;
    public Expenses(String context,float price,String date){
        this.context= context;
        this.price = price;
        this.date = date;
    }
    public Expenses(){
        this.date = "Not Applicable";
        this.price=0.0f;
        this.context="NoContext";
    }
    public float getPrice() {
        return price;
    }

    public String getContext() {
        return context;
    }

    public String getDate() {
        return date;
    }
}
