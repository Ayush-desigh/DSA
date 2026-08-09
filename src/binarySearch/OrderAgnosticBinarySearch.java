package binarySearch;

public class OrderAgnosticBinarySearch {
	
	public static void main(String[] args) {
		
		int arr[]= {89,45,22,18,16,15,4,3,2,0,-12,-18};
		int target=18;
		
		int ans=binarysearch(arr, target);
		System.out.println(ans);
	}
	
	static int binarysearch(int arr[],int target)
	{
		
			int start=0;
			int end=arr.length-1;
		
			boolean isAgno= arr[start]>arr[end];
			
			while(start<=end)
			{
				int mid=start+(end-start)/2;
				
				if(arr[mid]==target)
				{
					return mid;
				}
				
				if(isAgno)
				{
					if(arr[mid]>target)
					{
						start=mid+1;
					}
					else if(arr[mid]<target)
					{
						end=mid-1;
					}
					
				}
				else
				{
					
					if(arr[mid]>target)
					{
						end=mid-1;
					}
					else if(arr[mid]<target)
					{
						start=mid+1;
					}
					
				}
			}
		
		
		return -1;
	}

}
