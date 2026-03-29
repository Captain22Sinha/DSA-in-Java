import java.util.ArrayList;

public class basic_or_arr_list {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6); 
        arr.add(0, 10); //arr[o] = 10
        arr.add(1, 20);
        arr.add(2, 30);
        arr.add(3, 70);
        arr.add(4, 80);
        arr.add(5, 50);
        System.out.println(arr.size());
        for(int i=0 ; i<6 ; i++){
            System.out.print(arr.get(i) +  " "); // arr[0]
        }
        System.out.println();
        System.out.println(arr + " ");      
        arr.set(2, 200);
        for(int i=0 ; i<arr.size() ; i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        arr.add(90);
        System.out.println(arr.size());
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }       
    }
}