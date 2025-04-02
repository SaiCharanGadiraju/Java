package src.challenges;

public class OverloadedChallenge {

    // 1 inch = 2.54 cm
    // 1 foot = 12 inches

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(68));
        System.out.println(convertToCentimeters(5, 8));
    }

    public static double convertToCentimeters(int heightInInchs) {
        // convert inches to cm
        return heightInInchs * 2.54;
    }

    public static double convertToCentimeters(int heightInFeet, int heightInInches) {
        // convert feet and inches to inches
        int totalHeightInInches = (heightInFeet * 12) + heightInInches;

        // call first method to convert in cm
        return convertToCentimeters(totalHeightInInches);
    }
}
