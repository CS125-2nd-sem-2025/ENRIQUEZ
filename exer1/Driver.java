import java.util.HashMap;
import java.util.Map;

public class Driver {
    public static void main(String[] args) {

        Map<Integer, Integer> memo = new HashMap<>();

        long startTime = System.currentTimeMillis();

        int fibSum = fib(1000, memo);
        System.out.println(fibSum);

        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time (ms): " + (endTime - startTime));

    }


    static int fib(int n, Map<Integer, Integer> memo) {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;

        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        int result = fib(n - 1, memo) + fib(n - 2, memo);
        memo.put(n, result);

        return result;
    }

    static int fib2(int n) {
        if (n < 2) return n;
        return fib2(n - 1) + fib2(n - 2);
    }

}