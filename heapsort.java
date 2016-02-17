//Heapsort
//cite:Yabin Han
public class heapsort 
{
	public static void main(String args [])
	{
		int a[]={2,1,4,6,10,3,8,3};
		sort(a);
		print(a);
	}
	public static void sort(int a[])
	{
		makeHeap(a);
		for(int i = a.length - 1;i >= 1;i--)
		{
			swap(a,0,i);
			maxHeap(a,i,0);
		}
	}
	private static void makeHeap(int [] a)
	{
		for(int i = a.length / 2;i >= 0;i--)
			maxHeap(a,a.length,i);
	}
	private static void maxHeap(int a[],int size,int parent)
	{
		int leftChild = parent * 2 + 1;
		int rightChild = parent * 2 + 2;
		int root = parent;
		if(leftChild < size && a[leftChild] > a[root])
			root = leftChild;
		if(rightChild < size && a[rightChild] > a[root])
			root = rightChild;
		if(root != parent)
		{
			swap(a,parent,root);
			maxHeap(a,size,root);
		}
	}
	private static void swap(int a[],int i,int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static void print(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

