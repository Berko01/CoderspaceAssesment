public class ArithGeo {

    public static boolean isArith(int[] arr){
        int i=0;

        int before = arr[i+1] - arr[i];

        for(i=i; i<arr.length-1;i++)
        {
            
            int current = arr[i+1] - arr[i];
            if(before!=current){
                return false;
            }
            before=current;
        }
        
        return true;
    }

    public static boolean isGeo(int[] arr){
        int i=0;

        double before = arr[i+1] / arr[i];

        for(i=i; i<arr.length-1;i++)
        {
            double current = arr[i+1] / arr[i];
            if(before!=current){
                return false;
            }
            before=current;
        }
        
        return true;
    }

    public static String arithGeo(int[] arr){

        if(isArith(arr))
            return "Arithmetic";
        else if(isGeo(arr))
            return "Geometric";
        else
            return "-1";

    }
public static void main(String[] args) {
    // Test case 1: Arithmetic sequence
    int[] arr1 = {2, 4, 6, 8};
    System.out.println(arithGeo(arr1).equals("Arithmetic") ? "Test Case 1 Passed" : "Test Case 1 Failed");

    // Test case 2: Geometric sequence
    int[] arr2 = {2, 6, 18, 54};
    System.out.println(arithGeo(arr2).equals("Geometric") ? "Test Case 2 Passed" : "Test Case 2 Failed");

    // Test case 3: Neither arithmetic nor geometric sequence
    int[] arr3 = {2, 4, 8, 16, 20};
    System.out.println(arithGeo(arr3).equals("-1") ? "Test Case 3 Passed" : "Test Case 3 Failed");

    // Test case 4: Geometric sequence with negative numbers
    int[] arr4 = {-2, -6, -18, -54};
    System.out.println(arithGeo(arr4).equals("Geometric") ? "Test Case 4 Passed" : "Test Case 4 Failed");

    // Test case 5: Arithmetic sequence with negative difference
    int[] arr5 = {10, 7, 4, 1};
    System.out.println(arithGeo(arr5).equals("Arithmetic") ? "Test Case 5 Passed" : "Test Case 5 Failed");
}
}
