public class WordCount {
    public int wordCount(String str) {
        str = str.trim();
        
        String[] strArr = str.split(" ");

        return strArr.length;
    }

    public static void main(String[] args) {
        WordCount wc = new WordCount();

        // Test case 1: "Never eat shredded wheat" -> 4
        System.out.println(wc.wordCount("Never eat shredded wheat") == 4 ? "Passed" : "Failed");

        // Test case 2: "Hello World" -> 2
        System.out.println(wc.wordCount("Hello World") == 2 ? "Passed" : "Failed");

        // Test case 3: "This is a test case" -> 5
        System.out.println(wc.wordCount("This is a test case") == 5 ? "Passed" : "Failed");

        // Test case 4: "OneWord" -> 1 (Tek kelime)
        System.out.println(wc.wordCount("OneWord") == 1 ? "Passed" : "Failed");

        // Test case 5: "" -> 1 (Boş string, bir kelime olarak sayılır)
        System.out.println(wc.wordCount("") == 1 ? "Passed" : "Failed");

        // Test case 6: " a b c " -> 3 (Boşluklarla ayrılmış 3 kelime)
        System.out.println(wc.wordCount(" a b c ") == 3 ? "Passed" : "Failed");
    }
}
