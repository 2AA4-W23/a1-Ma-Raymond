package pk;
import java.util.Arrays;
import java.util.Random;

public class Dice {
    Faces current;
    public Faces roll() {
        int howManyFaces = Faces.values().length;
        Random bag = new Random();
        return Faces.values()[bag.nextInt(howManyFaces)];
    }
    
}
