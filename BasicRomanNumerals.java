import java.util.HashMap;

public class BasicRomanNumerals {

    public HashMap<Character, Integer> createHashMap() {
        HashMap<Character, Integer> romanMap = new HashMap<Character, Integer>();

        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        return romanMap;
    }

    public int basicRomanNumerals(String str) {
        HashMap<Character, Integer> romanMap = createHashMap();

        int currentValue = romanMap.get(str.charAt(str.length() - 1));
        int total = 0;

        total += currentValue;
        for (int i = str.length() - 1; i > 0; i--) {
            int beforeValue = romanMap.get(str.charAt(i - 1));

            if (currentValue > beforeValue)
                total -= beforeValue;
            else
                total += beforeValue;

            currentValue = beforeValue;
        }

        return total;
    }

    public static void main(String[] args) {
        BasicRomanNumerals brn = new BasicRomanNumerals();

        // Test case 1: "XXIV" -> 24
        System.out.println(brn.basicRomanNumerals("XXIV") == 24 ? "Passed" : "Failed");

        // Test case 2: "XIX" -> 19
        System.out.println(brn.basicRomanNumerals("XIX") == 19 ? "Passed" : "Failed");

        // Test case 3: "MCMXC" -> 1990
        System.out.println(brn.basicRomanNumerals("MCMXC") == 1990 ? "Passed" : "Failed");

        // Test case 4: "IV" -> 4
        System.out.println(brn.basicRomanNumerals("IV") == 4 ? "Passed" : "Failed");

        // Test case 5: "MMXX" -> 2020
        System.out.println(brn.basicRomanNumerals("MMXX") == 2020 ? "Passed" : "Failed");
    }
}
