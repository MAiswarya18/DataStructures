package DataStructure;

	class Node {
	    int data;
	    Node next, prev;
	    Node(int data) {
	        this.data = data;
	    }
	}
	class DoublyLinkedList {
	    Node head;
	    void insert(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }
	        temp.next = newNode;
	        newNode.prev = temp;
	    }
	    DoublyLinkedList cloneList() {
	        DoublyLinkedList clone = new DoublyLinkedList();
	        Node temp = head;
	        while (temp != null) {
	            clone.insert(temp.data);
	            temp = temp.next;
	        }
	        return clone;
	    }
	    void display() {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " <-> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }
	    public static void main(String[] args) {
	        DoublyLinkedList list = new DoublyLinkedList();
	        list.insert(10);
	        list.insert(20);
	        list.insert(30);
	        System.out.println("Original List:");
	        list.display();
	        DoublyLinkedList clonedList = list.cloneList();
	        System.out.println("Cloned List:");
	        clonedList.display();
	    }
	}

