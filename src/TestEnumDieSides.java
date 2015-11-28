import org.junit.Test;

/**
 * Created by westonmyers on 11/24/15.
 *
 * Verify that the Enum DieSides is correct.
 * @return
 */
public class TestEnumDieSides extends TestSuper {
    @Test
    @Override
    void runTests() {
        testDieSidesEnum();
        printResults(failedTests);
    }


    public void testDieSidesEnum(){
        int numberOfDice = 0;
        int numberOfDiceWithCorrectSides = 0;

        for (DieSides dieSide : DieSides.values()){
            switch (dieSide){
                case TWO:
                    if (dieSide.getValue() == 2){
                        numberOfDiceWithCorrectSides++;
                    }
                    numberOfDice++;
                    break;
                case FOUR:
                    if (dieSide.getValue() == 4){
                        numberOfDiceWithCorrectSides++;
                    }
                    numberOfDice++;
                    break;
                case SIX:
                    if (dieSide.getValue() == 6){
                        numberOfDiceWithCorrectSides++;
                    }
                    numberOfDice++;
                    break;
                case EIGHT:
                    if (dieSide.getValue() == 8){
                        numberOfDiceWithCorrectSides++;
                    }
                    numberOfDice++;
                    break;
                case TEN:
                    if (dieSide.getValue() == 10){
                        numberOfDiceWithCorrectSides++;
                    }
                    numberOfDice++;
                    break;
                case TWELVE:
                    if (dieSide.getValue() == 12){
                        numberOfDiceWithCorrectSides++;
                    }
                    numberOfDice++;
                    break;
                case TWENTY:
                    if (dieSide.getValue() == 20){
                        numberOfDiceWithCorrectSides++;
                    }
                    numberOfDice++;
                    break;
                case ONE_HUNDRED:
                    if (dieSide.getValue() == 100){
                        numberOfDiceWithCorrectSides++;
                    }
                    numberOfDice++;
                    break;
                default:
                    numberOfDice++;
                    break;
            }
        }

        if (numberOfDiceWithCorrectSides != 8){
            failedTests.add("Test dice have correct number of sides");
            failedTests.add("\tOut of 8 different sided dice, " +
                    numberOfDiceWithCorrectSides + " dice have the number of sides correct.");
        }

        if (numberOfDice != 8){
            failedTests.add("Test that there are 8 dice");
            failedTests.add("\tThere should be 8 different sided " +
                    "dice. There are currently " + numberOfDice + " different sided dice.");
        }
    }
}
