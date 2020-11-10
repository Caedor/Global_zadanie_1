
/**
 * Klasa Cars  obsluguje metode utworzenia moich wartości do listy za pomocą konstruktora Vehicle.
 * <p>
 * @author Pawel Potoniec
 * @since 08 November 2020
 * @version 1.0
 */

public class Cars {

    Vehicle c1= new Vehicle("BMW M3",310, "Cars");
    Vehicle c2= new Vehicle("BMW M4",290, "Cars");


    public Vehicle getC1() {
        return c1;
    }

    public Vehicle getC2() {
        return c2;
    }
}
