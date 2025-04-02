package src.challenges;

public class ifThen {

    public static void main(String[] args) {

        double value1 = 20.00d;
        double value2 = 80.00d;

        double value3 = (value1 + value2) * 100.00d;

        double rem = value3 % 30.00d;

        boolean isZero = (rem == 0) ? true : false ;

        System.out.println("Value of remainder : " +rem);

        if (!isZero) {
            System.out.println("got some remainder = " +rem);
        } else {
            System.out.println("remainder is zero");
        }
    }
}
