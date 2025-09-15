import java.lang.Math;


public class Problem7 {

    public static void main(String[] args) {

        double radiusInKm = 6378.0;
        double piConstant = Math.PI;

        double volumeResult = (4.0 / 3.0) * piConstant * Math.pow(radiusInKm, 3);

        System.out.printf("The volume of earth in cubic kilometers is %.2f.\n", volumeResult);
    }
}
