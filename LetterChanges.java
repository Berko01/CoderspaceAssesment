public class LetterChanges {

    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    static String letterChanges(String str) {

        StringBuilder newStr = new StringBuilder();

        for (char c : str.toCharArray()) {

            if (Character.isLetter(c)) {
                if (c == 'z') {
                    c = 'a';
                } else if (c == 'Z') {
                    c = 'A';
                } else {
                    c = (char) (c + 1);
                }
            }

            if (isVowel(c)) {
                c = Character.toUpperCase(c);
            }

            newStr.append(c);
        }

        return newStr.toString();
    }

    public static void main(String[] args) {
        // Test case 1: Basit bir string
        System.out.println(letterChanges("ahmet").equals("bINfU") ? "Passed" : "Failed");

        // Test case 2: Büyük harfler ve küçük harflerin karışımı
        System.out.println(letterChanges("Ahmet").equals("bINfU") ? "Passed" : "Failed");

        // Test case 3: Z ve z harflerinin değiştirilmesi
        System.out.println(letterChanges("Zoo").equals("App") ? "Passed" : "Failed");

        // Test case 4: Sadece sessiz harfler
        System.out.println(letterChanges("bcdfg").equals("cDEgh") ? "Passed" : "Failed");

        // Test case 5: Sadece sesli harfler
        System.out.println(letterChanges("aeiou").equals("bfjpv") ? "Passed" : "Failed");

        // Test case 6: Boş string
        System.out.println(letterChanges("").equals("") ? "Passed" : "Failed");

        // Test case 7: Özel karakterler ve sayılar
        System.out.println(letterChanges("hello world! 123").equals("Ifmmp xpsmE! 123") ? "Passed" : "Failed");

        // Test case 8: Yalnızca büyük harfler
        System.out.println(letterChanges("ABCXYZ").equals("BCDAYA") ? "Passed" : "Failed");

        // Test case 9: Karışık özel karakterler, boşluklar ve harfler
        System.out.println(letterChanges("a1b2c3!@#").equals("b1C2d3!@#") ? "Passed" : "Failed");

        // Test case 10: Tüm alfabeyi içeren bir string
        System.out.println(letterChanges("abcdefghijklmnopqrstuvwxyz").equals("bcdEfghIjklmnOpqrstUvwxyzA") ? "Passed" : "Failed");
    }
}
