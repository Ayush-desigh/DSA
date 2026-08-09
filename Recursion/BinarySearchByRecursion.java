public class BinarySearchByRecursion {
    public static void main(String[] args) {
        int arr[]={1,5,10,12,26,30};
        int target=30;
        int start=0;
        int end;
        end = arr.length-1;
        System.out.println(binarySearch(arr,target,start,end));


    }
    static int binarySearch(int arr[],int target,int s,int e)
    {
        if(s>e)
        {
            return -1;
        }
        int mid=s+(e-s)/2;
        if(target==arr[mid])
        {
            return  mid;
        }
        if(target < arr[mid])
        {
            return  binarySearch(arr,target,s,mid-1);

        }

        return binarySearch(arr,target,mid+1,e);
    }
}
