import java.util.*;

public class task7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        List<String> result = new ArrayList<>();
        permutationFunction(s.toCharArray(), 0, result);

        for (String str : result) {
            System.out.println(str);
        }
    }

    public static void permutationFunction(char[] massiv, int index, List<String> result) {
        if (index == massiv.length) {
            result.add(new String(massiv));
            return;
        }


        for (int i = index; i < massiv.length; i++) {
            swap(massiv, i, index);
            permutationFunction(massiv, index + 1, result);
            swap(massiv, i, index);
        }
    }

    public static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
