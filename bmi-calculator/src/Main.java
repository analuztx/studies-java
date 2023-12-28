import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int weight;
        double height;
        double bmi;


        System.out.println("Welcome to your BMI calculator");
        System.out.println("\n--------------------------");

        System.out.print("\nEnter your height: ");
        height = scanner.nextDouble();

        System.out.print("Enter your weight: ");
        weight = scanner.nextInt();

        bmi = weight / (height * height);

        System.out.println("Your bmi is: " + bmi);

        scanner.close();

        if (bmi < 18.5){
            System.out.println("You are underweight");
            System.exit(0);
        }
        else if (bmi >= 18.5 && bmi <= 24.9){
            System.out.println("You are normal");
        }
        else if (bmi >= 25 && bmi <= 29.9){
            System.out.println("You are overweight");
        }
        else if (bmi >= 30 && bmi <= 34.9){
            System.out.println("You are obese");
        }
        else if (bmi >= 35 && bmi <= 39.9){
            System.out.println("You are severely obese");
        }
        else{
            System.out.println("You are morbidly obese");
        }
    }
}