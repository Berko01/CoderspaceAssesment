import java.util.HashSet;
import java.util.Set;

public class DistinctCharacters {

    public String distinctCharacters(String str){
        
        Set<Character> set = new HashSet<Character>();

        for (char c: str.toCharArray()) {
            set.add(c);
        }

        if(set.size()>=10)
            return "true";
        else
            return "false";
    }

    public static void main(String[] args) {
        DistinctCharacters dc = new DistinctCharacters();

        // Test case 1: "abc123kkmmmm?" -> false
        System.out.println(dc.distinctCharacters("abc123kkmmmm?").equals("false") ? "Test Case 1 Passed" : "Test Case 1 Failed");

        // Test case 2: "abcdefghij" -> true
        System.out.println(dc.distinctCharacters("abcdefghij").equals("true") ? "Test Case 2 Passed" : "Test Case 2 Failed");

        // Test case 3: "a1b2c3d4e5" -> true
        System.out.println(dc.distinctCharacters("a1b2c3d4e5").equals("true") ? "Test Case 3 Passed" : "Test Case 3 Failed");

        // Test case 4: "123456789" -> false
        System.out.println(dc.distinctCharacters("123456789").equals("false") ? "Test Case 4 Passed" : "Test Case 4 Failed");

        // Test case 5: "abcABC123!" -> true
        System.out.println(dc.distinctCharacters("abcABC123!").equals("true") ? "Test Case 5 Passed" : "Test Case 5 Failed");
    }


    
}
