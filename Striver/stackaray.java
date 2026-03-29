class stack{
    int size = 1000;
    int arr[] = new int[size];
    int top = -1;
    void push(int x){
        if(top>=size) return;
        top = top+1;
        arr[top] = x;
    }
    int pop(){
        int x = arr[top];
        top--;
        return x;
    }
    int top(){
        return arr[top];
    }
    int size(){
        return top+1;
    }
}
public class stackaray{
    public static void main(String[] args) {
        stack s = new stack();
        s.push(4);
        s.push(56);
        s.push(89);
        System.out.println("Top of the stack before deleting any element " + s.top());
        System.out.println("Size of the stack before deleting any element " + s.size());
        System.out.println("The element deleted is " + s.pop());
        System.out.println("Size of the stack after deleting an element " + s.size());
        System.out.println("Top of the stack after deleting an element " + s.top());
        
    }
}