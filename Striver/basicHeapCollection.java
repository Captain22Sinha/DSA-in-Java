import java.util.Collections;
import java.util.PriorityQueue;

public class basicHeapCollection{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(45);
        System.out.println(pq);
        pq.add(56);
        System.out.println(pq);
        pq.add(12);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        pq.add(0);
        System.out.println(pq);
        pq.add(10);
        System.out.println(pq);
        pq.add(23);
        System.out.println(pq);
    }
}