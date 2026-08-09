public class firstOccurance {

    public static int firstOccurance1(int arr[],int key,int i)
    {
        if(i==arr.length-1)
        {
            return -1;
        }
        if(arr[i]==key)
        {
            return i;
        }
        return firstOccurance1(arr, key, i+1);
    }


    public static void main(String[] args) {
        
        int arr[]={2,8,5,9,7,5,8,6};
        int key=8;
        System.out.println(firstOccurance1(arr, key, 0));
    }
    
}
