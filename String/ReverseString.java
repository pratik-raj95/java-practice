import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        String str = "i am learning";
        StringBuilder sb = new StringBuilder();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {  // use single quotes for characters
                sb.append(ch);
            } else {
                result += sb.reverse().toString() + " ";
                sb.setLength(0); // clear the builder
            }
        }

        result += sb.reverse(); // last word
        System.out.println(result); // Output: i ma gninrael
    }
}
