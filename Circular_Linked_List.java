package DataStructure;

public class Circular_Linked_List {
	
		Node last;
		class Node
		{
		int data;
		Node next=null;
		
		Node(int val)
		{
			data=val;
			next=null;
		}
		
		}
		Circular_Linked_List()
		{
			last=null;
		}
		public void insertAtBegin(int val)
		{
			Node newnode=new Node(val);
			if(last==null)
			{
				last=newnode;
				last.next=last;
			}
			else
			{
				Node temp=last.next;
				last.next=newnode;
				newnode.next=temp;
			}
		}
			public void display()
			{
			        Node temp = last.next; 
			         while (temp != last)
			        {
			        	 System.out.print(temp.data + " -> ");
				         temp = temp.next;
			        }
			         System.out.println(temp.data);
			}
			public void insertAtLast(int val)
			{
				Node newnode=new Node(val);
				if(last==null)
				{
					last=newnode;
					last.next=last;
				}
				else
				{
					Node temp=last.next;
					last.next=newnode;
					newnode.next=temp;
					last=newnode;
				}
			}
		public void deleteAtBegin(int v)
		{
			
		}

		}
	

	


