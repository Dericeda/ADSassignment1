
import java.util.Scanner;

public class task4 {
    public static int factorialFunction(int a) {
        if(a== 0){
            return 1;
        }else{
            return a*factorialFunction(a-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int factNumber = input.nextInt();

        System.out.print(factorialFunction((factNumber)));

    }
}