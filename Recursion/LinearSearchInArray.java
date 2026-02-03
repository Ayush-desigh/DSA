public class LinearSearchInArray
{
    static boolean search(int arr[],int target,int index)
    {
        if(index==arr.length)
        {
            return false;
        }
        return arr[index]==target || search(arr,target,index+1);
    }
    public static void main(String[] args) {
        int arr[]={1,5,78,100,25,63};
        int target=85;
        System.out.println(search(arr,target,0));

    }
}
