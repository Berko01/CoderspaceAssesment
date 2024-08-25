public class RunLength {

    public String runLength(String str){
        StringBuilder stringBuilder = new StringBuilder();

        int currentWordCount=0;
        char currentWord = str.charAt(0);

        for(char c: str.toCharArray())
        {
            if(currentWord==c)
                currentWordCount++;
            else{
                stringBuilder.append(currentWordCount).append(currentWord);
                currentWord=c;
                currentWordCount=1;
            }
            
        }

        stringBuilder.append(currentWordCount).append(currentWord);

        

        return stringBuilder.toString();


    }

    public static void main(String[] args) {

        RunLength runLength = new RunLength();

        // Test case 1: "wwwggopp" -> "3w2g1o2p"
        String output1 = runLength.runLength("wwwggopp");
        String expected1 = "3w2g1o2p";
        System.out.println(output1.equals(expected1) ? "Test Case 1 Passed" : "Test Case 1 Failed");

        // Test case 2: "aabcccccaaa" -> "2a1b5c3a"
        String output2 = runLength.runLength("aabcccccaaa");
        String expected2 = "2a1b5c3a";
        System.out.println(output2.equals(expected2) ? "Test Case 2 Passed" : "Test Case 2 Failed");

        // Test case 3: "abc" -> "1a1b1c"
        String output3 = runLength.runLength("abc");
        String expected3 = "1a1b1c";
        System.out.println(output3.equals(expected3) ? "Test Case 3 Passed" : "Test Case 3 Failed");

        // Test case 4: "aaaaa" -> "5a"
        String output4 = runLength.runLength("aaaaa");
        String expected4 = "5a";
        System.out.println(output4.equals(expected4) ? "Test Case 4 Passed" : "Test Case 4 Failed");

        // Test case 5: "abbbbbccccde" -> "1a5b4c1d1e"
        String output5 = runLength.runLength("abbbbbccccde");
        String expected5 = "1a5b4c1d1e";
        System.out.println(output5.equals(expected5) ? "Test Case 5 Passed" : "Test Case 5 Failed");

        // Test case 6: "abcd" -> "1a1b1c1d"
        String output6 = runLength.runLength("abcd");
        String expected6 = "1a1b1c1d";
        System.out.println(output6.equals(expected6) ? "Test Case 6 Passed" : "Test Case 6 Failed");

        // Test case 7: "ppqqqrrr" -> "2p3q3r"
        String output7 = runLength.runLength("ppqqqrrr");
        String expected7 = "2p3q3r";
        System.out.println(output7.equals(expected7) ? "Test Case 7 Passed" : "Test Case 7 Failed");

        // Test case 8: "a" -> "1a"
        String output8 = runLength.runLength("a");
        String expected8 = "1a";
        System.out.println(output8.equals(expected8) ? "Test Case 8 Passed" : "Test Case 8 Failed");
    
    }
}
