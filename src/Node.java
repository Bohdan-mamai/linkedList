public class Node{
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    private Node head = null;
    private Node last = null;

    private void addElement(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            last = newNode;
        }
        else {
            last.next = newNode;
            last = newNode;
        }
    }


    public void getElement(int number){
        Node current = head;

        for (int i = 0; i < number; i++){
            current = current.next;
        }
        System.out.println(current.data);

    }

    public void removeByIndex (int index) {
        int counter = 0;
        Node current = head;
        Node previous = null;
        if (index == 0) {
            head = current.next;
        } else {
            while (current != null) {
                if (counter == index) {
                    previous.next = current.next;
                    break;
                } else {
                    counter++;
                    previous = current;
                    current = current.next;
                }
            }
        }
    }

    public void display() {
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}
