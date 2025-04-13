package org.example.day3;

public class TimeConvertor {
    public static int convertHoursToMinutes(int hours) {
        return hours * 60;
    }
    public static int convertMinutesToSeconds(int minutes) {
        return minutes * 60;
    }

    public static String formatTime(int hours, int minutes, int seconds) {
        return hours + " ч " + minutes + " мин " + seconds + " сек";
    }
    public static void main(String[] args) {
        int hours = 2;
        int minutes = 47;

        int totalMinutes = convertHoursToMinutes(hours) + minutes;
        int totalSeconds = convertMinutesToSeconds(totalMinutes);
        System.out.println("Seconds " + totalSeconds);
        System.out.println("Format " +formatTime(hours, minutes, totalSeconds));
    }
}
