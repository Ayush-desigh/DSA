public class Palindrome {

    static int sum = 0;

    public static int reverse(int n) {
        if (n == 0) {
            return sum;
        }
        int k = n % 10;
        sum = sum * 10 + k;
        return reverse(n / 10);
    }

    static boolean palindrome(int n) {
        sum = 0; // reset before each call
        return n == reverse(n);
    }

    public static void main(String[] args) {
        System.out.println(reverse(12345));   // Output: 54321
        sum = 0; // reset before next call
        System.out.println(palindrome(1331)); // Output: true
        System.out.println(palindrome(1234)); // Output: false
    }
}