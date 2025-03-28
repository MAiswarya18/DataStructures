package DataStructure;

public class Stack {
	int[] num=new int[10];
	int top=-1;
	
	public void push(int n)
	{
		if(top<num.length)
		{
		++top;
		num[top]=n;
		}
		else
		{
			System.out.println("Stack overflow");
		}
	}
	public void pop()
	{
		if(top!=-1)
		{
			System.out.println("Popped");
			top--;
		}
		else
		{
			System.out.println("Stack underflow");
		}
				
	}
	public void peek()
	{
		System.out.println(num[top]);
	}

}
