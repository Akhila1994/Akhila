import java.util.Scanner;

public class intersection {
	public static void printIntersection(int arr1[], int arr2[], int m, int n)
	{
		System.out.print("Intersection : [");
	  int i = 0, j = 0;
	  while (i < m && j < n)
	  {
	    if (arr1[i] < arr2[j])
	      i++;
	    else if (arr2[j] < arr1[i])
	      j++;
	    else 
	    {
	      System.out.print(arr2[j++]+",");
	      i++;
	    }
	  }
	  System.out.println("]");
	}
	public static void main(String args[]){
		System.out.println("Enter length of first array");
		@SuppressWarnings("resource")
		Scanner inp=new Scanner(System.in);  
		int c1= inp.nextInt();
		int arr1[]=new int[c1];
		System.out.println("Enter the first array:");
		for(int i=0;i<c1;i++)
		{
			arr1[i]=inp.nextInt();
		}
		System.out.println("Enter length of second array");  
		int c2= inp.nextInt();
		int arr2[]=new int[c2];
		System.out.println("Enter the second array:");
		for(int i=0;i<c2;i++)
		{
			arr2[i]=inp.nextInt();
		}
		printIntersection(arr1, arr2, c1, c2);
		
	}
}
