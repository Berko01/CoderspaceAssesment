public class StarRating {

    public String starRating(String str){

        //2.7

        String[] strArr = str.split("\\.");

        double integerNum = Double.parseDouble(strArr[0]);
        double decimalNum = Double.parseDouble(("0."+strArr[1]));


        if(decimalNum>=0.25 && decimalNum<=0.5 || decimalNum > 0.5 && decimalNum<=0.75)
        {
            decimalNum=0.5;

        }   
        else if(decimalNum<0.25)
            decimalNum=0;
        else if (decimalNum>0.75)
        {
            decimalNum=0;
            integerNum+=1;
        }

        System.out.println(integerNum + decimalNum);

        StringBuilder stringBuilder = new StringBuilder();

        int counter = 0;

        for(int i = 0; i< integerNum;i++)
        {
            stringBuilder.append("full");
            counter++;
            if(i!=integerNum-1)
                stringBuilder.append(" ");


        }
        
        if(decimalNum==0.5){
            if(stringBuilder.length()==0)
                stringBuilder.append("half");
            else
                stringBuilder.append(" half").toString();
            counter++;
        }

        for(int i=counter;i<5;i++){
            if(stringBuilder.length()==0)
            {
                stringBuilder.append("empty");
                continue;

            }
            stringBuilder.append(" empty");
        }
        

        return stringBuilder.toString();

    }
    public static void main(String[] args) {
        StarRating starRating = new StarRating();

        // Test case 1: 2.76 -> 3.0 (full full full empty empty)
        String output1 = starRating.starRating("2.76");
        String expected1 = "full full full empty empty";
        System.out.println(output1.equals(expected1) ? "Test Case 1 Passed" : "Test Case 1 Failed");

        // Test case 2: 3.5 -> 3.5 (full full full half empty)
        String output2 = starRating.starRating("3.50");
        String expected2 = "full full full half empty";
        System.out.println(output2.equals(expected2) ? "Test Case 2 Passed" : "Test Case 2 Failed");

        // Test case 3: 4.25 -> 4.5 (full full full full half)
        String output3 = starRating.starRating("4.25");
        String expected3 = "full full full full half";
        System.out.println(output3.equals(expected3) ? "Test Case 3 Passed" : "Test Case 3 Failed");

        // Test case 4: 5.00 -> 5.0 (full full full full full)
        String output4 = starRating.starRating("5.00");
        String expected4 = "full full full full full";
        System.out.println(output4.equals(expected4) ? "Test Case 4 Passed" : "Test Case 4 Failed");

        // Test case 5: 0.00 -> 0.0 (empty empty empty empty empty)
        String output5 = starRating.starRating("0.00");
        String expected5 = "empty empty empty empty empty";
        System.out.println(output5.equals(expected5) ? "Test Case 5 Passed" : "Test Case 5 Failed");

        // Test case 6: 1.74 -> 1.5 (full half empty empty empty)
        String output6 = starRating.starRating("1.74");
        String expected6 = "full half empty empty empty";
        System.out.println(output6.equals(expected6) ? "Test Case 6 Passed" : "Test Case 6 Failed");

        // Test case 7: 3.99 -> 4.0 (full full full full empty)
        String output7 = starRating.starRating("3.99");
        String expected7 = "full full full full empty";
        System.out.println(output7.equals(expected7) ? "Test Case 7 Passed" : "Test Case 7 Failed");

        // Test case 8: 0.49 -> 0.5 (half empty empty empty empty)
        String output8 = starRating.starRating("0.49");
        String expected8 = "half empty empty empty empty";
        System.out.println(output8.equals(expected8) ? "Test Case 8 Passed" : "Test Case 8 Failed");

        // Test case 9: 4.76 -> 5.0 (full full full full full)
        String output9 = starRating.starRating("4.76");
        String expected9 = "full full full full full";
        System.out.println(output9.equals(expected9) ? "Test Case 9 Passed" : "Test Case 9 Failed");
   }
}
