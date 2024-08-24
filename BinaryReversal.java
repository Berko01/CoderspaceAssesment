public class BinaryReversal {
    
    public String binaryReversal(String str){
        // Sayıyı integera çevir
        int num = Integer.parseInt(str);
        
        // Binary formatına çevir ve gerekli olduğunda başına 0 ekle
        String binNum = Integer.toBinaryString(num);
        while (binNum.length() % 8 != 0) {
            binNum = "0" + binNum;
        }

        // Binary stringi tersine çevir
        StringBuilder stringBuilder = new StringBuilder(binNum);
        stringBuilder.reverse();

        // Tersine çevrilen binary stringi tekrar decimal forma çevir
        int result = Integer.parseInt(stringBuilder.toString(), 2);

        return String.valueOf(result);
    }

    public static void main(String[] args) {
        BinaryReversal br = new BinaryReversal();

        // Test case 1: "47" -> "244"
        System.out.println(br.binaryReversal("47").equals("244") ? "Passed" : "Failed");

        System.out.println(br.binaryReversal("56").equals("28") ? "Passed" : "Failed"); // PASSED


        // Test case 2: "56" -> "28" (8 bit binary: 00111000 -> reversed: 00011100 -> decimal: 28)
        System.out.println(br.binaryReversal("56").equals("28") ? "Passed" : "Failed"); // PASSED

        // Test case 3: "213" -> "171"
        System.out.println(br.binaryReversal("213").equals("171") ? "Passed" : "Failed");

        // Test case 4: "1" -> "128"
        System.out.println(br.binaryReversal("1").equals("128") ? "Passed" : "Failed");
    }
}
