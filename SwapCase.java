public class SwapCase {
    public String swapCase(String str) {

        StringBuilder stringBuilder = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c))
                    c = Character.toLowerCase(c);
                else
                    c = Character.toUpperCase(c);
            }

            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        SwapCase sc = new SwapCase();

        // Test case 1: "Hello World" -> "hELLO wORLD"
        System.out.println(sc.swapCase("Hello World").equals("hELLO wORLD") ? "Passed" : "Failed");

        // Test case 2: "1234!@#aBc" -> "1234!@#AbC"
        System.out.println(sc.swapCase("1234!@#aBc").equals("1234!@#AbC") ? "Passed" : "Failed");

        // Test case 3: "sWAPcASE" -> "SwapCase"
        System.out.println(sc.swapCase("sWAPcASE").equals("SwapCase") ? "Passed" : "Failed");

        // Test case 4: "Java123" -> "jAVA123"
        System.out.println(sc.swapCase("Java123").equals("jAVA123") ? "Passed" : "Failed");
    }
}
