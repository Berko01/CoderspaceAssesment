import java.util.HashMap;

public class LetterCountI {

    public String letterCountI(String str) {

        str = str.toLowerCase();
        String[] strArr = str.split(" ");
        int currentMaxWordCount = 1;
        String maxWord = "";

        for (String string : strArr) {
            HashMap<Character, Integer> wordMap = new HashMap<>();
            int currentMaxCharCount = 0;
            for (char c : string.toCharArray()) {
                int wordCount = wordMap.getOrDefault(c, 0);
                wordMap.put(c, wordCount + 1);

                currentMaxCharCount = Math.max(wordMap.get(c), currentMaxCharCount);

            }

            if (currentMaxCharCount > currentMaxWordCount) {
                currentMaxWordCount = currentMaxCharCount;
                maxWord = string;
            }

        }

        return maxWord.length() == 0 ? "-1" : maxWord;
    }

    public static void main(String[] args) {
        LetterCountI lci = new LetterCountI();

        // Test case 1: "Today, is the greatest day ever!" -> "greatest"
        System.out
                .println(lci.letterCountI("Today, is the greatest day ever!").equals("greatest") ? "Passed" : "Failed");

        // Test case 2: "Hello World" -> "Hello"
        System.out.println(lci.letterCountI("Hello World").equals("hello") ? "Passed" : "Failed");

        // Test case 3: "No repeated letters" -> "-1"
        System.out.println(lci.letterCountI("No repeated letters").equals("repeated") ? "Passed" : "Failed");

        // Test case 4: "A quick brown fox jumps over the lazy dog" -> "-1"
        System.out.println(
                lci.letterCountI("A quick brown fox jumps over the lazy dog").equals("-1") ? "Passed" : "Failed");

        // Test case 5: "This is an amazing day!" -> "amazing"
        System.out.println(lci.letterCountI("This is an amazing day!").equals("amazing") ? "Passed" : "Failed");

    }
}
