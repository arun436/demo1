
import java.util.Scanner;
public class Arun 
{ 
    public static void rightTriangle(int n) 
    { 
        int i;  
        for(i=1; i<=n; i++)
        {
        	for(int k=n-1;k>=i;k--)
        	{
        		System.out.print(" ");
        	}
        	for(int j=1;j<=i;j++)
        	{
        		System.out.print("* ");
        	}
        	System.out.println();
        } 
    }
     
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
        sc.close();
        Arun a = new Arun();
        a.rightTriangle(n);
    } 
}