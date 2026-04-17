import java.util.LinkedList;
import java.util.Queue;

public class negative {

    public static Long[] findNegative(int[] arr, int k) {
        Queue<Integer> queue = new LinkedList<>();
        int index = 0;

        // First window
        while (index < k) {
            if (arr[index] < 0) {
                queue.offer(arr[index]);
            }
            index++;
        }

        Long res[] = new Long[arr.length - k + 1];
        res[0] = (long) (queue.isEmpty() ? 0 : queue.peek());

        // Remaining windows
        for (int i = 1; i <= arr.length - k; i++) {
            if (arr[i - 1] < 0) {
                queue.poll();
            }
            if (arr[i + k - 1] < 0) {
                queue.offer(arr[i + k - 1]);
            }
            res[i] = (long) (queue.isEmpty() ? 0 : queue.peek());
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        Long[] ans = findNegative(arr, 3);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
