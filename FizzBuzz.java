public class FizzBuzz {

    public String fizzBuzz(int num){

        
        StringBuilder stringBuilder = new StringBuilder();
            
        int[] arr = new int[num];

        for(int i=0; i<arr.length;i++)
        {
            arr[i] = i+1;

            if(stringBuilder.length()==0)
            {
                stringBuilder.append(arr[i]);
                continue;
            }

            if(arr[i]%15==0)
                stringBuilder.append(" ").append("FizzBuzz");
            else if(arr[i]%5==0)
                stringBuilder.append(" ").append("Buzz");
            else if(arr[i]%3==0)
                stringBuilder.append(" ").append("Fizz");
            else
                stringBuilder.append(" ").append(arr[i]);


        }
        
        return stringBuilder.toString();
    }

    public static void main(String[] args) {


        FizzBuzz fizzBuzz = new FizzBuzz();

        // Test case 1: FizzBuzz(15)
        String output1 = fizzBuzz.fizzBuzz(15);
        String expected1 = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz";
        System.out.println(output1.equals(expected1) ? "Test Case 1 Passed" : "Test Case 1 Failed");

        // Test case 2: FizzBuzz(1)
        String output2 = fizzBuzz.fizzBuzz(1);
        String expected2 = "1";
        System.out.println(output2.equals(expected2) ? "Test Case 2 Passed" : "Test Case 2 Failed");

        // Test case 3: FizzBuzz(5)
        String output3 = fizzBuzz.fizzBuzz(5);
        String expected3 = "1 2 Fizz 4 Buzz";
        System.out.println(output3.equals(expected3) ? "Test Case 3 Passed" : "Test Case 3 Failed");

        // Test case 4: FizzBuzz(3)
        String output4 = fizzBuzz.fizzBuzz(3);
        String expected4 = "1 2 Fizz";
        System.out.println(output4.equals(expected4) ? "Test Case 4 Passed" : "Test Case 4 Failed");

        // Test case 5: FizzBuzz(10)
        String output5 = fizzBuzz.fizzBuzz(10);
        String expected5 = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz";
        System.out.println(output5.equals(expected5) ? "Test Case 5 Passed" : "Test Case 5 Failed");

        // Test case 6: FizzBuzz(30)
        String output6 = fizzBuzz.fizzBuzz(30);
        String expected6 = "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz";
        System.out.println(output6.equals(expected6) ? "Test Case 6 Passed" : "Test Case 6 Failed");

        // Test case 7: FizzBuzz(0)
        String output7 = fizzBuzz.fizzBuzz(0);
        String expected7 = "";
        System.out.println(output7.equals(expected7) ? "Test Case 7 Passed" : "Test Case 7 Failed");

        // Test case 8: FizzBuzz(2)
        String output8 = fizzBuzz.fizzBuzz(2);
        String expected8 = "1 2";
        System.out.println(output8.equals(expected8) ? "Test Case 8 Passed" : "Test Case 8 Failed");
    

    }
}