

public class ConsonantCount {

    public boolean isVowel(char c) {
        String vowels = "aeiouAEIOU";

        if (vowels.indexOf(c) == -1)
            return false;
        else
            return true;

    }

    public int consonantCount(String str) {
        int count = 0;

        str = str.trim();

        for (char c : str.toCharArray()) {

            if (Character.isLetter(c)) {

                if (isVowel(c))
                    continue;
                count++;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        ConsonantCount cc = new ConsonantCount();

        // Test case 1: "hello world" -> 7
        System.out.println(cc.consonantCount("hello world") == 7 ? "Passed" : "Failed");

        // Test case 2: "aeiou" -> 0
        System.out.println(cc.consonantCount("aeiou") == 0 ? "Passed" : "Failed");

        // Test case 3: "AEIOU" -> 0
        System.out.println(cc.consonantCount("AEIOU") == 0 ? "Passed" : "Failed");

        // Test case 4: "bcdfghjklmnpqrstvwxyz" -> 21
        System.out.println(cc.consonantCount("bcdfghjklmnpqrstvwxyz") == 21 ? "Passed" : "Failed");

        // Test case 5: "The quick brown fox jumps over the lazy dog" -> 24
        System.out.println(cc.consonantCount("The quick brown fox jumps over the lazy dog") == 24 ? "Passed" : "Failed");
    
    }
}
