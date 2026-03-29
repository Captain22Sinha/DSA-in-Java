import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class graphList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0 ; i <= n ; i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0 ; i<m ; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        for(int i=0 ; i<=n ; i++){
            System.out.print(i + ": ");
            for(int neighbor : adj.get(i)){
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}
