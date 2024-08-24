public class DashInsert {
    public String dashInsert(String str){

        StringBuilder stringBuilder = new StringBuilder(str);
        for(int i=0; i<stringBuilder.length()-1; i++)
        {
            int firstNum = Character.getNumericValue(stringBuilder.charAt(i));
            int secondNum = Character.getNumericValue(stringBuilder.charAt(i+1));

            if(firstNum%2 == 1 && secondNum %2 == 1){
                stringBuilder.insert(i+1, "-");
                i++;
            }
            
        }
            
        return stringBuilder.toString();
    }
    public static void main(String[] args) { 

        DashInsert di = new DashInsert();

        // Test case 1: "454793" -> "4547-9-3"
        System.out.println(di.dashInsert("454793").equals("4547-9-3") ? "Passed" : "Failed");

        // Test case 2: "123456" -> "123456" (No odd pairs)
        System.out.println(di.dashInsert("123456").equals("123456") ? "Passed" : "Failed");

        // Test case 3: "13579" -> "1-3-5-7-9" (All odd numbers)
        System.out.println(di.dashInsert("13579").equals("1-3-5-7-9") ? "Passed" : "Failed");

        // Test case 4: "24680" -> "24680" (No odd numbers)
        System.out.println(di.dashInsert("24680").equals("24680") ? "Passed" : "Failed");

        // Test case 5: "1122334455" -> "1122334-45-5" (Several odd pairs)
        System.out.println(di.dashInsert("1122334455").equals("1-1223-3445-5") ? "Passed" : "Failed");
        
    }
}
