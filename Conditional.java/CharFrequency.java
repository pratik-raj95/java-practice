public class CharFrequency {
    public static void main(String[] args) {
        String s = "aaaabbbcckknnooxyz";
        for (int i = 0; i < s.length();) {
            int j = i;
            while (j < s.length() && s.charAt(i) == s.charAt(j)) {
                j++;
            }
            int count = j - i; 
            System.out.println(s.charAt(i) + " -> " + count);
            i = j; 
        }
    }
}
