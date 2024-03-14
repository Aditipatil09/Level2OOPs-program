import  java.util.Scanner;

class Rectangle{
    double length;
    double breadth;

    double calculateArea(){
        return length *breadth;
    }
}
class main{
    static Rectangle processRectangle (Rectangle rect){
        rect.length +=2;
        rect.breadth +=2;
         return rect;
    }
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the length of the Rectangle 1:");
        double length1 = scanner.nextDouble();
        System.out.println("Enter the breadth of the Rectangle 1:");
        double breadth1= scanner.nextDouble();

        Rectangle rectangle1 = new Rectangle();
        rectangle1.length = length1;
        rectangle1.breadth =breadth1;

        System.out.println("Enter the length of Rectangle 2:");
        double length2 =scanner.nextDouble();
        double breadth2 =scanner.nextDouble();

        Rectangle rectangle2 =new Rectangle();
        rectangle2.length =length2;
        rectangle2.breadth = breadth2;

        System.out.println("Area of Rectangle 1:" +rectangle1.calculateArea());
        System.out.println("Area of Rectangle2: " +rectangle2.calculateArea());

        Rectangle modifiedRectangle1 = processRectangle(rectangle1);
        Rectangle modifiedRectangle2 = processRectangle(rectangle2);

        // Display modified areas
        System.out.println("Modified Area of Rectangle 1: " + modifiedRectangle1.calculateArea());
        System.out.println("Modified Area of Rectangle 2: " + modifiedRectangle2.calculateArea());

        scanner.close();
    }
}
