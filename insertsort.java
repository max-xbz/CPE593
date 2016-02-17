
public class insertsort
{
	public static void main(String args [])
	{
		int a[]={5,3,1,4};
		insertSort(a);
		print(a);
	}
	public static void insertSort(int a[])
	{
		for(int i=1;i<a.length;i++)
		{
			if(a[i-1]>a[i])
			{
				int temp=a[i];
				int j=i;
				while(j>0&&a[j-1]>temp)  
				{
					a[j]=a[j-1];
					j--;
				}
				a[j]=temp;
			}
		}
	}

	public static void print(int a[])
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}
