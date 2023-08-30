public class LinkedList {
    class Node {
        int data;
        Node next = null;

        public Node(int data) { // constructor
            this.data = data;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) { //O(1) TC
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data) { //O(1) TC
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){  // O(n) TC
        Node temp = head;
        while(temp != null){ // traversing over the entire linkedlist
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");

    }
    public void add(int idx, int data){
        if (head == null){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node pre = head;
        int i = 0;

        while (i < idx-1){
            pre = pre.next;
            i++;
        }
        newNode.next = pre.next;
        pre.next = newNode;
    }
    public int removeFirst(){
        if (head == null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public void reverse(){
        // 3 variables 4 steps
        Node pre = null;
        Node curr = tail = head;
        Node next;
        while (curr!= null){
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        head = pre;

    }
    public int removeLast(){
        if (head == null){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        Node temp = head;
        for (int i = 0; i <size-2; i++) {
            temp = temp.next;
        }
        int val = temp.next.data; // tail.data
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    public int itrSearch(int key) {
        if (head == null){
            return -1;
        }
        int idx = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return idx;
            }
            idx++;
            temp = temp.next;
        }
        return -1;
    }
    public int recSearch(int key){
        return helper(key, head);
    }
    public int helper(int key, Node head){
        if (head == null) {
            return -1;
        }
        int idx = helper(key, head.next);
        if (idx != -1) {                        // if (idx == -1){
            return idx+1;                       // return -1; }

        }
        if (head.data == key) {
            return 0;
        }
        return -1;
    }
    public void removeNthNode(int n){
        if (n == size){
            removeFirst();
        }
        Node temp = head;
        int i = 0;
        while (i < size-n-1) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        size--;
    }
    public boolean isPalindrome() {
        // find midNOde by slow fast method
        Node midNode = findMidNode();

        // reverse ll after the midnode
        // 3 variables 4 steps
        Node pre = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        // by 2 pointer method
        Node temp = head;
        while (temp != null && pre != null) {
            if (temp.data != pre.data) {
                return false;
            }
            temp = temp.next;
            pre = pre.next;
        }
        return true;




    }
    public Node findMidNode() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public boolean isCyclic(){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null ) {
            if (fast == slow) {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }



    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
//        ll.addFirst(2);
        ll.addFirst(1);
//        ll.addLast(3);
//        ll.addLast(4);
//        ll.addLast(5);
////        System.out.println(tail.data);
//        ll.add(2,6);
//        ll.print();
//        System.out.println(LinkedList.size);
//        System.out.println(ll.removeFirst());
//        ll.removeLast();
//       ll.print();
//       System.out.println(ll.itrSearch(6));
//
//        ll.print();
//        System.out.println(ll.recSearch(2));
//        ll.addFirst(1);
//        ll.addLast(5);
//        ll.removeNthNode(4);
//        ll.print();
//        ll.removeNthNode(1);
//        ll.removeNthNode(1);
//        ll.removeNthNode(1);
//        ll.addFirst(2);
//        ll.addLast(3);
//        ll.print();
//        ll.removeFirst();
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        System.out.println(LinkedList.tail.data);
        LinkedList.tail.next = head.next;

        System.out.println(ll.isCyclic());







//        System.out.println(ll.isPalindrome());
    }
}