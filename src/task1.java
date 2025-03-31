import java.util.Scanner;

public class task1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int minNumber = Integer.MAX_VALUE;;

        for(int i =0; i<a;i++){
            int b = input.nextInt();
            if(b<minNumber){
                minNumber = b;
            }
        }

        System.out.print(minNumber);

        }


}
