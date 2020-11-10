
/**
 * Klasa Planes  obsluguje metode utworzenia moich wartości do listy za pomocą konstruktora Vehicle.
 * <p>
 * @author Pawel Potoniec
 * @since 08 November 2020
 * @version 1.0
 */
public class Planes {




    Vehicle p1= new Vehicle("Lockheed YF-12A",3330,"Planes" );
    Vehicle p2= new Vehicle("Messerschmitt Me 262",1004,"Planes" );



    public Vehicle getP1() {
        return p1;
    }

    public Vehicle getP2() {
        return p2;
    }
}
