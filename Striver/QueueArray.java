class Queue{
    private int arr[];
    private int start, end, count, size;

    public Queue(){
        arr = new int[23];
        start = -1;
        end = -1;
        count =0;
    }

    public void push(int newElement) {
        if (count == size) {
            System.out.println("Queue is full\nExiting...");
            System.exit(1);
        }
        if (end == -1) {
            start = 0;
            end = 0;
        } else
            end = (end + 1) % size;
        arr[end] = newElement;
        System.out.println("The element pushed is " + newElement);
        count++;
    }
    public int pop() {
        if (start == -1) {
            System.out.println("Queue Empty\nExiting...");
            System.exit(1);
        }
        int popped = arr[start];
        if (count == 1) {
            start = -1;
            end = -1;
        } else
            start = (start + 1) % size;
        count--;
        return popped;
    }
    public int top() {
        if (start == -1) {
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        return arr[start];
    }
    public int size() {
        return count;
    }
}

public class QueueArray {
    public static void main(String[] args) {
        Queue q = new Queue( );
        q.push(4);
        q.push(14);
        q.push(24);
        q.push(34);
        System.out.println("The peek of the queue before deleting any element " + q.top());
        System.out.println("The size of the queue before deletion " + q.size());
        System.out.println("The first element to be deleted " + q.pop());
        System.out.println("The peek of the queue after deleting an element " + q.top());
        System.out.println("The size of the queue after deleting an element " + q.size());
    }
    
}
