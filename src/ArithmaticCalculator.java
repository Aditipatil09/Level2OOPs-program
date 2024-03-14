import java.util.Scanner;

public class ArithmaticCalculator {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two integers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int intSum = calculateSum(num1, num2);
        System.out.println("Sum of integers:" + intSum);

        System.out.println("Enter two doubles:");
        double doubleNum1 = scanner.nextDouble();
        double  doubleNum2 = scanner.nextDouble();

        double doubleSum = calculateSum(doubleNum1, doubleNum2);
        System.out.println("Sum of Doubles:" + doubleSum);
    }
    static int calculateSum (int a ,int b){
        return a+b;
    }
    static double calculateSum (double a , double b){
        return a-b;
    }
}
