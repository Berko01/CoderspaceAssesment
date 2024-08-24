import java.util.Arrays;

public class AlphabetSoup {

    public String alphabetSoup(String str) {
        char[] arr = str.toCharArray();

        Arrays.sort(arr);

        return new String(arr);
    }

    public static void main(String[] args) {
        AlphabetSoup as = new AlphabetSoup();

        // Test case 1: Basit bir string
        System.out.println(as.alphabetSoup("hello").equals("ehllo") ? "Passed" : "Failed");

        // Test case 2: Tüm harfler farklı
        System.out.println(as.alphabetSoup("java").equals("aajv") ? "Passed" : "Failed");

        // Test case 3: Zaten sıralı bir string
        System.out.println(as.alphabetSoup("abcd").equals("abcd") ? "Passed" : "Failed");

        // Test case 4: Ters sıralı bir string
        System.out.println(as.alphabetSoup("zyxw").equals("wxyz") ? "Passed" : "Failed");

        // Test case 5: Aynı harflerden oluşan bir string
        System.out.println(as.alphabetSoup("aaa").equals("aaa") ? "Passed" : "Failed");

        // Test case 6: Tek bir harf
        System.out.println(as.alphabetSoup("b").equals("b") ? "Passed" : "Failed");

        // Test case 7: Karışık büyük ve küçük harfler
        System.out.println(as.alphabetSoup("BaNaNa").equals("BNNaaa") ? "Passed" : "Failed");

        // Test case 8: Boş bir string
        System.out.println(as.alphabetSoup("").equals("") ? "Passed" : "Failed");

        // Test case 9: Özel karakterler içermeyen string
        System.out.println(as.alphabetSoup("algorithms").equals("aghilmorst") ? "Passed" : "Failed");

        // Test case 10: Büyük harflerin küçük harflerden önce geldiği string
        System.out.println(as.alphabetSoup("Zebra").equals("Zaber") ? "Passed" : "Failed");
    }
}
