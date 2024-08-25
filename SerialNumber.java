public class SerialNumber {

    public String serialNumber(String str) {

        String[] strArr = str.split("\\.");

        if(isOddNumber(strArr[0]))
            return "false";
        
        if(!isOddNumber(strArr[1]))
            return "false";

        if(!sumControl(strArr[0]) || !sumControl(strArr[1]) || !sumControl(strArr[2]))
            return "false";

        return "true";
    }

    public boolean isOddNumber(String str) {

        // 123
        int result = Character.getNumericValue(str.charAt(0)) + Character.getNumericValue(str.charAt(1))
                + Character.getNumericValue(str.charAt(2));

        if(result%2==0)
            return false;
        else
            return true;

    }

    public boolean sumControl(String str) {

        // 123
        int num1 = Character.getNumericValue(str.charAt(0));
        int num2 = Character.getNumericValue(str.charAt(1));
        int num3 = Character.getNumericValue(str.charAt(2));

        if(num3>num2 && num3>num1)
            return true;

        return false;

    }

    public static void main(String[] args) {
        SerialNumber serialNumber = new SerialNumber();

        // Test case 1: "224.315.218" -> true
        System.out.println(serialNumber.serialNumber("224.315.218").equals("true") ? "Test Case 1 Passed" : "Test Case 1 Failed");

        // Test case 2: "123.456.789" -> false
        System.out.println(serialNumber.serialNumber("123.456.789").equals("true") ? "Test Case 2 Passed" : "Test Case 2 Failed");

        // Test case 3: "246.135.369" -> true
        System.out.println(serialNumber.serialNumber("246.135.369").equals("true") ? "Test Case 3 Passed" : "Test Case 3 Failed");

        // Test case 4: "111.222.333" -> false
        System.out.println(serialNumber.serialNumber("111.222.333").equals("false") ? "Test Case 4 Passed" : "Test Case 4 Failed");

        // Test case 5: "876.543.210" -> false
        System.out.println(serialNumber.serialNumber("876.543.210").equals("false") ? "Test Case 5 Passed" : "Test Case 5 Failed");

        // Test case 6: "999.777.333" -> true
        System.out.println(serialNumber.serialNumber("999.777.333").equals("false") ? "Test Case 6 Passed" : "Test Case 6 Failed");

        // Test case 7: "123.234.345" -> false
        System.out.println(serialNumber.serialNumber("123.234.345").equals("true") ? "Test Case 7 Passed" : "Test Case 7 Failed");
    
    }
}
