// This is the unfinished code snipped. 
// To complete it, follow the notebook steps! 

public class ReturnTypes {

    public static void calculateTotalMealPrice(double listedMealPrice,
                                                double tipRate,
                                                double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your total meal price is " + result);
    }

    public static void main(String[] args) {
        
    }
    
}
