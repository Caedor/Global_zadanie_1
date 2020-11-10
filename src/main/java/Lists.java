import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import java.awt.*;
import java.util.Comparator;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

/**
 * Klasa Lists obsluguje metode utworzenia  listy z wartości otrzymanych z klas Ships, Planes, Cars, Bikes oraz logikę segregacji.
 * <p>
 * @author Pawel Potoniec
 * @since 08 November 2020
 * @version 1.0
 */
public class Lists  {

    Ships ships= new Ships();
    Planes planes= new Planes();
    Cars cars= new Cars();
    Bikes bikes= new Bikes();
    static final Logger logger = Logger.getLogger(Window.class.getName());
    private String choice;

    /**
     * Metoda do utworzenia listy i posegregowania wartości.
     */
    void filter() {

        List<Vehicle> list = List.of(ships.getS1(), ships.getS2(), cars.getC1(), cars.getC2(), bikes.getB1(), bikes.getB2(), planes.getP1(), planes.getP2());

        Scanner myObj = new Scanner(System.in);
        choice = myObj.nextLine();


        Stream<Vehicle> newStream = list.stream().filter(vehicle -> vehicle.getType().equals(choice));
        List<Vehicle> newList = newStream.collect(Collectors.toList());
        if (choice.equals("All")){
            newList = new ArrayList(list);
        }
        else if (choice.equals("Exit")){
            System.exit(0);
        }
        if (newList.size() > 0) {
            newList.sort(Comparator.comparingInt(Vehicle::getSpeed).reversed()); // sortowanie

            Vehicle vehicleToPrint = newList.stream().findFirst().orElseThrow();  // najszybszy pojazd
            logger.info("\nNajszybszy pojazd to: " + vehicleToPrint.getName() + "\nJego prędkość wynosi: " + vehicleToPrint.getSpeed()+" km/h");
            logger.info("\nWitaj proszę napisać opcję: \nShips \nPlanes \nCars \nBikes \nAll \nExit");
            filter();}
        else{
            logger.info("\nWybrano złą opcję, proszę spróbować ponownie.");
            filter();

        }
    }





    public static void main(String[] args) {
        BasicConfigurator.configure();
        logger.info("\nWitaj. Proszę napisać opcję: \nShips \nPlanes \nCars \nBikes \nAll \nExit");
        Lists list = new Lists();
        list.filter();

    }



}
