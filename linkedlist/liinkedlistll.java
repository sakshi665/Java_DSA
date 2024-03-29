package linkedlist;
class Node{
    int val;
    Node next;
   
    Node(int data){
        this.val = data;
        this.next = null;
    }
}
 
class LinkedListImpl{
    Node head;
   
    LinkedListImpl(){
        this.head = null;
    }
   
    void print(){
        Node cur = this.head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    
    int length(){
        Node cur = this.head;
        int len = 0;
        while(cur!=null){
            len++;
            cur = cur.next;
        }
        return len;
    }
    
    boolean search(int key){
        Node cur = this.head;
        while(cur!=null){
            if(cur.val == key)
                return true;
            cur = cur.next;
        }
        return false;
    }
    
    // Node middle(){
    //     Node cur = this.head;
    //     int len = this.length();
    //     int mid = len/2;
    //     int pos = 0;
    //     while(pos!=mid){
    //         cur = cur.next;
    //         pos++;
    //     }
    //     return cur;
    // }
    
    Node middle(){
        Node slow = this.head;
        Node fast = this.head;
        while(slow!=null && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
   
    void insertAtEnd(int data){
        Node cur = this.head;
        Node newNode = new Node(data);
        if(cur==null)
            this.head = newNode;
        else{
            while(cur.next != null)
                cur = cur.next;
            cur.next = newNode;
        }
    }
   
    void deleteAtEnd(){
        Node cur = this.head;
        if(cur==null || cur.next == null)
            this.head = null;
        else{
            while(cur.next.next!=null)
                cur = cur.next;
            cur.next = null;
        }
    }
}
public class liinkedlistll {
    public static void main(String[] args){
        LinkedListImpl l = new LinkedListImpl();
        int[] nodes_val = {1,2,4,5,6};
        for(int val : nodes_val){
            l.insertAtEnd(val);
        }
        l.print(); // => 1 2 3 4 5
        // l.deleteAtEnd();
        // l.print(); // => 1 2 3 4
        // l.deleteAtEnd();
        // l.print(); // => 1 2 3
        
        System.out.println(l.length());
        System.out.println(l.search(5));
        Node mid = l.middle();
        System.out.println(mid.val);

    }
}