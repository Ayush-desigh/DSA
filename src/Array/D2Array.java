package Array;

import java.util.Arrays;
import java.util.Scanner;

public class D2Array {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[3][4];
		
		int[][] arr1= {
				
				{1,2,3},{4,5,6},{7,8,9}
				
		};
		
		findIndexTarget(arr1, 9);
		
//		System.out.println("Enter value");
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=0;j<arr[i].length;j++)
//			{
//				arr[i][j]=sc.nextInt();
//			}
//		}
//		for(int i=0;i<arr1.length;i++)
//		{
//			for(int j=0;j<arr1[i].length;j++)
//			{
//				System.out.print(arr1[i][j]);
//			}
//			System.out.println();
//		}
//		
	}
	
	static void findIndexTarget(int[][] arr1,int target)
	{
		if(arr1.length==0 || arr1==null)
		{
			System.out.println("-1");
			return;
		}
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				if(arr1[i][j]==target)
				{
					System.out.println(i+","+j);
					return;
				}
			}
		}
		System.out.println("-1");;
	}

}
