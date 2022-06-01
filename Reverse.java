/******************************************************************************
 *  Compilation:  javac Reverse.java
 *  Execution:    java Reverse
 *  Dependencies: Stack.java StdOut.java StdIn.java
 *
 *  Read a sequence of integers from standard input and print them
 *  in reverse order.
 *
 *  % java Reverse
 *  1 2 3 4 5
 *  5
 *  4
 *  3
 *  2
 *  1
 ******************************************************************************/

public class Reverse {
    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings("SBSC_USE_STRINGBUFFER_CONCATENATION")
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);        // original integer

        // reverse using arithmetic
        int M = 0;
        while (N != 0) {
            M = (10 * M) + (N % 10);
            N = N / 10;
        }
        System.out.println(M);


        // reverse again using string concatenation
        String s = "";
        while (M != 0) {
            int digit = M % 10;
            s = s + digit;
            M = M / 10;
        }
        System.out.println(s);

    }
}
