import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        String currency = "RS.";
        double total;
       
        
        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();
        System.out.print("Enter the price of the item: ");
        price = scanner.nextDouble();
        System.out.print("How many would you like to buy: ");
        quantity = scanner.nextInt();
        total = quantity * price;
        System.out.println("You have purchased " + quantity + " " + item + "(s)");
        System.out.println("Your total is " + currency + total);
        scanner.close();
    }
}