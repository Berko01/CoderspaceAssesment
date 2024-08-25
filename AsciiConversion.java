public class AsciiConversion {

    public String asciiConversion(String str) {

        StringBuilder stringBuilder = new StringBuilder("");

        for (char c : str.toCharArray()) {
            if (c != ' ') {
                int ascii = (int) c;
                stringBuilder.append(ascii);
            }
        }

        return stringBuilder.toString();

    }

    public static void main(String[] args) {
        AsciiConversion ac = new AsciiConversion();

        // Test case 1: "dog" -> "100111103"
        System.out.println(ac.asciiConversion("dog").equals("100111103") ? "Test Case 1 Passed" : "Test Case 1 Failed");

        // Test case 2: "hello world" -> "104101108108111119111114108100"
        System.out.println(
                ac.asciiConversion("hello world").equals("104101108108111119111114108100") ? "Test Case 2 Passed"
                        : "Test Case 2 Failed");
        // Test case 3: "ASCII" -> "6583677373"
        System.out.println(
                ac.asciiConversion("ASCII").equals("6583677373") ? "Test Case 3 Passed" : "Test Case 3 Failed");
        // Test case 4: " " -> "" (Only space)
        System.out.println(ac.asciiConversion(" ").equals("") ? "Test Case 4 Passed" : "Test Case 4 Failed");

        // Test case 5: "123 ABC" -> "495051656667"
        System.out.println(
                ac.asciiConversion("123 ABC").equals("495051656667") ? "Test Case 5 Passed" : "Test Case 5 Failed");
    }
}
