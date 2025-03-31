import java.util.Scanner;

public class task3 {

    public static boolean isPrime(int a){
        if(a<=1){
            return false;
        }else if(a>=2){
            for(int i = 2; i <=Math.sqrt(a);i++){
                if(a%i == 0){
                    return false;
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
