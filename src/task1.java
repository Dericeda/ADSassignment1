import java.util.Scanner;

public class task1 {
//    this function calculates minimum value of the numbers, we have Maximum value as a default
//    for comparing values which will be taken by input
//    time complexity O(a), which means time complexity depends on input a
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
