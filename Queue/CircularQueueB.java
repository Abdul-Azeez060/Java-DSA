// Circular Queue using Array
public class CircularQueueB {
    // isEmpty(), add(), remove(), peek();
      int[] arr;
      int size;
      int rear; // last element index
      int front; // first element index

    CircularQueueB(int n ){
        arr = new int[n];
        size = n;
        rear = -1;
        front = -1;
    }

    public boolean isEmpty(){
        return rear == -1 && front == -1;
    }
    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    //add rear is index
    public void add(int n) {
        if (isFull()) {
            System.out.println("Queue is full");
        }
        if (front == -1){
            front = 0;
        }
        rear = (rear + 1)%size;
        arr[rear] = n;
    }
    public int remove() { // O(n) as we are copying the next elements in current index
        if (isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int top = arr[front];
        // deleting last element of queue
        if (front == rear) {
            front = rear = -1;
        }else {
            front = (front+1)%size;
        }
        return top;
    }
    public  int peek() {
        if (isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {
        CircularQueueB q = new CircularQueueB(5);
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);

         while (!q.isEmpty()){
             System.out.println(q.peek());
             q.remove();
         }




    }




}
