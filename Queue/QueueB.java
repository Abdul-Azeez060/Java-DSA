// Queue using Array
public class QueueB {
    // isEmpty(), add(), remove(), peek();
      int[] arr;
      int size;
      int rear = -1;

    QueueB(int n ){
        arr = new int[n];
        size = n;
    }

    public    boolean isEmpty(){
        return rear == -1;
    }

    //add rear is index
    public  void add(int n) {
        if (rear == size-1) {
            System.out.println("Queue is full");
        }
        rear = rear + 1;
        arr[rear] = n;
    }
    public  int remove() { // O(n) as we are copying the next elements in current index
        if (isEmpty()){
            System.out.println("queue is empty");
            return Integer.MIN_VALUE;
        }
        int front = arr[0];
        for (int i = 0; i <rear ; i++) { // rear is the last element's index
            arr[i] = arr[i+1];
        }
        rear--;
        size--;
        return front;

    }
    public  int peek() {
        if (isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        return arr[0];
    }

    public static void main(String[] args) {
        QueueB q = new QueueB(5);
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
       while (!q.isEmpty()){
           System.out.println(q.remove());
       }


    }




}
