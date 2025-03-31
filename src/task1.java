import java.util.Scanner;

public class task1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int massiv[]= new int [a];

        for(int i =1; i<a;i++){
            int b = input.nextInt();
            massiv[i] = b;
        }


        int minNumber = massiv[0];

        for(int i= 0;i<a;i++){
            if(minNumber>massiv[i]){
                minNumber = massiv[i];
            }
        }

        System.out.print(minNumber);
    }
}
