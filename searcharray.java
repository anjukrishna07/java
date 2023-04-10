import java.util.*;

class searcharray
{  
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
    		int i,n,search,flag=0;
		System.out.println("Enter the number of elements:") ;
 		n = sc.nextInt();
		int[] a = new int[n];
 
    		System.out.println("Enter the elements") ;
    		for(i=0;i<n;i++)
    		{
        		a[i] = sc.nextInt();
    		}
		
		System.out.println("Enter the element to be seached");
		search = sc.nextInt();
    		for(i=0;i<n;i++)
    		{
        		if(a[i]==search)
        		{
            			System.out.println("Element "+search+" found at "+i+" position");
            			flag=1;
            			break;
        		}
    		}
    		if(flag==0)
    		{
        		System.out.println("Element "+search+" not found");
    		}
	}
}

output:
Enter the number of elements:
5
Enter the elements
3
4
6
7
2
Enter the element to be seached
4
Element 4 found at 1 position

Another output:


Enter the number of elements:
5
Enter the elements
2
3
6
5
7
Enter the element to be seached
8
