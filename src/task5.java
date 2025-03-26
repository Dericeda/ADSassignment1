import java.util.Scanner;

public class task5 {
    public static int fibonacciFunction(int a) {
        if(a==1){
            return 1;
        }
        else if(a==0){
            return 0;
        }else{
            return fibonacciFunction(a-1)+fibonacciFunction(a-2);
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fibNumber = input.nextInt();

        System.out.print(fibonacciFunction((fibNumber)));

    }
}