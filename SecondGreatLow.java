import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondGreatLow {

    public String secondGreatLow(int[] arr) {
        Arrays.sort(arr);
        int secondLow = -1;
        int secondGreat = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (i != arr.length && arr[i] == arr[i + 1])
                continue;
            else {
                secondGreat = arr[i];
            }
        }

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] == arr[i - 1])
                continue;
            else {
                secondLow = arr[i];

            }
        }

        if (secondLow == -1 && secondGreat == -1)
            return arr[0] + " " + arr[0];

        return secondLow + " " + secondGreat;
    }

    public static void main(String[] args) {
        SecondGreatLow sgl = new SecondGreatLow();

        // Test Case 1: Temel örnek
        int[] arr1 = { 7, 7, 12, 98, 106 };
        if (sgl.secondGreatLow(arr1).equals("12 98")) {
            System.out.println("Test Case 1 Passed");
        } else {
            System.out.println("Test Case 1 Failed");
        }

        // Test Case 2: Tekrar eden sayılar
        int[] arr2 = { 1, 2, 2, 3, 3, 4, 5 };
        if (sgl.secondGreatLow(arr2).equals("2 4")) {
            System.out.println("Test Case 2 Passed");
        } else {
            System.out.println("Test Case 2 Failed");
        }

        // Test Case 3: Negatif sayılar
        int[] arr3 = { -10, -20, -30, -40, -50 };
        if (sgl.secondGreatLow(arr3).equals("-40 -20")) {
            System.out.println("Test Case 3 Passed");
        } else {
            System.out.println("Test Case 3 Failed");
        }

        // Test Case 4: Sadece iki farklı sayı
        int[] arr4 = { 100, 200 };
        if (sgl.secondGreatLow(arr4).equals("200 100")) {
            System.out.println("Test Case 4 Passed");
        } else {
            System.out.println("Test Case 4 Failed");
        }

        // Test Case 5: Tekrar eden iki farklı sayı
        int[] arr5 = { 5, 5, 5, 9, 9, 9 };
        if (sgl.secondGreatLow(arr5).equals("9 5")) {
            System.out.println("Test Case 5 Passed");
        } else {
            System.out.println("Test Case 5 Failed");
        }

        // Test Case 6: Karışık pozitif ve negatif sayılar
        int[] arr6 = { -3, -1, 2, 4, 4, 5, 8 };
        if (sgl.secondGreatLow(arr6).equals("-1 5")) {
            System.out.println("Test Case 6 Passed");
        } else {
            System.out.println("Test Case 6 Failed");
        }

        // Test Case 7: Aynı sayılar
        int[] arr7 = { 7, 7, 7, 7 };
        if (sgl.secondGreatLow(arr7).equals("7 7")) {
            System.out.println("Test Case 7 Passed");
        } else {
            System.out.println("Test Case 7 Failed");
        }

        // Test Case 8: Sadece iki sayı (biri negatif)
        int[] arr8 = { -100, 50 };
        if (sgl.secondGreatLow(arr8).equals("50 -100")) {
            System.out.println("Test Case 8 Passed");
        } else {
            System.out.println("Test Case 8 Failed");
        }
    }
}
