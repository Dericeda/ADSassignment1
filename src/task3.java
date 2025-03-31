import java.util.Scanner;
// This function checks if a number 'a' is prime or composite
// Time complexity: O(sqrt(a)), because we only need to check divisibility up to the square root of 'a'
public class task3 {

    public static boolean isPrime(int a){
        if(a<=1){ // Numbers <= 1 are not prime
            return false;
        }else if(a>=2){
            for(int i = 2; i <=Math.sqrt(a);i++){   // Check divisibility from 2 to sqrt(a)
                if(a%i == 0){
                    return false;   // Not prime if divisible by any number
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(isPrime(a)){
            System.out.print("Prime");
        }else{
            System.out.print("Composite");
        }

    }
}
