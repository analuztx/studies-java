import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price;
        int quantity;
        String name;
        String [] product = new String[5];
        product[0] = "Iphone 11";
        product[1] = "Mouse";
        product[2] = "Keyboard";
        product[3] = "Headset";
        product[4] = "Microphone";

        System.out.println("Welcome to the Virtual MarketPlace");
        System.out.println("\nOur products are: ");
            for (int i = 0; i < product.length; i++) {
                System.out.println((i + 1) + ". " + product[i]);
            }

        System.out.print("What product do you want: ");
        name = scanner.nextLine();

        try {
            System.out.print("\nEnter the price of the product: ");
            price = scanner.nextDouble();
        }
        catch (InputMismatchException e){
            System.out.println("Please, enter a invalid input");
        }
    }
}