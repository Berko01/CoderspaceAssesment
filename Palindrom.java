public class Palindrom {
    
    public String palindrom(String str){

        str = str.toLowerCase();
        char[] arr = str.toCharArray();
        int middle = arr.length/2;



        for(int i=0 ;i<middle; i++)
        {
            if(!(arr[i] == arr[arr.length-1-i]))
                return "false";

        }
        
        return "true";
    }

    public static void main(String[] args) {
        Palindrom palindromeChecker = new Palindrom();

        // Test case 1: "racecar" -> true
        System.out.println(palindromeChecker.palindrom("racecar").equals("true") ? "Passed" : "Failed");

        // Test case 2: "RaceCar" -> true (Büyük/küçük harf farkını göz ardı eder)
        System.out.println(palindromeChecker.palindrom("RaceCar").equals("true") ? "Passed" : "Failed");

        // Test case 3: "hello" -> false
        System.out.println(palindromeChecker.palindrom("hello").equals("false") ? "Passed" : "Failed");

        // Test case 4: 
        System.out.println(palindromeChecker.palindrom("A man a plan a canal Panama").equals("false") ? "Passed" : "Failed");

        // Test case 5: " " -> true (Boş string palindrome kabul edilir)
        System.out.println(palindromeChecker.palindrom(" ").equals("true") ? "Passed" : "Failed");

        // Test case 6: "madam" -> true
        System.out.println(palindromeChecker.palindrom("madam").equals("true") ? "Passed" : "Failed");
    }
}
