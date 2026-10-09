import java.util.*;

public class collections {
    public static void main(String[] args) {
        String digits = "23";

        String[] letters = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        List<String> result = new ArrayList<>();
        result.add("");

        for (int i = 0; i < digits.length(); i++) {
            String s = letters[digits.charAt(i) - '0'];
            List<String> temp = new ArrayList<>();

            for (String str : result) {
                for (char c : s.toCharArray()) {
                    temp.add(str + c);
                }
            }

            result = temp;
        }

        System.out.println(result);
    }
}
