import java.util.*;
public class mergeSort {
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    public static void merge(int[] array, int si, int mid, int ei) {
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei)
        {
            if(array[i]<array[j])
            {
                temp[k]=array[i];
                i++;
            }
            else 
            {
                temp[k]=array[j];
                j++;
            }
            k++;
        }

        while(i<=mid)
        {
            temp[k++]=array[i++];
        }
        while(j<=ei)
        {
            temp[k++]=array[j++];
        }

        for(k=0, i=si;k<temp.length;k++, i++)
        {
            array[i]=temp[k];
        }
      
    }

    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Unsorted array:");
        System.out.println(Arrays.toString(array));
        mergeSort(array, 0, array.length - 1);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }
}