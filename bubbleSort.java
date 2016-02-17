
public class bubbleSort 
{
	public static void main(String args[])
	{
		int a[]={3,11,4,2,6,7,10};
		//bubblesort(a);
		bubble_Sort(a);
		print(a);
	}
	public static void bubblesort(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp;
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public static void print(int a[])
	{
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
	public static void bubble_Sort(int[] arr) {
	      boolean swapped = true;
	      int j = 0;
	      int tmp;
	      while (swapped) {
	            swapped = false;
	            j++;
	            for (int i = 0; i < arr.length - j; i++) {                                       
	                  if (arr[i] > arr[i + 1]) {                          
	                        tmp = arr[i];
	                        arr[i] = arr[i + 1];
	                        arr[i + 1] = tmp;
	                        swapped = true;
	                  }
	            }                
	      }
	}
}
