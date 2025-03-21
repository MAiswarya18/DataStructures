package DataStructure;

public class Circular_Access {
	public static void main(String args[]) {
		
		Circular_Linked_List c=new Circular_Linked_List();
		c.insertAtBegin(23);
		c.insertAtBegin(34);
		c.insertAtBegin(24);
		c.insertAtBegin(35);
		c.insertAtLast(777);
		c.insertAtLast(500);
		c.display();
	}
}
