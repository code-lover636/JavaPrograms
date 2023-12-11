import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class List {
    static Node head = null;
    public static void main(String[] args) {
        boolean running = true;
        Scanner sc = new Scanner(System.in);

        while(running){
            System.out.print("""

                    1. Insert new node
                    2. Delete node
                    3. Display node
                    4. Exit

                    Choose an option: """);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter data of the node: ");
                    add(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter key(data) to delete node: ");
                    delete(sc.nextInt());
                    break;
                case 3:
                    printNode();
                    break;            
                default:
                    running = false;
                    System.out.println("Exiting...");
                    break;
            }
        }
        sc.close();

    } 
    public static void printNode(){
        if(head==null){
            System.out.println("Linked List is empty.");
            return;
        }
        Node temp = head;
        System.out.print("Linked List: ");
        System.out.print("NULL<-->");
        while(temp != null){
            System.out.print(temp.data + "<-->");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }
    public static void delete(int key){
        if(head==null){
            System.out.println("Linked List is empty.");
            return;
        }
        else if(head.data == key){
            head = head.next;
            head.prev = null;
            System.gc();
            System.out.println("Node deleted");
            return;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                if(temp.data == key){
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                    temp = null;
                    System.gc();
                    System.out.println("Node deleted");
                    return;
                }
                temp = temp.next;
            }
            if(temp.data == key){
                temp.prev.next = null;
                System.out.println("Node deleted");
                System.gc();
                return;
            }
        }
        System.out.println("Key not found");
    }
    public static void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            System.out.println("new node added");
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            System.out.println("new node added");
        }
    }
}
