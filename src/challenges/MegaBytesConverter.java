package src.challenges;

public class MegaBytesConverter {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.1234d, -3.123d));
    }

    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2) {

        double value =  d1 * 1000;
        value = (long) value;

        double value2 = d2 * 1000;
        value2 = (long) value2;

        if (value == value2) {
            return true;
        } else {
            return false;
        }
    }
}
