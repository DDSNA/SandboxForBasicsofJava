package exercises.folder.Exercise1;
import java.util.Scanner;

public class BasicArithmeticSum {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hi! This is an arithmetic sum calculator. Please fill in the required numbers as requested.");
        System.out.println("1st number: ");
        int inputOne = in.nextInt();

        System.out.println("2nd number: ");
        int inputTwo = in.nextInt();

        System.out.println("3rd number: ");
        int inputThree = in.nextInt();

        int arithmeticSum = (inputOne + inputTwo + inputThree) / 3;

        System.out.println("The arithmetic sum of those numbers is: " + arithmeticSum);
        in.close();
    }
}
//TODO: Maybe find a smarter way of figuring out how many elements are there to calculate the arithmetic sum of?

