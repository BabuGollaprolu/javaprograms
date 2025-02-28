class FrequencyOfAnElement 
{
	public static void main(String[] args) 
	{
		int a[]={1,2,5,1,8,2,5,9,6};
		for (int i=0;i<a.length ;i++ )
		{
			int count=0;
			boolean visted=false;
			for (int j=0;j<i;j++) 
			{
				if (a[j]==a[i]) 
				{
					visted=true;
					break;
				}	
			}
			if (visted==false)
			 {
				for(int k=i;k<a.length;k++)
				{
					if(a[i]==a[k])
					{
						count++;
					}
				}
				System.out.println(a[i]+" is presented "+count+ "times");
			}
			
		}
		
	}
}
