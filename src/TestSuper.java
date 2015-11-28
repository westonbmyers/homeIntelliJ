import java.util.ArrayList;

/**
 * Created by westonmyers on 11/18/15.
 */
public abstract class TestSuper {
    ArrayList<String> failedTests = new ArrayList<String>();

    abstract void runTests();

    public void printResults(ArrayList<String> failedTestsList){
        if(failedTests.isEmpty()){
            System.out.println("Tests Passed");
        } else {
            System.out.print("The following tests failed: ");
            System.out.println();
            for (String failedTest : failedTests){

                System.out.println(failedTest.toString());
            }
        }
    }
}
