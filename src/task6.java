import java.util.Scanner;

public class task6 {

    public static int powFunction(int a, int n){
        if(n == 1){
            return a;
        }
        else{
            return powFunction(a,n-1)*powFunction(a,1);}

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int n = input.nextInt();
        System.out.print(powFunction(a,n));
    }
}