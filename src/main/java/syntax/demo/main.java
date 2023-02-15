package syntax.demo;


import syntax.demo.loopsandfun.MultithreadingExample;
import syntax.demo.loopsandfun.for_loop;


public class main {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Hello, this is the test!");
            if (args[0].equals("test")) {
                //loads test params
            } else if (args[0].equals("production")) {
                //loads prod params
                System.out.println("Hello!");
            }
        }
        System.out.print("Hi!");
        System.out.println("Hi, but this one's a ln!");

        System.out.println("Now that we know it works... welcome to SmallShopInventoryApp! :)\n");
        // why isn't this allowed in a class? regardless, it's a loop that I really enjoy
        int[] exampleIntArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int j = 0; j <= 5; j++) {
            System.out.println("Simple loop for j + 1 incrementally leads to j=" + j);

            System.out.println();
            System.out.println("Here's something different");

            int[] arr = {1, 323123, 32139, 312938, 312310, 2319};
            for_loop.vain(arr);
            System.out.println(arr + " ");
        }
        for (int i = 0; i <= 15; i++) {
            MultithreadingExample MT_example1 = new MultithreadingExample(i);
            MT_example1.start();

        }
    }
}

