import java.util.Scanner;
 public class triangleArea {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    System.out.print("Enter the base of the tritngle");
    byte dase = sc.nextByte();
    System.out.print("\"Enter the height of the tritngle");
    byte height = sc.nextByte();
    float triangleArea = (1/2.0f)*dase*height;
    System.out.println("area of the tringie="+triangleArea+"spuare units");
    System.out.println("-----------------------------------");
    System.out.print("Enter the length of the spuara");
    byte side = sc.nextByte();
    float squareArea = side * side;
    System.out.println("Area of the triang="+squareArea+"spuare units");

    }
 }