public class PalindromCreator {

    public boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (!(str.charAt(i) == str.charAt(str.length() - 1 - i)))
                return false;
        }
        return true;
    }

    public String palindromeCreator(String str) {

        int right = str.length() - 1;
        int left = 0;

        if (isPalindrome(str))
            return "palindrome";

        while (left < right) {
            if (str.charAt(right) != str.charAt(left)) {
                if (isPalindrome(str.substring(left + 1, right + 1)))
                    return String.valueOf(str.charAt(left));
                if (isPalindrome(str.substring(left, right)))
                    return String.valueOf(str.charAt(right));
                if (isPalindrome(str.substring(left + 1, right)))
                    return String.valueOf(str.charAt(left)) + String.valueOf(str.charAt(right));

                return "not possible";
            }

            left++;
            right--;
        }
        return "not possible";
    }

    public static void main(String[] args) {
        PalindromCreator pc = new PalindromCreator();

        // Test case 1: "abjchba" -> "jc"
        System.out.println(pc.palindromeCreator("abjchba").equals("jh") ? "Passed" : "Failed");

        // Test case 2: "racecar" -> "palindrome"
        System.out.println(pc.palindromeCreator("racecar").equals("palindrome") ? "Passed" : "Failed");

        // Test case 3: "abca" -> "b"
        System.out.println(pc.palindromeCreator("abca").equals("b") ? "Passed" : "Failed");

        // Test case 4: "abcdef" -> "not possible"
        System.out.println(pc.palindromeCreator("abcdef").equals("not possible") ? "Passed" : "Failed");

        // Test case 5: "aabbcc" -> "aa"
        System.out.println(pc.palindromeCreator("aabbcc").equals("not possible") ? "Passed" : "Failed");

        // Test case 6: "abcda" -> "b"
        System.out.println(pc.palindromeCreator("abcda").equals("bd") ? "Passed" : "Failed");

        // Test case 7: "madam" -> "palindrome"
        System.out.println(pc.palindromeCreator("madam").equals("palindrome") ? "Passed" : "Failed");
    }
}
