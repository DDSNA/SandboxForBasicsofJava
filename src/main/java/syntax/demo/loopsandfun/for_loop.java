package syntax.demo.loopsandfun;

public class for_loop {
    static public void firstLoop(int[]arr){
        int n = arr.length;
        int temp = 0;
            for(int i=0; i<n;i++){
                for(int j=1; j<(n-i);j++){
                    if(arr[j-1] > arr[j]){
                        temp = arr[j-1];
                        arr[j-1]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
    }
    public static void vain(int[] args) {
        int[] arr = {1,2,3,4,122,98,34,91,429, 61};

        System.out.println("Array before bubble sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        firstLoop(arr);
        System.out.println("Array after bubble sort");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }

    }

}
