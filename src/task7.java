import java.util.Scanner;

public class task7 {

    public static void reverseFunction(int n, Scanner input){
        if (n == 0) {
            return;
        }

        int x = input.nextInt();
        reverseFunction(n-1,input);
        System.out.print(x +" ");
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        reverseFunction(a, input);
    }


}