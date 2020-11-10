
/**
 * Klasa Bikes  obsluguje metode utworzenia moich wartości do listy za pomocą konstruktora Vehicle.
 * <p>
 * @author Pawel Potoniec
 * @since 08 November 2020
 * @version 1.0
 */


public class Bikes {


    Vehicle b1= new Vehicle("Kross Move 1.0",50,"Bikes" );
    Vehicle b2= new Vehicle("Triban easy D",85,"Bikes" );

    public Vehicle getB1() { return b1;}

    public Vehicle getB2() { return b2;}
}
