package DataStructure;

public class MiddleVal {
	
		Node head;
	    class Node {
	        int data;
	        Node next;

	        Node(int val) {
	            data = val;
	            next = null;
	        }
	    }
	    public MiddleVal() {
	    	head=null;
	    	
	    }
	    public void insertAtBegin(int val) {
	        Node newNode = new Node(val);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node temp = head;
	            newNode.next = temp;
	            head = newNode;
	        }
	        }
	    public int findMiddle() {
	        
	        if (head == null) {
	            return -1; 
	        }

	        Node slow = head;
	        Node fast = head;

	        
	        while (fast != null && fast.next != null) {
	            slow = slow.next; 
	            fast = fast.next.next; 
	        }
	        return slow.data;
	    }
	    
	    public void display() {
	        Node temp = head;
	        if (temp == null) {
	        }
	        while (temp != null) {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        }
	        System.out.println();
	    } 
	    
	    
	public static void main(String args[]) {
		MiddleVal m=new MiddleVal();
		m.insertAtBegin(50);
		m.insertAtBegin(40);
		m.insertAtBegin(30);
		m.insertAtBegin(20);
		m.insertAtBegin(10);
		m.display();
		System.out.println(m.findMiddle());
	}

	}


