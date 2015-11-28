/**
 * Created by westonmyers on 11/6/15.  Modified 11/18/15 - extended TestSuper
 *      and made changes to function as a sub-class.
 * This class populates the abilities of the character.
 * It tests the following:
 * 1 - Default constructor and default field values
 *      a. Verify sides the die has (dieSidesToUse field) = 6
 *      b. Verify the number dice allowed for a ability field = 3
 *      c. Verify the number of buffer rolls for a ability = 0
 *      d. Verify the number of ability complete groups = 1
 * 2 - Verify the constructor sets the field values
 *      a. Verify sides the die has (dieSides) = number sent in constructor
 *      b. Verify the number dice used for a ability = number sent in constructor
 *      c. Verify the number of buffer rolls for a ability = number sent in constructor
 *      d. Verify the number of buffer ability complete groups = number sent in constructor
 * 3 - Verify it records all the rolls for a group
 *      a. Verify that the amount of rolls used for total is not more than number of dice allowed
 *          (verify that the buffer amount is not what is used)
 *      b. Verify that the highest rolls are used to fill the allowed amount of rolls
 *      c. Verify the extra rolls from the buffer rolls are removed
 * 4 - Verify ability groups (with abilities) = amount of groups in the groups field
 * 5 - Get and verify total roll from addition of all dice rolled is correct
 * 6 - Get and verify a grand total of all the ability scores added together
 * 7 - User is able to select which group they use for there abilities and the others are removed
 * 8 - Verify score adjusting
 *      a. If score number goes down, grand total goes up by equal amount
 *      b. If score number goes up, grand total goes down by equal amount
 *      c. Verify the total of all adjusted scores = grand total of roll
 *      d. Verify the grand total is not reduced < 0 or > grand total
 * 9 - Verify ability customization
 *      a. Verify ability type names can be changed
 *      b. Verify ability types can be added
 *      c. Verify ability types can be deleted
 * 10 - Verify abilities are saved
 */

import org.junit.Test;

/**
 * Test #1
 */
public class TestRollAbilities extends TestSuper{
    @Test
    @Override
    public void runTests() {
        testDefaultConstructorFields();
        printResults(failedTests);
    }

    private void testDefaultConstructorFields(){
        String strStrt = "The field '";
        String strMid = "' is not the default of ";
        String strLst = "! It is set to ";
        RollAbilities defaultStat = new RollAbilities();
        /**
         * Test #1 a: Verify sides the die has (dieSidesToUse field) = 6
         */
        if (defaultStat.getDieSidesToUse().getValue() != 6){
            failedTests.add(strStrt + "dieSidesToUse" +  strMid +
                    "6" + strLst + defaultStat.getDieSidesToUse().getValue() +
                    "!");
        }
        /**
         * Test #1 b: Verify the number dice allowed for a ability field = 3
         */
        if (defaultStat.getAllowedNumOfDice() != 3){
            failedTests.add(strStrt + "allowedNumOfDice" +  strMid +
                    "3" + strLst + defaultStat.getAllowedNumOfDice() +
                    "!");
        }
        /**
         * Test #1 c: Verify the number of buffer rolls for a ability = 0
         */
        if (defaultStat.getNumBufferRolls() != 0){
            failedTests.add(strStrt + "numBufferRolls" +  strMid +
                    "0" + strLst + defaultStat.getNumBufferRolls() +
                    "!");
        }
        /**
         * Test #1 d: Verify the number of additional ability complete groups = 1
         */
        if (defaultStat.getNumCompleteStatGroups() != 1) {
            failedTests.add(strStrt + "numBufferRolls" +  strMid +
                    "1" + strLst + defaultStat.getNumCompleteStatGroups() +
                    "!");
        }
    }
}
