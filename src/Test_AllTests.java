/**
 * Created by westonmyers on 11/24/15.
 */
public class Test_AllTests {
    static String testFooter = "***************************" +
            "**************************************" +
            "***********************";

    public static void runAllTests(){
        testsHeader("Enum Die Sides Tests");
        TestEnumDieSides tstEnum = new TestEnumDieSides();
        tstEnum.runTests();
        System.out.println(testFooter);

        testsHeader("Roll Abilities Tests");
        TestRollAbilities rollAbilities = new TestRollAbilities();
        rollAbilities.runTests();
        System.out.println(testFooter);

        testsHeader("Create Ability Tests");
        TestAbility tstAbility = new TestAbility();
        tstAbility.runTests();
        System.out.println(testFooter);

        testsHeader("Default Abilities D&D Version 4.0");
        TestAbilitiesDefaultDnDVers40 tstAbilityDefaults = new TestAbilitiesDefaultDnDVers40();
        tstAbilityDefaults.runTests();
        System.out.println(testFooter);

        testsHeader("Die Roll Tests");
        TestDieRoll tstDieRoll = new TestDieRoll();
        tstDieRoll.runTests();
        System.out.println(testFooter);
    }

    private static void testsHeader(String testName){
        System.out.println();
        System.out.println("***************************" +
                "**************************************" +
                "***********************");
        System.out.println(testName);
        System.out.println("---------------------------" +
                "--------------------------------------" +
                "-----------------------");
    }
}
