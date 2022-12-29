package Java_Programs.LinkedList;



class LinkedList2 {
    private class Node
    {
        private int data;
        private Node next;

        public Node(){
            this.data=0;
            this.next=null;
        }
        public Node(int data){
            this.data=data;
            this.next=null;
        }
        public Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public LinkedList2(){
        this.head = this.tail = null;
        this.size = 0;
    }

    private void handleAddWhenSize0(int val)
    {
        Node node = new Node(val);
        this.head = this.tail = node;
        this.size++;
    }

    public void addFirst(int val){
        if(this.size == 0)
        {
            handleAddWhenSize0(val);
        }
        else {
            Node node = new Node(val);
            node.next = head;
            head = node;
            size++;
        }
    }
    public void addLast(int val){
        if(this.size == 0)
        {
            handleAddWhenSize0(val);
        }
        else
        {
            Node node = new Node(val);
            this.tail.next = node;
            tail = node;
            this.size++;
        }
    }
    public void addAt(int val,int indx){
        if(indx<0 || indx > this.size)
        {
            System.out.println("Invalid Position");
        }
        else if(indx == 0)
        {
            addFirst(val);
        } else if (indx == this.size) {
            addLast(val);
        } else
        {
            Node node = new Node(val);
            Node temp = getNthNode(indx-1);
            node.next=temp.next;
            temp.next = node;
            size++;

        }
    }
    private Node getNthNode(int pos)
    {
        Node temp= head;
        while(pos>0){
            temp = temp.next;
            pos--;
        }
        return temp;
    }

    public int getFirst() {
        if(this.size==0)
            return -1;
        return this.head.data;
    }
    public int getLast() {
        if(this.size==0)
            return -1;
        return this.tail.data;
    }
    public int getAt(int indx) {
        if(indx < 0 || indx >= this.size)
        {
            return -1;
        }
        Node n = getNthNode(indx);
        return n.data;
    }
    public int removeFirst() {
        if(this.size==0)
        {
            System.out.println("No node is there,REMOVE not possible!!!");
            return -1;
        }
        else if(this.size==1)
        {
            return handleRemoveWhenSize1();
        }
        else
        {
            int val = this.head.data;
            this.head = this.head.next;
            this.size--;
            return val;
        }

    }
    private int handleRemoveWhenSize1()
    {
        int val = this.head.data;
        this.head = this.tail = null;
        this.size = 0;
        return val;
    }
    public int removeLast() {
        if(this.size == 0)
        {
            System.out.println("No node is there,REMOVE not possible!!!");
            return -1;
        }
        else if(this.size == 1)
        {
            return handleRemoveWhenSize1();
        }
        else
        {
            Node temp = getNthNode(size-2);
            int val = this.tail.data;
            temp.next=null;
            this.tail = temp;
            this.size--;
            return val;
        }
    }
    public int removeAt(int indx) {
        if(indx < 0 || indx >= this.size)
        {
            return -1;
        }
        else if(indx == 0)
        {
            return removeFirst();
        }
        else if(indx == this.size-1)
        {
            return removeLast();
        }
        else
        {
            Node ntbdm1 = getNthNode(indx-1);
            int val = ntbdm1.next.data;
            ntbdm1.next = ntbdm1.next.next;
            this.size--;
            return val;


        }
    }
    public void display() {
        Node temp = head;
        while (temp!=null)
        {
            System.out.print(temp.data+"->");
            temp = temp.next;

        }
        System.out.println("null");
    }
    public int size() {
        return this.size;
    }



    //Reverse linkedlist (Data Iterative) Allowed complexity: O(n^2)  (Pointer of linkedlist is not change)
    public void reverseDI()
    {
        int left = 0;
        int right = this.size - 1;

        while(left < right)
        {
            Node lnode = getNthNode(left);
            Node rnode = getNthNode(right);
            int temp = lnode.data;
            lnode.data = rnode.data;
            rnode.data = temp;
            left++;
            right--;
        }

    }
    //Reverse linkedlist (Pointer Iterative)
    public void reversePI()
    {
        Node prev = null;
        Node curr = head;

        while(curr != null)
        {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        this.head = prev;
    }



}



public class Question {
    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.addLast(50);;
        ll.addLast(60);;

        ll.display();
        System.out.println(ll.size());

//        ll.reverseDI();
//        ll.display();

        ll.reversePI();
        ll.display();
    }
}
