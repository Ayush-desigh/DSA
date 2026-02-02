public class SelectionSort {

    public static void selectionSortAsending(int[] array)
    {


        for(int i=0;i<array.length-1;i++)
        {
            int minPos=i;
            for(int j=i+1;j<array.length;j++)
            {
              if(array[minPos]>array[j])  minPos=j;
            }

            int temp=array[i];
            array[i]=array[minPos];
            array[minPos]=temp;
        }
         for(int i=0;i<array.length;i++)
        {
            System.out.print(" "+array[i]);
        }
        System.out.println();
    }
    public static void selectionSortDesending(int[] array)
    {


        for(int i=0;i<array.length-1;i++)
        {
            int minPos=i;
            for(int j=i+1;j<array.length;j++)
            {
              if(array[minPos]<array[j])  minPos=j;
            }

            int temp=array[i];
            array[i]=array[minPos];
            array[minPos]=temp;
        }
         for(int i=0;i<array.length;i++)
        {
            System.out.print(" "+array[i]);
        }
    }
    


     public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        selectionSortAsending(arr);
         selectionSortDesending(arr);
     }
}
