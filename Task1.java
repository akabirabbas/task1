public class Task1 {
    static Node head;
    static int size = 0;

static class Node {
     int data;
     Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

}
 

    public boolean isEmpty() {
        return this.head == null;
    }

    public int Size() {
        return this.size;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        this.size++;
        if (this.isEmpty()) {
            this.head = newNode;
            return;
        }
        newNode.next = this.head;
        this.head = newNode;

    }
    public Node makeReverse(Node head){
    Node current = head;
    Node previous = null;
    Node next = null;

    while(current != null){
        next = current.next;
        current.next = previous;
        previous = current;
        current = next;
    }
     head = previous;
     return head;

}

public String toString() {
    if (this.isEmpty()) {
        System.out.println("List is empty");
        return "[]";
    }
    StringBuilder str = new StringBuilder("[");
    Node tmp = this.head;
    while (tmp != null) {
        str.append(tmp.data+",");
        tmp = tmp.next;
    }
     str.replace(str.length()-1, str.length(), "]");
    return str.toString();
}



    public static void main(String[] args) {
            Task1 list = new Task1();
            list.addFirst(0);
            list.addFirst(1);
            list.addFirst(2);
            list.addFirst(3);
            System.out.println(list);

            list.head=list.makeReverse(head);
            System.out.println(list);

    }
}