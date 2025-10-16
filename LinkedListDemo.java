public class LinkedListDemo {

   
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

       private Node head;

    
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
current = current.next;
        }
        current.next = newNode;
    }

   
    public void deleteNode(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == data) {
            head = head.next;
            System.out.println("Node deleted: " + data);
            return;
        }

        Node current = head;
        Node prev = null;

        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }
       if (current == null) {
            System.out.println("Node not found: " + data);
            return;
        }

        prev.next = current.next;
        System.out.println("Node deleted: " + data);
    }

    
    public void displayList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
     public void searchNode(int data) {
        Node current = head;
        int position = 0;

        while (current != null) {
            if (current.data == data) {
                System.out.println("Data found at position: " + position);
                return;
            }
            current = current.next;
            position++;
        }

        System.out.println("Data not found: " + data);
    }

        public static void main(String[] args) 
       {
        System.out.println("Sharmu");
        System.out.println(2024503055);
        LinkedListDemo list = new LinkedListDemo();

        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.displayList();

        list.searchNode(20);
        list.searchNode(40);

        list.deleteNode(20);
        list.displayList();

        list.deleteNode(40);
    }
}