public class CamelCase {
    public String camelCase(String str) {

        str = str.toLowerCase().trim();

        StringBuilder stringBuilder = new StringBuilder(str);

        for (int i = 0; i < stringBuilder.length(); i++) {
            if (!(Character.isLetter(stringBuilder.charAt(i)))) {
                while(!(Character.isLetter(stringBuilder.charAt(i))))
                    stringBuilder.deleteCharAt(i);
                stringBuilder.setCharAt(i, Character.toUpperCase(stringBuilder.charAt(i)));
                i++; // Diziyi kaydırmamak için artırıyoruz
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        CamelCase cc = new CamelCase();

        // Test case 1: "BOB loves-coding" -> "bobLovesCoding"
        System.out.println(cc.camelCase("BOB loves-coding").equals("bobLovesCoding") ? "Passed" : "Failed");

        // Test case 2: "HELLO-world" -> "helloWorld"
        System.out.println(cc.camelCase("HELLO-world").equals("helloWorld") ? "Passed" : "Failed");

        // Test case 3: "java_programming" -> "javaProgramming"
        System.out.println(cc.camelCase("java_programming").equals("javaProgramming") ? "Passed" : "Failed");

        // Test case 4: " alreadyCamelCase " -> "alreadycamelcase"
        System.out.println(cc.camelCase(" alreadyCamelCase ").equals("alreadycamelcase") ? "Passed" : "Failed");

        // Test case 5: "MULTIPLE-separators__here" -> "multipleSeparatorsHere"
        System.out.println(cc.camelCase("MULTIPLE-separators__here").equals("multipleSeparatorsHere") ? "Passed" : "Failed");

        // Test case 6: "alllowercase" -> "alllowercase" (No changes)
        System.out.println(cc.camelCase("alllowercase").equals("alllowercase") ? "Passed" : "Failed");

        // Test case 7: "ALLUPPERCASE" -> "alluppercase" (All uppercase to lowercase)
        System.out.println(cc.camelCase("ALLUPPERCASE").equals("alluppercase") ? "Passed" : "Failed");

        // Test case 8: "Mixed-CASE_string" -> "mixedCaseString"
        System.out.println(cc.camelCase("Mixed-CASE_string").equals("mixedCaseString") ? "Passed" : "Failed");
    }
}
