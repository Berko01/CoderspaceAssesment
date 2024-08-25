public class DifferentCases {

    public String differentCases(String str) {
        // String'i küçük harfe çevirin
        str = str.toLowerCase();

        // Kelimeleri ayırıcı karakterlerle (boşluk, tire, alt çizgi) parçalayın
        String[] words = str.split("[\\s-_]+");

        StringBuilder result = new StringBuilder();

        // Her kelimenin ilk harfini büyük yapın ve birleştirin
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        DifferentCases dc = new DifferentCases();

        // Test case 1: "Daniel LikeS-coding" -> "DanielLikesCoding"
        System.out.println(dc.differentCases("Daniel LikeS-coding").equals("DanielLikesCoding") ? "Passed" : "Failed");

        // Test case 2: "java_programming_language" -> "JavaProgrammingLanguage"
        System.out.println(dc.differentCases("java_programming_language").equals("JavaProgrammingLanguage") ? "Passed" : "Failed");

        // Test case 3: "HELLO-WORLD" -> "HelloWorld"
        System.out.println(dc.differentCases("HELLO-WORLD").equals("HelloWorld") ? "Passed" : "Failed");

        // Test case 4: "multiple__delimiters__here" -> "MultipleDelimitersHere"
        System.out.println(dc.differentCases("multiple__delimiters__here").equals("MultipleDelimitersHere") ? "Passed" : "Failed");

        // Test case 5: "Simple Test" -> "SimpleTest"
        System.out.println(dc.differentCases("Simple Test").equals("SimpleTest") ? "Passed" : "Failed");
    }
}
