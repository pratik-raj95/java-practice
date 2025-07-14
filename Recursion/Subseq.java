public class Subseq {
    public static void main(String[] args) {
        String s = "abc";
        subseq(s, 0, "");
    }

    public static void subseq(String s, int i, String ans) {
      
        if (i == s.length()) {
            System.out.println(ans);
            return;
        }

        // Include 
        subseq(s, i + 1, ans + s.charAt(i));

        // Exclude 
        subseq(s, i + 1, ans);
    }
}