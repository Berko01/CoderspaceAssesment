public class CountingMinutes {

    public int convertToMinutes(String time) {

        String period = time.substring(time.length() - 2);
        String[] hoursMins = time.substring(0, time.length() - 2).split(":");

        int hour = Integer.parseInt(hoursMins[0]);
        int min = Integer.parseInt(hoursMins[1]);

        if (period.equals("am") && hour == 12) {
            hour = 0;
        } else if (period.equals("pm") && hour != 12) {
            hour += 12;
        }

        return hour * 60 + min;
    }

    public int countingMinutes(String str) {

        String[] times = str.split("-");

        int startMinutes = convertToMinutes(times[0]);
        int endMinutes = convertToMinutes(times[1]);

        if (endMinutes < startMinutes) { // Bu kontrol düzeltilmiştir
            endMinutes += 24 * 60; // 24 saat ekle
        }

        return endMinutes - startMinutes;
    }

    public static void main(String[] args) {
        CountingMinutes cm = new CountingMinutes();

        // Test cases
        System.out.println(cm.countingMinutes("9:00am-10:00am") == 60 ? "Passed" : "Failed");
        System.out.println(cm.countingMinutes("1:00pm-11:00am") == 1320 ? "Passed" : "Failed");
        System.out.println(cm.countingMinutes("12:30pm-12:00am") == 690 ? "Passed" : "Failed");
        System.out.println(cm.countingMinutes("11:59pm-12:01am") == 2 ? "Passed" : "Failed");
        System.out.println(cm.countingMinutes("5:45am-8:55am") == 190 ? "Passed" : "Failed");
    }
}
