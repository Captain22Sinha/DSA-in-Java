public class interning {
    public static void main(String[] args) {
        String s = "Samrat Sinha";
        String a = "Samrat Sinha";
        String t = new String("Samrat Sinha");
        // not individuali changabel
        //s.charAt(0)="D";//error
        //s.charAt(2)="r";//error
        s = "Dark Star";
        System.out.println(s);
        // Individual array //
        int[] arr ={1,2,3};
        int[] brr = {1,2,3};
        brr[0] = 10;
        System.out.println(arr[0]);
    }
}
