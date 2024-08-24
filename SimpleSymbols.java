public class SimpleSymbols {

    public String simpleSymbols(String string) {

        char[] array = string.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (Character.isLetter(array[i])) {
                char left = '-';
                char right = '-';

                if (i == 0 || i == (array.length - 1)) {
                    return "false";
                } else {
                    left = array[i - 1];
                    right = array[i + 1];
                }

                if (left != '+' || right != '+') {
                    return "false";
                }
            }
        }
        return "true";
    }

    public static void main(String[] args) {
        SimpleSymbols ss = new SimpleSymbols();

        // Test case 1: Geçerli bir string
        System.out.println(ss.simpleSymbols("++a++").equals("true") ? "Passed" : "Failed");

        // Test case 2: Geçersiz bir string - Başında harf var
        System.out.println(ss.simpleSymbols("a++").equals("false") ? "Passed" : "Failed");

        // Test case 3: Geçersiz bir string - Sonunda harf var
        System.out.println(ss.simpleSymbols("++a").equals("false") ? "Passed" : "Failed");

        // Test case 4: Geçersiz bir string - Ortada harf doğru çevrelenmemiş
        System.out.println(ss.simpleSymbols("++a+b++").equals("true") ? "Passed" : "Failed");

        // Test case 5: Geçerli bir string - Birden fazla harf
        System.out.println(ss.simpleSymbols("++a++b++c++").equals("true") ? "Passed" : "Failed");

        // Test case 6: Geçersiz bir string - Harflerden biri doğru çevrelenmemiş
        System.out.println(ss.simpleSymbols("+a++b+c+").equals("true") ? "Passed" : "Failed");

        // Test case 7: Geçerli bir string - Tek bir harf
        System.out.println(ss.simpleSymbols("+a+").equals("true") ? "Passed" : "Failed");

        // Test case 8: Geçersiz bir string - Boş string (özel durum, boş stringi kabul eder)
        System.out.println(ss.simpleSymbols("").equals("true") ? "Passed" : "Failed");

        // Test case 9: Geçersiz bir string - Sadece semboller, hiç harf yok
        System.out.println(ss.simpleSymbols("+++++++").equals("true") ? "Passed" : "Failed");

        // Test case 10: Geçerli bir string - Sadece tek bir harf ve doğru çevrelenmiş
        System.out.println(ss.simpleSymbols("+++a+++").equals("true") ? "Passed" : "Failed");
    }
}
