import java.io.FileInputStream;
import java.util.Scanner;

public class quickSort 
{
	public static void main(String args []) throws Exception
	{
		System.out.println("Please input the file path");
		Scanner in=new Scanner(System.in);
		String s=in.next();		
		inputFile(s);
		int a[]=inputFile(s);
		System.out.println("The input array is :");
		print(a);
		int Lpoint=0;
		int Rpoint=a.length-1;
		QuickSort(a,Lpoint,Rpoint);
		
		System.out.println("After quick sort the array is:");
		print(a);
		in.close();		
	}
	public static int [] inputFile(String Filepath) throws Exception
	{
		Scanner inputPath = new Scanner(new FileInputStream(Filepath));
		int n[]=null;
		while(inputPath.hasNextInt())
		{
			int arrayLength=inputPath.nextInt();
			n=new int[arrayLength];
			for(int i=0;i<arrayLength;i++)
			{
				n[i]=inputPath.nextInt();
			}
		}
		inputPath.close();
		return n;
	}
	public static void QuickSort(int a[],int l,int r)
	{
		int i=l;
		int j=r;
		int m=(i+j)/2;
		int pivot=a[m];
		if(a.length==0||a==null)
			return;
		if(l<r)	
		{
			while(i<=j)
			{

				while(a[i]<pivot)
				{
					i++;
				}
				while(a[j]>pivot)
				{
					j--;
				}
//				if(a[i] == a[j])
//				{
//					break;
//				}
				if(i<j)
				{
					int t;
					t=a[i];
					a[i]=a[j];
					a[j]=t;

				}
				if(i==j||a[i]==a[j])
					break;
			}
			QuickSort(a,i+1,r);
			QuickSort(a,l,j-1);
		}
	}

	public static void print(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
