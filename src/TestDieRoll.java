import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by westonmyers on 11/3/15. Updated 11/27/15.
 *
 * Test 1 - Verify that a DieRoll object's sidesField has a default of 6 sides.
 *
 * Test 2 - Verify that a DieRoll object with defaults has:
 *      A) Numbers that are in the range of 1 - 6
 *      B) All numbers, 1 - 6, are used.
 *          Roll 1000 times to make sure there are enough
 *          rolls to insure the test is accurate
 *
 * Test 3 - Verify that the enum sent to the constructor is set as the DieRoll
 *          objects field 'sides'.
 *
 * Test 4 - That all 8 of the different sided dice have:
 *      A) Numbers that are in range
 *      B) All side numbers are used.
 *      ** NOTE: Roll 1000 times to make sure there are enough
 *          rolls to insure the test is accurate. **
 */
public class TestDieRoll extends TestSuper{
    String failMsgStrt = "Die roll ";

    @Test
    @Override
    void runTests() {
        testSidesFieldDefault();
        testDieRollDefault();
        testDieRollConstructorWithArg();
        testDieRollAllSidedDice();
        printResults(failedTests);
    }
    /**
     * Test 1 - Verify that a DieRoll object's sidesField has a default of 6 sides.
     */
    private void testSidesFieldDefault(){
        String rollSides = verifyDieRollSides(DieSides.SIX);

        if (rollSides != null){
            failedTests.add("\tThe test for 'SidesFieldDefault' failed the following test:");
            failedTests.add(rollSides);
        }
    }

    /**
     * Test 2 - Verify that a DieRoll object with defaults has numbers in range and
     *          that all sides of the dice are generated.
     */
    private void testDieRollDefault(){
        DieRoll noArgs = new DieRoll();
        verifyRangeAndSides(noArgs.getSides());
    }

    /**
     * Test 3 - Verify that the enum sent to the constructor is set as the DieRoll <<<----**Stopped here!
     * objects field 'sides'.
     * @return
     */
    public void testDieRollConstructorWithArg(){
        ArrayList<String> failedDieRollConstructorWithArg = new ArrayList<>();
        String rollSides;

        for (DieSides dieSide : DieSides.values()) {
            rollSides = verifyDieRollSides(dieSide);
            if (rollSides != null){
                failedDieRollConstructorWithArg.add(rollSides);
            }
        }
        if (!failedDieRollConstructorWithArg.isEmpty()){
            failedDieRollConstructorWithArg.add(0, "\tThe test for 'DieRollConstructorWithArg' failed the following tests:");
            failedTests.addAll(failedDieRollConstructorWithArg);
        }

    }

    /**
     * Test 4 Verify that all 8 of the different sided dice roll numbers
     *          in range and that all sides of each die are used.
     *      ** NOTE: Roll 1000 times to make sure there are enough
     *          rolls to insure the test is accurate. **
     */
    public void testDieRollAllSidedDice(){
        for (DieSides dieSide : DieSides.values()) {
            verifyRangeAndSides(dieSide);
        }
    }

    /**
     * service methods for the tests above
     */
    private String verifyDieRollSides(DieSides sides){
        String result = null;
        DieRoll dieRollSides = new DieRoll(sides);
        if (dieRollSides.getSides() != sides) {
            result = ("\t\t* The number of sides for the die should be " +
                    sides +". The 'DieRoll' object was created with " +
                    dieRollSides.getSides() + "!");
        }
        return result;
    }

    private void verifyRangeAndSides(DieSides dieSide){
        ArrayList<String> failedRange = getNumsOutOfRange(dieSide);
        ArrayList<String> failedSidesNotUsed = getDieSidesNotUsed(dieSide);
        if (!failedRange.isEmpty()){
            failedTests.addAll(failedRange);
        }
        if (!failedSidesNotUsed.isEmpty()){
            failedTests.addAll(failedSidesNotUsed);
        }
    }

    private ArrayList<String> getNumsOutOfRange(DieSides dieSide){
        ArrayList<String> listNumsOutOfRange = new ArrayList<>();
        ArrayList<Integer> rollArray = roll1000Times(dieSide);

        for (int i = 0; i < rollArray.size(); i++){
            if (rollArray.get(i) < 1 || rollArray.get(i) > dieSide.getValue()){
                listNumsOutOfRange.add("\t\t\t* The roll was not between the numbers of 1 and "
                        + dieSide.getValue() + "! The actual roll was " + rollArray.get(i));
            }
        }
        if (!listNumsOutOfRange.isEmpty()) {
            listNumsOutOfRange.add(0, "\t\tThe following rolls were out of range for " +
                    "the " + dieSide + " sided die:");
        }
        return listNumsOutOfRange;
    }

    private ArrayList<String> getDieSidesNotUsed(DieSides dieSide){
        ArrayList<String> listDieSidesNotUsed = new ArrayList<>();
        ArrayList<Integer> rollArray = roll1000Times(dieSide);
        for (int i = 1; i < dieSide.getValue()+1;i++) {
            if (rollArray.lastIndexOf(i) == -1) {
                listDieSidesNotUsed.add("\t\t\t* The number " + (i) + " was not rolled!");
            }
        }
        if (!listDieSidesNotUsed.isEmpty()) {
            listDieSidesNotUsed.add(0, "\t\tThe following die sides were not used:");
        }
        return listDieSidesNotUsed;
    }

    private ArrayList<Integer> roll1000Times(DieSides dieSide){
        ArrayList<Integer> rollArray = new ArrayList<>();
        DieRoll roll = new DieRoll(dieSide);
        for (int i = 0; i < 1000; i++){
            rollArray.add(i, roll.rollDie());
        }
        return rollArray;
    }


}
