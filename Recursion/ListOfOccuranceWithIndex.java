import java.util.ArrayList;

public class ListOfOccuranceWithIndex {

    static ArrayList<Integer> occurance(int arr[], int target) {
        return helper(arr, target, 0, new ArrayList<>());
    }

    static ArrayList<Integer> helper(int arr[], int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list; // base case
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return helper(arr, target, index + 1, list); // recursive call
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 4, 5};
        int target = 4;
        System.out.println(occurance(arr, target)); // Output: [3, 4]
    }
}