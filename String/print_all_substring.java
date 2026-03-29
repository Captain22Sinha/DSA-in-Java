public class print_all_substring {
    public static void main(String[] args) {
        String str = "abcde";
        for(int i=0 ; i<str.length() ; i++){
            for(int j=i+1 ; j<=5 ; j++){
                System.out.print(str.substring(i, j) + " ");
            }
            System.out.println();
        }
    }
}
