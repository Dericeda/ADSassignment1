import java.util.Scanner;
// This function calculates the power of a number 'a' raised to the power 'n' using recursion
// Time complexity: O(n), because the function calls itself 'n' times (linear recursion)
public class task6 {

    public static int powFunction(int a, int n){
        if(n == 1){  //Base case when n will equal 1
            return a;
        }
        else{
            return powFunction(a,n-1)*powFunction(a,1);}    // Recursive calls for power calculation

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int n = input.nextInt();
        System.out.print(powFunction(a,n));
    }
}