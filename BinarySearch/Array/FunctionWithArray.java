package Array;

import java.util.Arrays;

public class FunctionWithArray { 
	
	public static void main(String[] args)
	{
		int arr[] ={10,20,30,40};
		System.out.println(Arrays.toString(arr));
		change(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void change(int arr1[])
	{
		arr1[0]=100;
	}

}
// if we change in reference so actual array also change