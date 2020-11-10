



/**
 * Klasa Vehicle  zawiera moje zmienne potrzebne do tworzenia obiektów dla listy oraz konstruktor do ich utworzenia.
 * <p>
 * @author Pawel Potoniec
 * @since 08 November 2020
 * @version 1.0
 */
public class Vehicle {
    private int speed;
    private String name;
    private String type;


    /**
     * Konstruktor klasy Vehicle
     */
    public  Vehicle(String name, int speed, String type) {

        this.speed = speed;
        this.name = name;
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }
}






