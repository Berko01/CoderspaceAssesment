public class NumberStream {

    public String numberStream(String str){

        char currentNum =str.charAt(0);
        int currentFrequency = 0;

        for(int i=0; i<str.length(); i++)
        {
            if(currentNum!=str.charAt(i)){
                if(Character.getNumericValue(currentNum)==currentFrequency)
                    return "true";
                currentNum = str.charAt(i);
                currentFrequency=0;
            }
            if(currentNum==str.charAt(i)){
                currentFrequency++;
                continue;
            }

        }

        if(Character.getNumericValue(currentNum)==currentFrequency)
            return "true";

        return "false";
    }
    public static void main(String[] args) {
        NumberStream ns = new NumberStream();

        // Test case 1: "6539923335" -> "true"
        System.out.println(ns.numberStream("6539923335").equals("true") ? "Test Case 1 Passed" : "Test Case 1 Failed");

        // Test case 2: "5556667778" -> "true"
        System.out.println(ns.numberStream("555556667778").equals("true") ? "Test Case 2 Passed" : "Test Case 2 Failed");

        // Test case 3: "222245666" -> "true"
        System.out.println(ns.numberStream("2245666").equals("true") ? "Test Case 3 Passed" : "Test Case 3 Failed");

        // Test case 4: "3334442" -> "true"
        System.out.println(ns.numberStream("3334442").equals("true") ? "Test Case 4 Passed" : "Test Case 4 Failed");

        // Test case 5: "98765432" -> "false"
        System.out.println(ns.numberStream("98765432").equals("false") ? "Test Case 5 Passed" : "Test Case 5 Failed");
   
}
}
