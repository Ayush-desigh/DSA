public class printDecreasing {

    public static void printDecreasing(int n) {
        if (n == 0) {
            System.out.println(); 
            return;
        }
        System.out.print(n + " ");
        printDecreasing(n - 1);
    }

    public static void printIncreasing(int n) {
        if (n == 0) {
            return;
        }
        printIncreasing(n - 1);
        System.out.print(n + " ");
    }
    public static int facrtorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * facrtorial(n - 1);
    }
        public static int sum(int n) 
        {
                if (n == 0) 
                {
                   return 0;
                }

                int sum=sum(n-1);
                int sum1=n+sum(n-1);
                return sum1;
                        
                    }

        public static int fib(int n)
        {
            if (n == 0) {
                return 0;
            }
            if (n == 1) {
                return 1;
            }
            return fib(n - 1) + fib(n - 2);
        }
    public static void main(String[] args) {
        int n=10;
        System.out.println(fib(n));
        

    }
}
