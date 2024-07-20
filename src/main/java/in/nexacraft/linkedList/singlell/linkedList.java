package in.nexacraft.linkedList.singlell;

public class linkedList {
    // now lets create an nested node class in order to create the internal node of the linked list
    int length;
    Node head;
    Node tail;
    class Node{
        // create an constrctor of the linked list to intilize the node
        // the node will have two pointers the next that will point to the next value
        // the integer part or tha data part
        int value;
        Node next;
        Node(int value){
            this.value = value;
            this.next = null;
            // we are setting up the value to the value of the variable and we are setting the next of the
            // current node as null
        }
    }

    linkedList(int value){
        // we need to initilize the values of the linked list
        // and initially set the head and the tail to the same node
        Node newnode = new Node(value);
        this.head = newnode;
        this.tail = newnode;
    }

}
