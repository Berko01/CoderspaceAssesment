public class StringPeriods {

    public String stringPeriods(String str) {

        // abababab
        if(str.length()==1)
            return "-1";

        for (int i = str.length() / 2; i >= 1; i--) {
            if (str.length() % i == 0) {

                int repeatTime = str.length() / i;
                String repeatWord = str.substring(0, i);
                StringBuilder stringBuilder = new StringBuilder();

                for (int j = 0; j < repeatTime; j++) {
                    stringBuilder.append(repeatWord);
                }

                if (stringBuilder.toString().equals(str))
                    return repeatWord;

            }
        }


        return "-1";

    }

    public static void main(String[] args) {
        StringPeriods sp = new StringPeriods();

        // Test case 1: "abcababcababcab" -> "abcab"
        System.out.println(sp.stringPeriods("abcababcababcab").equals("abcab") ? "Test Case 1 Passed" : "Test Case 1 Failed");

        // Test case 2: "abababababab" -> "ababab"
        System.out.println(sp.stringPeriods("abababababab").equals("ababab") ? "Test Case 2 Passed" : "Test Case 2 Failed");

        // Test case 3: "aaaa" -> "a"
        System.out.println(sp.stringPeriods("aaaa").equals("aDa") ? "Test Case 3 Passed" : "Test Case 3 Failed");

        // Test case 4: "a" -> "-1"
        System.out.println(sp.stringPeriods("a").equals("-1") ? "Test Case 4 Passed" : "Test Case 4 Failed");

        // Test case 5: "abcdef" -> "-1"
        System.out.println(sp.stringPeriods("abcdef").equals("-1") ? "Test Case 5 Passed" : "Test Case 5 Failed");

        // Test case 6: "abcabcabc" -> "abc"
        System.out.println(sp.stringPeriods("abcabcabc").equals("abc") ? "Test Case 6 Passed" : "Test Case 6 Failed");
    
    }
}
