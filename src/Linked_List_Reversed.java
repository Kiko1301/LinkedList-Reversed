/**
 * A singly linked list implementation with methods to add nodes, reverse the list, and print the list.
 */
public class Linked_List_Reversed {
    
    // Head of the linked list
    private Node head;

    /**
     * Node class representing each element in the linked list.
     */
    static class Node {
        int data;
        Node next;

        /**
         * Constructor for Node.
         * @param data The data value for the node.
         */
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Adds a new node with the given data to the end of the list.
     * @param data The data for the new node.
     */
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

    /**
     * Reverses the linked list iteratively.
     * @return The new head of the reversed list.
     */
    public Node reverse() {
        if (head == null || head.next == null) {
            return head; // Empty list or single node, no need to reverse
        }

        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;    // Store next node
            current.next = prev;    // Reverse the link
            prev = current;         // Move prev to current
            current = next;         // Move to next node
        }
        
        head = prev; // Update head to the last node
        return head;
    }

    /**
     * Prints the linked list.
     */
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    /**
     * Main method to demonstrate linked list operations.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Linked_List_Reversed list = new Linked_List_Reversed();
        
        // Add nodes to the list
        list.addNode(85);
        list.addNode(15);
        list.addNode(4);
        list.addNode(20);

        System.out.println("Given linked list:");
        list.printList();

        list.reverse();
        System.out.println("Reversed linked list:");
        list.printList();
    }
}

//This code has been contributed by Kristijan Jordanovski 