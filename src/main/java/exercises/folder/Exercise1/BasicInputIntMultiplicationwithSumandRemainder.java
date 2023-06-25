package exercises.folder.Exercise1;
import java.util.Scanner;

public class BasicInputIntMultiplicationwithSumandRemainder {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("This is a fairly basic multi-purpose calcuation app. Hi!");
        System.out.println("Please input the first number here:");
        int number_1 = in.nextInt();

        System.out.println("Please input the second number here:");
        int number_2 = in.nextInt();

        //sum
        int sum = number_1 + number_1;
        System.out.println("The sum of " + number_1 + " and " +number_2 + " is " + sum);

        //product
        int product = number_1 * number_2;
        System.out.println("The product of " + number_1 + " and " + number_2 + " is " + product);

        //division
        //so uh... my native language has a funny way of calling the quotient the "cat"
        //I thought that may be funny to anyone stumbling on it

        int division_result = number_1 / number_2;
        System.out.println("The result of division between " + number_1 + " and " + number_2 + " is " + division_result);

        //division but better
        //keeping the above for simplicity and redundancy

        int dividend = number_1;
        int divisor = number_2;

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        // % is the modulus operator, which returns the remainder of the division

        System.out.println("The quotient of " + dividend + " and " + divisor + " is " + quotient);
        System.out.println("The remainder of " + dividend + " and " + divisor + " is " + remainder);
    }
}
