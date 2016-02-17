import java.io.FileInputStream;
import java.util.Scanner;
public class binarySearch {
	public static void main(String args [])throws Exception{
		Scanner input = new Scanner(System.in);
		System.out.println("please input the file path");
		String s = input.next();
		inputFile(s);
		input.close();

	}
	public static void inputFile(String s)throws Exception{
		Scanner filePath=new Scanner(new FileInputStream(s));
		int array[] = null;
		int keyNum;
		int loop = filePath.nextInt();
		while(loop>0){
			int arrayLength=filePath.nextInt();
			array = new int[arrayLength];
			for(int i=0;i<arrayLength;i++){
				array[i] = filePath.nextInt();
			}
			keyNum = filePath.nextInt();
			System.out.println(search(array,keyNum));
			loop--;
		}
		filePath.close();
		
	}
	public static String search(int [] arr, int key) {
		 int iterationNum = 0;
	     int start = 0;
	     int end = arr.length-1;
	     while (start <= end) {
	    	 iterationNum++;
	    	 int middle = (start + end) / 2;
	         if (key < arr[middle]) {
	        	 end = middle - 1;
	         } else if (key > arr[middle]) {
	        	  start = middle + 1;
	         } else {
	        	 return "The index of search number is "+middle+"  The iteration number is "+iterationNum;
	         }
	     }
	     return "NOT FOUND The iteration number is "+iterationNum;
	}
}
