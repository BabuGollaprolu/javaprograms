import java.util.Scanner;
class  EevenElementsInArray
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the values one by one");
		for (int i=0;i<=a.length-1 ;i++ )
		{
			a[i]=sc.nextInt();
		}
		System.out.println("even elements in a given array");
		for (int i=0;i<=a.length-1 ;i++ )
		{
			if (a[i]%2==0)
			{
				System.out.print(a[i]+"  ");
			}
		}
	}
}
