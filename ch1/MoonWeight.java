/**
 * MoonWeight
 */
public class MoonWeight {

    public static void main(String args[]){
        double earth = 100;
        double moon;

        for (int counter = 0; counter < 20; counter++) {
            moon = earth * 0.17;
            System.out.println(
                "If your Earth weight is " + earth
                + " then your Moon weight is " + moon);
            earth = earth * 1.2;
        }
    }
}