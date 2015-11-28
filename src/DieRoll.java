import java.util.Random;

/**
 * Created by westonmyers on 11/3/15.
 *
 * Represents a physical die. When I die is in hand
 * it will not change its sides. If you want a
 * different sided die you have to get a different
 * sided die in your hand. That is why there is not
 * a setter for the 'sides' field.
 */
public class DieRoll {

    private DieSides sides = DieSides.SIX;

    public DieRoll(){}

    public DieRoll(DieSides numSides){
        sides = numSides;
    }

    public DieSides getSides() {
        return sides;
    }

    public int rollDie(){
        Random rndNum = new Random();
        int dieRoll = rndNum.nextInt(sides.getValue()) + 1;
        return dieRoll;
    }
}
