import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by westonmyers on 11/14/15. Updated 11/19/15.
 *
 * Test 1
 * Verify that the Type constructor works
 *      A. takes a name
 *      B. the getter returns the name sent to it in the constructor
 *
 * Test 2
 * Verify that the Type and Description constructor works
 *      A. takes a name and description
 *      B. the getter returns the name sent to it in the constructor
 *
 * Test 3
 * Verify that the score can be set and that the modifier is automatically set
 *      A. the number sent to the set the score is the same number the getter
 *          retrieves
 *      B. make sure that the modifier from the object matches the calculated
 *          number based off of the score
 *
 * Test 4
 * Verify that the description sent to the object's description is the one
 * that the object's getter returns
 *      A. the string sent to the object's setter matches the string from
 *          the object's getter
 *
 * Test 5
 * Verify that the toString shows the Type of the ability
 */

public class TestAbility extends TestSuper{
    ArrayList<String> failedConstType = new ArrayList<>();
    ArrayList<String> failedDescription = new ArrayList<>();
    ArrayList<String> failedScore = new ArrayList<>();
    ArrayList<String> failedMod = new ArrayList<>();
    ArrayList<String> failedToStr = new ArrayList<>();
    String consFailMsgStrt = "\t * Constructor should set type to the word 'Test'.";

    @Test
    @Override
    public void runTests(){
        testConstructorType();
        testConstructorTypeAndDescription();
        testScoreAndModifier();
        testGetDescription();
        testToString();
        // Check for failures in all the categories and add any
        //  failures to the failures list.
        if (!failedConstType.isEmpty()) {
            failedTests.add("\tType");
            failedTests.addAll(failedConstType);
        }

        if (!failedDescription.isEmpty()) {
            failedTests.add("\tDescription");
            failedTests.addAll(failedDescription);
        }

        if (!failedScore.isEmpty()) {
            failedTests.add("\tScore");
            failedTests.addAll(failedScore);
        }

        if (!failedMod.isEmpty()) {
            failedTests.add("\tModifier");
            failedTests.addAll(failedMod);
        }

        if (!failedToStr.isEmpty()) {
            failedTests.add("\tTo String");
            failedTests.addAll(failedToStr);
        }
        printResults(failedTests);
    }

    /**
     * Test 1 -  Verify that the constructor that only takes a 'Type'
     *  argument functions.
     * */
    private void testConstructorType() {
        // Test that the constructor

        String typeTest = "Test";

        Ability tstAbil = new Ability(typeTest);

        testConstructor(tstAbil, typeTest);
        tstAbil = null;
    }

    /**
     * Test 2 -  Verify that the constructor that takes
     * two arguments - 'Type' and 'Description' - functions.
     * */
    private void testConstructorTypeAndDescription() {
        String typeTest = "Test";
        String descriptionTest = "Test description in constructor.";

        Ability tstAbil = new Ability(typeTest, descriptionTest);

        testConstructor(tstAbil, typeTest);

        testDescription(tstAbil, descriptionTest);

        tstAbil = null;
    }

    /**
     * Method for teh constructor tests to use.
     * @param tstAbil
     * @param typeTest
     */
    private void testConstructor(Ability tstAbil, String typeTest) {
        if(tstAbil.getType() == null){
            failedConstType.add(consFailMsgStrt + " It was not set and is null.");
        } else if(!tstAbil.getType().equals(typeTest)){
            failedConstType.add(consFailMsgStrt + " It was set to '" + tstAbil.getType().toString() + "'.");
        }
    }

    /**
     * Test 3 -  Verify that the score can be set and that the modifier is automatically set
     * */
    private void testScoreAndModifier() {
        String failMsgStrtScr = "\t * Score setter, setScore, should set score to ";
        String failMsgStrtMod = "\t * When the score is set it should set modifier to ";
        Ability tstAbility2 = new Ability("Test2");
        int score;
        int mod;
        int calcMod;

        for (int i = 0; i < 22; i=i+5){
            tstAbility2.setScore(i);
            score = tstAbility2.getScore();
            mod = tstAbility2.getModifier();
            calcMod = (i/2)-5;
            if (i == 0){
                if (score != 1) {
                    failedScore.add(" \t * Score should be set to 1 since" +
                            " the score cannot be lower than one and it tried to set it to " +
                            i + ".");
                }
                i = i -4; // make it so that it will try score of 1 and then do even and odd numbers.
            } else if (score != i){
                failedScore.add(failMsgStrtScr + i + ". The current score is " + score + ".");
            }

            if (calcMod != mod){
                failedMod.add(failMsgStrtMod + calcMod + ". It was set to " + mod + ".");
            }
        }
        tstAbility2 = null;
    }

    /**
     * Test 4 - Verify that the description sent to the object's description is the one
     * that the object's getter returns
     */
    private void testGetDescription() {

        String abilityType = "Test3";
        String description = abilityType + " Test Description using setter.";

        Ability tstAbility3 = new Ability(abilityType);
        tstAbility3.setDescription(description);
        testDescription(tstAbility3, description);
    }

    /**
     * Method for the tests that check the 'Description'.
     * @param obj
     * @param description
     */
    private void testDescription(Ability obj, String description){
        String failMsg1stHalf = "\t * Description should set the description to '";

        String getDescription = obj.getDescription();

        if (getDescription == null){
            failedDescription.add(failMsg1stHalf + description + "' It is currently set to null.");
        } else if (!getDescription.equals(description)){
            failedDescription.add(failMsg1stHalf + description + "' It is currently set to '" + getDescription + "'.");
        }
    }

    /**
     * Test 5 - Verify that the toString shows the Type of the ability
     */
    private void testToString(){
        String failMsg1stHalf = "\t * To String should set the description to '";
        String abilityType = "Test3";
        Ability tstAbility4 = new Ability(abilityType);

        if (!tstAbility4.toString().equals(abilityType)){
            failedToStr.add(failMsg1stHalf + abilityType + ".' It is currently set to '" + tstAbility4.toString());
        }
    }
}
