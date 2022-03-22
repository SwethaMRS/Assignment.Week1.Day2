package week1.day2;

import java.util.Arrays;

public class MissingElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,7,6,8};
		int length = arr.length;
		
		//System.out.println(length);
		Arrays.sort(arr);
		
		for(int i=arr[0];i<=length;i++)
		{
			//System.out.println(arr[i]);
			int val = arr[i+1]-1;
			if(arr[i]!=val)
			{
				System.out.println("The missing element in the array is "+val);
			}
			
		}

	}

}
