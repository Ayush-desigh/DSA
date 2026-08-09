import java.util.Arrays;

public class BubbleSort {

    static void bubbleSort(int arr[])
    {
        boolean swaped;
        for(int i=0;i<arr.length;i++)
        {   swaped=false;
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int swap=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=swap;
                    swaped =true;

                }
            }
            if(swaped==false)
            {
                break;
            }
        }


    }


    public static void main(String[] args) {

        int arr[]={1,30,5,4,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
