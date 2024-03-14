import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        Calculator calculator= new Calculator();
        double result = calculator.input();

        System.out.println("Result:" +result);
    }

    public double input(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the First number:");
        double num1= scanner.nextDouble();

        System.out.println("Enter the Second number:");
        double num2 = scanner.nextDouble();

        double sum = add (num1 , num2);
        scanner.close();
        return sum;
    }
    public double add(double num1 , double num2){
        return (num1 +num2);
    }
}
