package exercises.folder.Exercise1;
import java.util.Scanner;
public class BasicMultiplicationTable {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Hi! This is a multiplication table app.");
        System.out.println("Input a number, please:");
        int number = in.nextInt();
        System.out.println("Here is the multiplication table for " + number + ":");

        for (int i=0; i<10; i++)
        {
            System.out.println(number + " x " + (i+1) + " = " + (number *  (i+1)));
        }

    }
}
