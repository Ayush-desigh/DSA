package binarySearch;

public class GFGproblem1 {
	
	
	/*
	 Find position of an element in a sorted array of infinite numbers
	 
	 Given a sorted array arr[] of infinite numbers. The task is to search for an element k in the array.
	 
	 Examples:

Input: arr[] = [3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170], k = 10
Output: 4
Explanation: 10 is at index 4 in array.

Input: arr[] = [2, 5, 7, 9], k = 3
Output: -1
Explanation: 3 is not present in array.

	 */
	
	public static void main(String[] args) {
		
		int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170,180,190,210};
		int k = 170;
		System.out.println(GFGproblem1.range(arr, k));
		
	}
	
	 static int range(int arr[],int target)
	{
		int ans=-1;
		int end=1;
		int start=0;
		while(target>=arr[end])
		{
			int newStart=end+1;
			end=end+(end-start+1)*2;
			
			start=newStart;
			
		}
		return GFGproblem1.binarySearch(arr, target,start, end);
	}
	
	  static int binarySearch(int arr[],int target,int start,int end)
	{
		int ans=-1;
				
		
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if(arr[mid]<target)
			{
				start=mid+1;
			}
			else if(arr[mid]>target)
			{
				end=mid-1;
			}
			else
			{
				return mid;
			}
		}
		return ans;
	}

}
