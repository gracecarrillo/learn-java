// This is the unfinished code snipped. To fix the errors, follow the notebook steps. 
    
public class Parameters {

    // Our function starts off with `public static void` and uses 
    // the function name `calculateTotalMealPrice();`.

    public static void calculateTotalMealPrice() {

        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        System.out.println("Your total meal price is " + result);
    }

    public static void main(String[] args) {
    }

}
}
