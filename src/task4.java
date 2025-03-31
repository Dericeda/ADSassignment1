
import java.util.Scanner;
// This function calculates the factorial of a number 'a' recursively
// Time complexity: O(a), because the function is called 'a' times until 'a' becomes 0

public class task4 {
    public static int factorialFunction(int a) {
        if(a== 0){
            return 1; // Base case: factorial of 0 is 1
        }else{
            return a*factorialFunction(a-1); // Recursive case: n * factorial(n - 1)
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int factNumber = input.nextInt();

        System.out.print(factorialFunction((factNumber)));

    }
}