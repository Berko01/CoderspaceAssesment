public class ABCheck {

    public String aBCheck(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                int count = 0;
                for (int j = i + 1; j < str.length(); j++) {

                    if (str.charAt(j) != ' ')
                        count++;
                    if (count == 3 && str.charAt(j) == 'b') {
                        return "true";
                    }

                    if (count > 3)
                        break;
                }
            }else if (str.charAt(i) == 'b') {
                int count = 0;
                for (int j = i + 1; j < str.length(); j++) {

                    if (str.charAt(j) != ' ')
                        count++;
                    if (count == 3 && str.charAt(j) == 'a') {
                        return "true";
                    }

                    if (count > 3)
                        break;
                }
            }
        }

        return "false";
    }

    public static void main(String[] args) {
        ABCheck abc = new ABCheck();

        // Test case 1: "lane borrowed" -> true
        System.out.println(abc.aBCheck("lane borrowed").equals("true") ? "Passed" : "Failed");

        // Test case 2: "after badly" -> false
        System.out.println(abc.aBCheck("after badly").equals("false") ? "Passed" : "Failed");

        // Test case 3: "Laura sobs" -> true
        System.out.println(abc.aBCheck("Laura sobs").equals("true") ? "Passed" : "Failed");

        // Test case 4: "abacus" -> false
        System.out.println(abc.aBCheck("abacus").equals("false") ? "Passed" : "Failed");

        // Test case 5: "a random b" -> true
        System.out.println(abc.aBCheck("a random b").equals("false") ? "Passed" : "Failed");

        // Test case 6: "a    b" -> true
        System.out.println(abc.aBCheck("a    b").equals("false") ? "Passed" : "Failed");

        // Test case 7: "a   x   b" -> false
        System.out.println(abc.aBCheck("a   x   b").equals("false") ? "Passed" : "Failed");

        // Test case 8: "hello world" -> false (Hiç 'a' veya 'b' yok)
        System.out.println(abc.aBCheck("hello world").equals("false") ? "Passed" : "Failed");

        // Test case 9: "aaaaabbbbbb" -> true (En az bir uygun 'a' ve 'b' var)
        System.out.println(abc.aBCheck("aaaaabbbbbb").equals("true") ? "Passed" : "Failed");

        // Test case 10: "a b c d e f g h i j k l m n o p q r s t u v w x y z" -> false (Aralarda 3 karakter değil)
        System.out.println(abc.aBCheck("a b c d e f g h i j k l m n o p q r s t u v w x y z").equals("false") ? "Passed" : "Failed");
    }
}
