import java.util.Scanner;
public class sumCalculator {
    public static void main(String args[]){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter the First Byte value:");
        byte firstByte= scanner.nextByte();

        System.out.println("Enter the Second Byete value:");
        byte secondeByte = scanner.nextByte();

        int sum = (int) firstByte + secondeByte;

        System.out.println("Sum of the two value bytes:" +sum);
    }
}
