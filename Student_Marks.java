import java.util.*;   
public class Student_Marks
{ 
    public static void main(String args[]) 
    {   
        Scanner sc = new Scanner(System.in); 
        int n;   
        
        System.out.println("Enter the total subjects ");
        n=sc.nextInt();
        int arr[] = new int[n]; 
        System.out.println("Enter the marks secured in each subject ");
        for(int i=0;i<n;i++) 
        {
            arr[i]=sc.nextInt();
        }
           int total=0;
        for(int i=0;i<n;i++)
        {
            total=total+arr[i];
        }
        System.out.println("The total marks obtained is "+total);
        float percentage; 
        percentage = (total / (float)n); 
        System.out.println( "Total Percentage : " + percentage + "%");                         
    }   
}

output:
Enter the total subjects 
6
Enter the marks secured in each subject 
70
75
80
78
86
82
The total marks obtained is 471
Total Percentage : 78.5%

