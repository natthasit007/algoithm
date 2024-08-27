import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in Kilograms");
        double weight = sc.nextDouble();
        System.out.print("Enter your height in meters");
        double height = sc.nextDouble();
        double BMI = weight/(height*height);
        System.out.println("Your BMI for weight="+weight +"and heigh="+height+"meters is:"+BMI);
        sc.close();
    }
    
}
