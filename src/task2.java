import java.util.Scanner;
// This function calculates the average of 'a' numbers
// We initialize the sum variable to 0, then sum the 'a' input numbers
// Time complexity: O(a), because we loop over all 'a' input numbers once
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
