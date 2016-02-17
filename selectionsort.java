
public class selectionsort 
{
	public static void main(String args[])
	{
		int a[]={5,3,1,4};
		selectionSort(a);
		print(a);
	}
	public static void selectionSort(int a[])
	{
		for(int j=a.length-1;j>0;j--)
		{
			int max=a[0];
			int index=0;
			for(int i=0;i<=j;i++)
			{
				if(a[i]>max)
				{
					max=a[i];
					index=i;
				}

			}
			int temp;
			temp=a[index];
			a[index]=a[j];
			a[j]=temp;
		}
	}
	public static void print(int a[])
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}
