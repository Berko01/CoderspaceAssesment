import java.util.HashMap;

public class MeanMode {

    public static int meanMode(int[] arr){
        HashMap<String,Integer> hashMap = new HashMap<String,Integer>();

        int maxFrekans=0;
        int maxMod=0;
        int total=0;

        for(int c : arr){
            total += c;
            hashMap.put(Integer.toString(c), hashMap.getOrDefault(Integer.toString(c), 0) + 1);
            if(maxFrekans < hashMap.get(Integer.toString(c))){
                maxFrekans = hashMap.get(Integer.toString(c));
                maxMod = c;
            }
        }

        if(total%arr.length!=0)
            return 0;

        if(total / arr.length == maxMod)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        MeanMode mm = new MeanMode();

        // Test Case 1: Temel örnek
        int[] arr1 = {5, 3, 3, 3, 1};
        System.out.println(mm.meanMode(arr1) == 1 ? "Test Case 1 Passed" : "Test Case 1 Failed");

        // Test Case 2: Mode ve mean eşit değil
        int[] arr2 = {5, 3, 2, 1, 1};
        System.out.println(mm.meanMode(arr2) == 0 ? "Test Case 2 Passed" : "Test Case 2 Failed");

        // Test Case 3: Tüm elemanlar aynı
        int[] arr3 = {4, 4, 4, 4};
        System.out.println(mm.meanMode(arr3) == 1 ? "Test Case 3 Passed" : "Test Case 3 Failed");

        // Test Case 4: Karışık sayılar
        int[] arr4 = {1, 2, 2, 3, 3, 4};
        System.out.println(mm.meanMode(arr4) == 0 ? "Test Case 4 Passed" : "Test Case 4 Failed");

        // Test Case 5: Büyük bir dizi
        int[] arr5 = {1, 2, 3, 3, 3, 3, 4, 5, 6, 6, 6};
        System.out.println(mm.meanMode(arr5) == 0 ? "Test Case 5 Passed" : "Test Case 5 Failed");
    }
}
