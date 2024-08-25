public class SnakeCase {

    public String snakeCase(String str){

       str =  str.toLowerCase().trim();

       StringBuilder stringBuilder = new StringBuilder();

       for (int i=0 ; i<str.length();i++) {

            if(!Character.isLetter(str.charAt(i))){
                while(!Character.isLetter(str.charAt(i+1)))
                    i++;
                stringBuilder.append("_");
                
            }
            else
                stringBuilder.append(str.charAt(i));
        
       }

       return stringBuilder.toString();
    }
    public static void main(String[] args) {
        SnakeCase sc = new SnakeCase();

        // Test case 1: "Hello World" -> "hello_world"
        System.out.println(sc.snakeCase("Hello World").equals("hello_world") ? "Test Case 1 Passed" : "Test Case 1 Failed");

        // Test case 2: "Java Programming" -> "java_programming"
        System.out.println(sc.snakeCase("Java Programming").equals("java_programming") ? "Test Case 2 Passed" : "Test Case 2 Failed");

        // Test case 3: "snake_case_example" -> "snake_case_example"
        System.out.println(sc.snakeCase("snake_case_example").equals("snake_case_example") ? "Test Case 3 Passed" : "Test Case 3 Failed");

        // Test case 4: "This is a Test" -> "this_is_a_test"
        System.out.println(sc.snakeCase("This is a Test").equals("this_is_a_test") ? "Test Case 4 Passed" : "Test Case 4 Failed");

        // Test case 5: "Multiple   Spaces   Here" -> "multiple_spaces_here"
        System.out.println(sc.snakeCase("Multiple   Spaces   Here").equals("multiple_spaces_here") ? "Test Case 5 Passed" : "Test Case 5 Failed");
    
    }
}
