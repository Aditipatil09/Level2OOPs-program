public class AreaCalculate {

    public static double calculateArea ( double side){
        return side *side;
    }

    public static double calculateArea (double length ,double width){
        return length * width;
    }

    public static double calculateArea (double radius , String Shape){
        if(Shape.equalsIgnoreCase("Circle")){
            return Math.PI * radius *radius ;
        } else {
            return-1;
        }
    }

    public static void main(String ags[]){
        double side =0.1;
        double length = 1.2;
        double width =2.3;
        double radius = 2.1;

        double areaOfSquare = calculateArea(side);
        System.out.println("Area of Square :" +areaOfSquare);

        double areaOfRectangle = calculateArea (length , width);
        System.out.println("Area of Rectangle:" +areaOfRectangle);

        double areaOfCircle = calculateArea(radius , "circle");
        if (areaOfCircle !=1){
            System.out.println("Area Of Circle:" +areaOfCircle);
        } else {
            System.out.println("Invalid Circle:");
        }
    }
}
