import java.util.Scanner;
//import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Alex Jerez on 3/19/15.
 */
public class Sieve {


    public static void main(String[] args) {

        long N;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the prime number: ");
        N = sc.nextLong();
        sc.close();

        //boolean[] isPrime = new boolean[1];
        //ArrayList<Long> primeNums = new ArrayList<Long>();
        //ArrayList<Long> factors = new ArrayList<Long>();
        Stack<Long> stack = new Stack<Long>();

        //isPrime[0] = false;

        for (long i = 2; i <= N; i++) {
            for (long A = N; A % i == 0; A++){
                if (A % i == 0){
                    stack.push(A/i);
                    System.out.println(stack.peek());
                }
		if(stack.peek()<=839){
			printNums(stack);
		}
            }
        }
        System.out.println("All numbers done.");
    }
    public static boolean isItPrime(long n){
        if (n%2==0) return false;
        for (int i=3;i*i<=n;i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void printNums(Stack<Long> st){
        for (long num:st){
            if(isItPrime(num)){
		System.out.print("Prime Factor: ");
                System.out.println(num);
            }
        }
    }

}
