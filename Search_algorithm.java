package DataStructure;

import java.util.Scanner;

public class Search_algorithm {
	
	public int findvalue(int arr[],int m,int x,int l,int r) {
		int left=l;
		int right=r;
	
        while (left <= right) 
        {
             m = (left + right) / 2;
             if (arr[m] == x) 
             {
                System.out.println("Item found "+arr[m]+" at index of "+m);
                break;
             } 
             else if (x>arr[m]) 
             {
            	 left = m + 1;
             } 
             else if(x<arr[m]) 
             {
            	 right = m - 1;
             } 
            
        }
        return m;
	}
public static void main(String args[]) {
		
		Search_algorithm b=new Search_algorithm();
		int[] arr=new int[50];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the array size:");
		int size=sc.nextInt();
		
		System.out.println("Enter the values:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number to search");
		int x=sc.nextInt();
		int left=0;
		int right=size-1;
		int m=0;
		
		System.out.println(b.findvalue(arr, m, x, left, right));
	}
	}

