import java.util.Scanner;
public class task8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();

        if (s.matches("[0-9]+")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}