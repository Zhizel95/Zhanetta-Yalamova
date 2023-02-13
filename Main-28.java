import java.util.*;

public class Main {
    public static void main(String[] args) {
      printFibonacci(13);
  }
  public static int findFibonacciRecurtion (int n){
        if ((n==1)|| (n==2))
            return 1;
        else
            return findFibonacciRecurtion(n-1) + findFibonacciRecurtion(n-2) ;

    }
    public static void printFibonacci(int n){
        for (int i = 1;i<=n;i++) {
            System.out.print(findFibonacciRecurtion(i) + " ");
        }
        System.out.println();
    }
}