public class LetterCapitalize {

    public String letterCapitalize(String str) {
        String[] strArr = str.split(" ");
        StringBuilder newStr = new StringBuilder();

        for (String word : strArr) {
            if (word.isEmpty()) continue; // Boş string kontrolü

            StringBuilder buildStr = new StringBuilder(word);
            char c = Character.toUpperCase(word.charAt(0));
            buildStr.setCharAt(0, c);
            
            if (newStr.length() > 0) {
                newStr.append(" ");
            }
            newStr.append(buildStr);
        }

        return newStr.toString();
    }

    public static void main(String[] args) {
        LetterCapitalize lc = new LetterCapitalize();

        // Test case 1: Basit iki kelimeli string
        System.out.println(lc.letterCapitalize("hello world").equals("Hello World") ? "Passed" : "Failed");

        // Test case 2: Üç kelimeli string
        System.out.println(lc.letterCapitalize("java programming language").equals("Java Programming Language") ? "Passed" : "Failed");

        // Test case 3: Boş string
        System.out.println(lc.letterCapitalize("").equals("") ? "Passed" : "Failed");

        // Test case 4: Başında ve sonunda boşluk olan string
        System.out.println(lc.letterCapitalize("  multiple   spaces ").equals("Multiple Spaces") ? "Passed" : "Failed");

        // Test case 5: Tek kelimelik string
        System.out.println(lc.letterCapitalize("single").equals("Single") ? "Passed" : "Failed");

        // Test case 6: Zaten büyük harfle başlayan kelimeler
        System.out.println(lc.letterCapitalize("Hello World").equals("Hello World") ? "Passed" : "Failed");

        // Test case 7: Birden fazla boşluk bulunan string
        System.out.println(lc.letterCapitalize("   a   b  c ").equals("A B C") ? "Passed" : "Failed");

        // Test case 8: Tek bir harften oluşan kelimeler
        System.out.println(lc.letterCapitalize("a b c").equals("A B C") ? "Passed" : "Failed");
    }
}
