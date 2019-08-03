package chapter6;

public class PhoneBill {

    //Fields
    private int id;
    private double baseCost;
    private double noOfAllottedMinutes;
    private double noOfUserMinutes;

    //Constructors
    public PhoneBill(){
        id = 0;
        baseCost = 79.99;
        noOfAllottedMinutes = 800;
        noOfUserMinutes = 800;
    }
    public PhoneBill(int id){
        this.id = id;
        baseCost = 79.99;
        noOfAllottedMinutes = 800;
        noOfUserMinutes = 800;
    }
    public PhoneBill(int id,double baseCost,double noOfAllottedMinutes,double noOfUserMinutes){
        this.id = id;
        this.baseCost = baseCost;
        this.noOfAllottedMinutes = noOfAllottedMinutes;
        this.noOfUserMinutes = noOfUserMinutes;
    }

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getBaseCost(){
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }
    public double getNoOfUserMinutes(){
        return noOfUserMinutes;
    }

    public void setNoOfUserMinutes(double noOfUserMinutes) {
        this.noOfUserMinutes = noOfUserMinutes;
    }
    public double getNoOfAllottedMinutes(){
        return noOfAllottedMinutes;
    }

    public void setNoOfAllottedMinutes(double noOfAllottedMinutes) {
        this.noOfAllottedMinutes = noOfAllottedMinutes;
    }

    //Methods
    public double calculateOverage(){
        if(noOfUserMinutes <= noOfAllottedMinutes){
            return 0;
        }
        double extraMinutes = noOfUserMinutes - noOfAllottedMinutes;
        double rate = 0.25;
        return extraMinutes * rate;
    }
    public double calculateTax(){
        double rate = 0.15;
        return (baseCost + calculateOverage())*rate;
    }
    public double calculateTotal() {
        return baseCost + calculateOverage() + calculateTax();
    }
        public void printItemizedBill(){
            System.out.println("ID: " + id);
            System.out.println("Base Rate: $" + baseCost);
            System.out.println("Overage Fee: $"
                    + String.format("%.2f", calculateOverage()));
            System.out.println("Tax: $"
                    + String.format("%.2f", calculateTax()));
            System.out.println("Total: $"
                    + String.format("%.2f", calculateTotal()));

    }
}
