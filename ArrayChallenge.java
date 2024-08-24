public class ArrayChallenge {

    public String arrayChallenge(String strArr) {
        
        String cleaned = strArr.replace("[", "").replace("]", "");
        String[] arr = cleaned.split(", ");

        String[] arr1 = arr[0].split(",");
        String[] arr2 = arr[1].split(",");

        int[] intArr1 = new int[arr1.length];
        int[] intArr2 = new int[arr2.length];

        for (int i=0; i<intArr1.length ; i++) {
            intArr1[i] = Integer.parseInt(arr1[i]);
        }

        
        for (int i=0; i<intArr2.length ; i++) {
            intArr2[i] = Integer.parseInt(arr2[i]);
        }

        int min = Math.min(intArr1.length, intArr2.length);
        StringBuilder result = new StringBuilder();


       result.append("[");
    
        for(int i=0; i<min ; i++)
        {
            if(result.toString().length()==1){
                result.append((intArr1[i] + intArr2[i]));
                continue;
            }
            result.append(",").append((intArr1[i] + intArr2[i]));
        }

        if(min!=intArr1.length)
        {
            for(int i=min; i<intArr1.length  ; i++)
            {
                result.append(",").append(intArr1[i]);
            }
        }
        else{
            for(int i=min; i<intArr2.length  ; i++)
            {
                result.append(",").append(intArr2[i]);
            }
        }

        result.append("]");

        System.out.println(result.toString());

        return result.toString();
        
    }

    public static void main(String[] args) {
        ArrayChallenge ac = new ArrayChallenge();

        // Test case 1
        System.out.println(ac.arrayChallenge("[1,2,3], [4,5,6]").equals("[5,7,9]") ? "Passed" : "Failed");

        // Test case 2
        System.out.println(ac.arrayChallenge("[10,20,30], [1,2,3]").equals("[11,22,33]") ? "Passed" : "Failed");

        // Test case 3
        System.out.println(ac.arrayChallenge("[3,4,32,42], [31,23,42,53,43]").equals("[34,27,74,95,43]") ? "Passed" : "Failed");

        // Test case 4
        System.out.println(ac.arrayChallenge("[0,0,0], [0,0,0]").equals("[0,0,0]") ? "Passed" : "Failed");

        // Test case 5
        System.out.println(ac.arrayChallenge("[100,200,300], [400,500,600]").equals("[500,700,900]") ? "Passed" : "Failed");
    }
}
