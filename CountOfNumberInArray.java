import java.util.Scanner;
class CountOfNumberInArray 
{
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the elements one by one");
		for (int i=0;i<=a.length-1 ;i++ )
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the number to count");
		int num=sc.nextInt();
		int count=0;
		for (int i=0;i<=a.length-1 ;i++ )
		{
			if (a[i]==num)
			{
				 count++;
			}
		}
		System.out.println(count);
	}
}
