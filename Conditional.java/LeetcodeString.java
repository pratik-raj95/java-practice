class Solution {
    public static String LeetcodeString(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];
for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] example1 = {"flower", "flow", "flight"};
        String[] example2 = {"dog", "racecar", "car"};

        System.out.println("Output 1: " + longestCommonPrefix(example1));  
        System.out.println("Output 2: " + longestCommonPrefix(example2));  
    }
}

        