import java.util.Scanner;

public class task2 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        float sum = 0;
        for(int i =0; i<a;i++){
            float b = input.nextInt();
            sum+=b;
        }

        System.out.print(sum/a);


    }
}
