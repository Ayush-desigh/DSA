public class BubbleSort
{
     public static void bubbleSort(int[] array) {
        int n = array.length;
        // Outer loop for each pass
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if current element is greater than the next
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for(int i=0;i<array.length;i++)
        {
            System.out.print(" "+array[i]);
        }
    }

     public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
     }
}