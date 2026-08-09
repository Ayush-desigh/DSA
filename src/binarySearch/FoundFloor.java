package binarySearch;

public class FoundFloor {

	
	// smallest elements in array greater or =target   and floor is opposite of it
		// arr[]={2,3,5,9,14,16,18}
		//target=15;
		//Floor(arrr,target)==>14
		//Floor(arr,target=14_==> 14
	
	public static void main(String[] args) {
		
		int arr[]= {2,3,5,9,14,16,18};
		int target=15;
		System.out.println(floor(arr, target));
		
	}
	
	static int floor(int arr[],int target)
	{
		int start=0;
		int end=arr.length-1;
		
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			
			if(arr[mid]==target)
			{
				return mid;
			}
			else if(arr[mid]>target)
			{
				end=mid-1;
			}
			else if(arr[mid]<target)
			{
				start=mid+1;
			}
		}
		
		return arr[end];
		
	}
}
