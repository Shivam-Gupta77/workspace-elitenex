package Jun17;

public class StoreEx {
    public static void main(String[] args){
        String[] items = {"apple", "banana", "ketchup", "shampoo", "rice"};
        double[] prices = { 120, 40, 140, 250, 65};
        int[] quantity = { 4, 3, 1, 1, 5};
        int[] discounts = { 10, 5, 35, 20, 2};
        double totalPrice = 0;

        for(int i = 0; i<5; i++){
            double itemPrice = calPrice(prices[i], quantity[i], discounts[i]);
            System.out.println(items[i] + " | " + prices[i] + "$ | " + discounts[i] + "% | " + quantity[i] + " Qyt : " + itemPrice + "$");
            System.out.println("------------------------------------------");
            totalPrice = totalPrice + itemPrice;
        }

        System.out.println("Total Price: " + totalPrice);

    }

    public static double calPrice(double price, int quantity, int discount){
        double totalPrice = price * quantity;
        double discountPrice = totalPrice / 100 * discount;

        return totalPrice - discountPrice;
    }
}
