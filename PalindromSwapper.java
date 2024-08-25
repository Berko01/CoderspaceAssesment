public class PalindromSwapper {

    public boolean isPalindrome(String str) {

        for (int i = 0; i < str.length() / 2; i++) {
            if (!(str.charAt(i) == str.charAt(str.length() - i - 1)))
                return false;
        }

        return true;
    }

    public String palindromeSwapper(String str) {

        StringBuilder stringBuilder = new StringBuilder(str);

        if(isPalindrome(str))
            return str;

        for (int i = 0; i < stringBuilder.length() - 1; i++) {
            char nextChar = stringBuilder.charAt(i + 1);
            char currentChar = stringBuilder.charAt(i);

            stringBuilder.setCharAt(i, nextChar);
            stringBuilder.setCharAt(i + 1, currentChar);

            if (isPalindrome(stringBuilder.toString()))
                return stringBuilder.toString();

            stringBuilder = new StringBuilder(str);
        }
        return "-1";

    }

    public static void main(String[] args) {
        PalindromSwapper ps = new PalindromSwapper();

        // Test case 1: "rcaecar" -> "racecar"
        System.out.println(
                ps.palindromeSwapper("rcaecar").equals("racecar") ? "Test Case 1 Passed" : "Test Case 1 Failed");

        // Test case 2: "abccba" -> "abccba"
        System.out
                .println(ps.palindromeSwapper("abccba").equals("abccba") ? "Test Case 2 Passed" : "Test Case 2 Failed");

        // Test case 3: "abccaa" -> "-1"
        System.out.println(ps.palindromeSwapper("abccaa").equals("-1") ? "Test Case 3 Passed" : "Test Case 3 Failed");

        // Test case 4: "a" -> "a"
        System.out.println(ps.palindromeSwapper("a").equals("a") ? "Test Case 4 Passed" : "Test Case 4 Failed");

        // Test case 5: "abab" -> "-1"
        System.out.println(ps.palindromeSwapper("abab").equals("baab") ? "Test Case 5 Passed" : "Test Case 5 Failed");
    }
}
