public class basic_syntax {
    public static void main(String[] args) {
        int[] arr = new int[5];
        // initialize individual elements
        arr[0] = 10;
        arr[1] = 23;
        arr[2] = 153;
        arr[3] = 444;
        arr[4] = 53;
        // output of array elements
        System.out.print(arr[0] + " ");
       // update
       arr[0] = 99;
       arr[0] +=10;
       System.out.println(arr[0] + " ");
    }
}
