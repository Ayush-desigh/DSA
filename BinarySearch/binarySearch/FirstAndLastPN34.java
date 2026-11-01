package binarySearch;import java.lang.reflect.Array;
import java.util.Arrays;

public class FirstAndLastPN34 {
	/*
	 
	 Given an array of integers nums sorted in non-decreasing order, 
	 find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.


	Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
	 */
	
	public static void main(String[] args) {
		
		int arr[]= {5,7,7,7,7,8,8,10};
		
		int ans[]= {-1,-1};
		int target=7;
		
		ans[0]=FirstAndLastPN34.search(arr, target, true);
		if(ans[0]!=-1)
		{
			ans[1]=FirstAndLastPN34.search(arr, target, false);
		}
		System.out.println(Arrays.toString(ans));
		
	}
	
	 static int search(int arr[],int target,boolean findFirstIndex)
	{
		int ans=-1;
		
		int start=0;
		int end=arr.length-1;
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if(arr[mid]>target)
			{
				end=mid-1;
				
			}
			else if(arr[mid]<target)
			{
				start=mid+1;
			}
			else
			{
				ans=mid;
				if(findFirstIndex)
				{
					end=mid-1;
				}
				else
				{
					start=mid+1;
				}
			}
		}
		
		return ans;
	}

}
