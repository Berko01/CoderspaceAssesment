public class TimeConvert {

    public String timeConvert(int num) {

        int hour = num / 60;
        int minute = num % 60;

        return hour + ":" + minute;
    }

    public static void main(String[] args) {
        TimeConvert tc = new TimeConvert();

        // Test case 1: 63 dakikanın 1 saat ve 3 dakika olarak dönüştürülmesi
        System.out.println(tc.timeConvert(63).equals("1:3") ? "Passed" : "Failed");

        // Test case 2: 120 dakikanın 2 saat ve 0 dakika olarak dönüştürülmesi
        System.out.println(tc.timeConvert(120).equals("2:0") ? "Passed" : "Failed");

        // Test case 3: 45 dakikanın 0 saat ve 45 dakika olarak dönüştürülmesi
        System.out.println(tc.timeConvert(45).equals("0:45") ? "Passed" : "Failed");

        // Test case 4: 0 dakikanın 0 saat ve 0 dakika olarak dönüştürülmesi
        System.out.println(tc.timeConvert(0).equals("0:0") ? "Passed" : "Failed");

        // Test case 5: 1 dakikanın 0 saat ve 1 dakika olarak dönüştürülmesi
        System.out.println(tc.timeConvert(1).equals("0:1") ? "Passed" : "Failed");
    }
}
