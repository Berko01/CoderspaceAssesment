public class StringMerge {

    public String stringMerge(String str){

        String[] arrStr = str.split("\\*");

        String word1 = arrStr[0];
        String word2 = arrStr[1];

        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0 ; i<word1.length();i++)
        {
            stringBuilder.append(word1.charAt(i)).append(word2.charAt(i));
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        StringMerge stringMerge = new StringMerge();

        // Test case 1: "abc1*kyoo" -> "akbyco1o"
        String output1 = stringMerge.stringMerge("abc1*kyoo");
        String expected1 = "akbyco1o";
        System.out.println(output1.equals(expected1) ? "Test Case 1 Passed" : "Test Case 1 Failed");

        // Test case 2: "123*abc" -> "1a2b3c"
        String output2 = stringMerge.stringMerge("123*abc");
        String expected2 = "1a2b3c";
        System.out.println(output2.equals(expected2) ? "Test Case 2 Passed" : "Test Case 2 Failed");

        // Test case 3: "aaaa*bbbb" -> "abababab"
        String output3 = stringMerge.stringMerge("aaaa*bbbb");
        String expected3 = "abababab";
        System.out.println(output3.equals(expected3) ? "Test Case 3 Passed" : "Test Case 3 Failed");

        // Test case 4: "z1z2*xyxy" -> "zx1y2xy"
        String output4 = stringMerge.stringMerge("z1z2*xyxy");
        String expected4 = "zx1yzx2y";
        System.out.println(output4.equals(expected4) ? "Test Case 4 Passed" : "Test Case 4 Failed");

        // Test case 5: "ABCD*EFGH" -> "AEBFCGDH"
        String output5 = stringMerge.stringMerge("ABCD*EFGH");
        String expected5 = "AEBFCGDH";
        System.out.println(output5.equals(expected5) ? "Test Case 5 Passed" : "Test Case 5 Failed");
    }
}
