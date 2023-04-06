package estrutuaderepeticao;

import java.util.ArrayList;
import java.util.List;

public class Item09 {
    public static void main(String[] args) {
        String str = "ABC";
        List<String> permutations = generatePermutations(str);
        System.out.println(permutations);
    }

    public static List<String> generatePermutations(String str) {
        List<String> result = new ArrayList<String>();
        if (str.length() == 1) {
            result.add(str);
            return result;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            List<String> permutations = generatePermutations(remaining);
            for (String s : permutations) {
                result.add(c + s);
            }
        }
        return result;
    }
}





