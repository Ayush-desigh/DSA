package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
	
		
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int [] arr= {10,20,30,40,50,60,70,80,90,100};
//		System.out.println("Please enter number");
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
//		System.out.println(Arrays.toString(arr));
		
//		System.out.println(findtargetIndex(arr, 80));
		System.out.println(Arrays.toString(arr));
		reverse(arr, 5, 9);
		System.out.println(Arrays.toString(arr));
	}
	
	
//	static int findtargetIndex(int[] arr, int target)
//	{
//		if(arr.length==0)
//		{
//			return -1;
//		}
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]==target)
//			{
//				return i;
//			}
//		}
//		
//		return -1;
//	

	static void swap(int arr[],int first,int second)
	{
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}

	
	static void reverse(int arr[])
	{	int start=0;
	int end=arr.length-1;
	
		while(start<=end)
		{
			swap(arr,start,end);
			start++;
			end--;
		}
		
	}
	static void reverse(int arr[],int s,int e)
	{	int start=s;
	int end=e;
	
		while(start<=end)
		{
			swap(arr,start,end);
			start++;
			end--;
		}
		
	}
}
