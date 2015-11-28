import java.util.HashMap;
import java.util.*;

/**
 * Created by westonmyers on 11/13/15.
 * Test that the AbilityModifier
 */
public class AbilityModifier {
    private AbilityModifier(){}

/*    private static final Map<Integer, Integer> ABILITY_MODIFIERS;

    static {
        Map<Integer,Integer> loadMap = new HashMap<Integer,Integer>();
        loadMap.put(1,-5);
        loadMap.put(2,-4);
        loadMap.put(3,-4);
        loadMap.put(4,-3);
        loadMap.put(5,-3);
        loadMap.put(6,-2);
        loadMap.put(7,-2);
        loadMap.put(8,-1);
        loadMap.put(9,-1);
        loadMap.put(10,0);
        loadMap.put(11,0);
        loadMap.put(12,1);
        loadMap.put(13,1);
        loadMap.put(14,2);
        loadMap.put(15,2);
        loadMap.put(16,3);
        loadMap.put(17,3);
        loadMap.put(18,4);
        loadMap.put(19,4);
        loadMap.put(20,5);
        loadMap.put(21,5);
        loadMap.put(22,6);
        loadMap.put(23,6);
        loadMap.put(24,7);
        loadMap.put(25,7);
        loadMap.put(26,8);
        loadMap.put(27,8);
        loadMap.put(28,9);
        loadMap.put(29,9);
        loadMap.put(30,10);
        loadMap.put(31,10);
        loadMap.put(32,11);
        loadMap.put(33,11);
        loadMap.put(34,12);
        loadMap.put(35,12);
        loadMap.put(36,13);
        loadMap.put(37,13);
        loadMap.put(38,14);
        loadMap.put(39,14);
        loadMap.put(40,15);
        loadMap.put(41,15);
        loadMap.put(42,16);
        loadMap.put(43,16);

        ABILITY_MODIFIERS = Collections.unmodifiableMap(loadMap);

    }

    public static int getAbilityModifier(int key){
        return ABILITY_MODIFIERS.get(key);
    }*/

    public static int getAbilityModifierCalculation(int score){
        return (score/2)-5;
    }
}
