public class CommandLine {
    public String commandLine(String str){

        StringBuilder stringBuilder = new StringBuilder(str);

        

        return stringBuilder.toString();
    }
    public static void main(String[] args) {
        CommandLine cl = new CommandLine();

        // Test case 1
        String input1 = "SampleNumber=3234 provider=Dr. M. Welby patient=John Smith priority=High";
        String output1 = cl.commandLine(input1);
        System.out.println(output1.equals("12=4 8=12 7=10 8=4") ? "Passed" : "Failed");

        // Test case 2
        String input2 = "name=JohnDoe age=25 city=New York";
        String output2 = cl.commandLine(input2);
        System.out.println(output2.equals("4=7 3=2 4=8") ? "Passed" : "Failed");

        // Test case 3
        String input3 = "key=value simple=test empty=";
        String output3 = cl.commandLine(input3);
        System.out.println(output3.equals("3=5 6=4 5=0") ? "Passed" : "Failed");

        // Test case 4
        String input4 = "a=1 b=2 c=3 d=4";
        String output4 = cl.commandLine(input4);
        System.out.println(output4.equals("1=1 1=1 1=1 1=1") ? "Passed" : "Failed");

        // Test case 5
        String input5 = "longparametername=some long value short=s";
        String output5 = cl.commandLine(input5);
        System.out.println(output5.equals("17=14 5=1") ? "Passed" : "Failed");
    }
}
