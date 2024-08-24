public class VowelCount {

    public int vowelCount(String string) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        // Verilen stringdeki her bir karakteri kontrol ediyoruz
        for (char c : string.toCharArray()) {
            // Eğer karakter sesli harfler içinde varsa, sayacı artırıyoruz
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        VowelCount vc = new VowelCount();

        // Test case 1: "All cows eat grass" -> 5
        System.out.println(vc.vowelCount("All cows eat grass") == 5 ? "Passed" : "Failed");

        // Test case 2: "hello world" -> 3
        System.out.println(vc.vowelCount("hello world") == 3 ? "Passed" : "Failed");

        // Test case 3: "aeiou" -> 5
        System.out.println(vc.vowelCount("aeiou") == 5 ? "Passed" : "Failed");

        // Test case 4: "bcdfghjklmnpqrstvwxyz" -> 0 (Hiç sesli harf yok)
        System.out.println(vc.vowelCount("bcdfghjklmnpqrstvwxyz") == 0 ? "Passed" : "Failed");

        // Test case 5: "AEIOU" -> 5 (Büyük harfler için)
        System.out.println(vc.vowelCount("AEIOU") == 5 ? "Passed" : "Failed");

        // Test case 6: "abcdefghijklmnopqrstuvwxyz" -> 5 (Tüm harfleri içeren string)
        System.out.println(vc.vowelCount("abcdefghijklmnopqrstuvwxyz") == 5 ? "Passed" : "Failed");
    }
}
