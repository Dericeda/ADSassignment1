import java.util.Scanner;
// This function calculates the Fibonacci number at position 'a' using recursion
// Time complexity: O(2^a), because the function makes two recursive calls for each position, leading to an exponential number of calls

public class task5 {
    public static int fibonacciFunction(int a) {
        if(a==1){  //Base case when a == 1
            return 1;
        }
        else if(a==0){ //Base case when a == 0
            return 0;
        }else{
            return fibonacciFunction(a-1)+fibonacciFunction(a-2); // Recursive calls for Fibonacci numbers
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fibNumber = input.nextInt(); // Read the position of the Fibonacci number

        System.out.print(fibonacciFunction((fibNumber))); // Print the Fibonacci number at the given position

    }
}