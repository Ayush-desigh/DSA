public class SortedArrayOrNot
{
    static boolean sortedOrNot(int n[])
    {
        return helper(n,0);
    }
    static boolean helper(int arr[], int  index)
    {
        if(index==arr.length-1)
        {
            return true;
        }
        return arr[index]<arr[index+1] && helper(arr,index+1);
    }
    public static void main(String[] args) {
        int n[]={1,2,10,4,5};
        System.out.println(sortedOrNot(n));
    }
}
