
public class QueueLL {
     static class Node {
         int data;
         Node next;

         Node(int data) {
             this.data = data;
             this.next = null;
         }
     }
         static Node head = null;
         static Node tail = null;


        // isEmpty
        public boolean isEmpty() {
            return head == null && tail == null;
        }
        // add
        public void add(int val){
            Node newNode = new Node(val);
            if (head == null) {
                head = tail =  newNode;
                return;
            }
            tail.next = newNode;
            tail  = newNode;
        }
        // remove
        public int remove() {
            if (isEmpty()){
                System.out.println("LL is empty");
                return -1;
            }
            if (head == tail){
                tail = null;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        //peek
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }

}
