package src.challenges;

public class SecToMinChallenge {

    public static void main(String[] args) {

        System.out.println(getDurationString(7200));
    }

    public static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            seconds = seconds % 60;
            return getDurationString(minutes, seconds);
        } else {
            return "invalid seconds value";
        }
    }

    public static String getDurationString(int minutes, int seconds) {
        int hours = minutes / 60;
        minutes = minutes % 60;
        return hours+"h " +minutes+ "m " +seconds+ "s";
    }
}
