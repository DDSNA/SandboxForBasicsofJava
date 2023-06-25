package exercises.folder.Exercise1;
import java.util.Scanner;
public class BasicCircleCalculations {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hi! This is a circle calculation app.");
        System.out.println("Input the radius of the circle, please:");
        int radius = in.nextInt();

        System.out.println("The radius of the circle is " + radius);

        int circleDiameter = radius * 2;
        System.out.println("The diameter of the circle is " + circleDiameter);

        double pow_1 = radius;
        double pow_2 = 2;
        double circleCircumference = Math.PI * (Math.pow(pow_1,pow_2));
        System.out.println("The circumference of the circle is " +  circleCircumference);

    }
}
