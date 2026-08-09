public class LinearSearchInArray
{
    public static void main(String[] args) {
        int arr[]={1,5,78,100,25,63};
        int target=85;
        System.out.println(searchWithIndex(arr,target,0));

    }
    static boolean search(int arr[],int target,int index)
    {
        if(index==arr.length)
        {
            return false;
        }
        return arr[index]==target || search(arr,target,index+1);
    }

    static int searchWithIndex(int arr[],int target,int index)
    {
        if(index==arr.length)
        {
            return -1;
        }
        if(arr[index]==target)
        {
            return index;
        }
        else
        {
            return searchWithIndex(arr,target,index+1);
        }

    }
}
