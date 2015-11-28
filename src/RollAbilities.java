import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by westonmyers on 11/6/15.
 */
public class RollAbilities {
    private DieSides dieSidesToUse = DieSides.SIX;
    private int allowedNumOfDice = 3;
    private int numBufferRolls = 0;
    private int numCompleteStatGroups = 1;
    /*private HashMap<String, Integer> statNames = new HashMap<String, Integer>;*/

    public RollAbilities(){
/*        statNames.add("Strength", 0);
        statNames.add("Dexterity", 0);
        statNames.add("Constitution", 0);
        statNames.add("Intelligence", 0);
        statNames.add("Wisdom", 0);
        statNames.add("Charisma", 0);*/
    }

    public DieSides getDieSidesToUse(){
        return dieSidesToUse;
    }

    public int getAllowedNumOfDice() {
        return allowedNumOfDice;
    }

    public int getNumBufferRolls() {
        return numBufferRolls;
    }

    public int getNumCompleteStatGroups() {
        return numCompleteStatGroups;
    }

/*    public ArrayList<String> getStatNames() {
        return statNames;
    }*/
}
