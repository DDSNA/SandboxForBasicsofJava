package exercises.folder.Exercise1;
import java.util.Scanner;

public class BasicInputIntMultiplication{
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Hi! This is a multiplication app.");
        System.out.println("Input first number, please:");
        int number_1 = in.nextInt();

        System.out.println("Input second number, please:");
        int number_2 = in.nextInt();

        System.out.println(number_1 + " multiplied by " + number_2 + " = " + number_2 * number_2);
}
}
