
/**
 * Klasa Ships  obsluguje metode utworzenia moich wartości do listy za pomocą konstruktora Vehicle.
 * <p>
 * @author Pawel Potoniec
 * @since 08 November 2020
 * @version 1.0
 */



public class Ships{



    Vehicle s1= new Vehicle("Queen Mary 2",56, "Ships");
    Vehicle s2= new Vehicle("Norwegian Dawn",46, "Ships");



    public Vehicle getS1() {
        return s1;
    }

    public Vehicle getS2() {
        return s2;
    }
}
