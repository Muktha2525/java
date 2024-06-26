public class Shopping {
    public static void main(String[] args) {
        // Declare 8 local variables
        String itemName1 = "";
        double price1 = 0.0;
        String itemName2 = "";
        double price2 = 0.0;
        String itemName3 = "";
        double price3 = 0.0;
        double totalBill = 0.0;
        String customerName = "";

        
        itemName1 = "Bottle";
        price1 = 450.0; 
        itemName2 = "Smartphone charger";
        price2 = 150.0; 
        itemName3 = "Headphones";
        price3 = 300.0;
        customerName = "Rahul";

        
        totalBill = price1 + price2 + price3;

        
        if (totalBill > 500) {
            
            System.out.println("Customer Name: " + customerName);
            System.out.println("Item: " + itemName1 + ", Price: " + price1);
            System.out.println("Item: " + itemName2 + ", Price: " + price2);
            System.out.println("Item: " + itemName3 + ", Price: " + price3);
            System.out.println("Total Bill: ₹" + totalBill);
        } else {
            
            System.out.println("The total bill is less than or equal to ₹500");
        }
    }
}
