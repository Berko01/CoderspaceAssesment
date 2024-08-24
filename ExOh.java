public class ExOh {

    public String exOh(String str) {
        int countO = 0;
        int countX = 0;

        str = str.toLowerCase();

        for (char c : str.toCharArray()) {
            if (c == 'o') {
                countO++;
            } else if (c == 'x') {
                countX++;
            }
        }

        return countO == countX ? "true" : "false";
    }

    public static void main(String[] args) {
        ExOh exoh = new ExOh();

        // Test case 1: "xooxxxxooxo" -> false (6 x ve 5 o var)
        System.out.println(exoh.exOh("xooxxxxooxo").equals("false") ? "Passed" : "Failed");

        // Test case 2: "xoxo" -> true (2 x ve 2 o var)
        System.out.println(exoh.exOh("xoxo").equals("true") ? "Passed" : "Failed");

        // Test case 3: "xxxooo" -> true (3 x ve 3 o var)
        System.out.println(exoh.exOh("xxxooo").equals("true") ? "Passed" : "Failed");

        // Test case 4: "xxxxoooo" -> true (4 x ve 4 o var)
        System.out.println(exoh.exOh("xxxxoooo").equals("true") ? "Passed" : "Failed");

        // Test case 5: "xxoooxx" -> false (5 x ve 3 o var)
        System.out.println(exoh.exOh("xxoooxx").equals("false") ? "Passed" : "Failed");

        // Test case 6: "x" -> false (1 x ve 0 o var)
        System.out.println(exoh.exOh("x").equals("false") ? "Passed" : "Failed");

        // Test case 7: "oooxxxooo" -> false (6 o ve 3 x var)
        System.out.println(exoh.exOh("oooxxxooo").equals("false") ? "Passed" : "Failed");

        // Test case 8: "" -> true (Hiç x ve o yok)
        System.out.println(exoh.exOh("").equals("true") ? "Passed" : "Failed");
    }
}
