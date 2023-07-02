package exercises.folder.Exercise2;

public class ByteAndCastingExercise {


    // casting is done by putting the type of the variable you want to cast to in parentheses before the variable you want to cast

    public static void main(String args[]) {
        byte byteVariable = 100;
        int intVariable = 390;
        short shortVariable = 600;
        long sumVariables = (long) (50000L + 10L * (byteVariable + intVariable + shortVariable));

        System.out.printf("%d, %d, %d",byteVariable, intVariable, shortVariable);
        System.out.println(sumVariables);
    }
}
