import org.junit.Test;

import java.util.ArrayList;


/**
 * Created by westonmyers on 11/17/15.  Modified 11/18/15 - extended TestSuper
 *      and made changes to function as a sub-class.
 *
 * Test that all six of the D&D version 4.0 abilities
 *      are created.
* Verify the ability 'Strength' is created
 *      A. get abilities list and verify it has Strength
 *      B. verify it has correct description
 *
 * Repeat process for:
 *      Constitution
 *      Dexterity
 *      Intelligence
 *      Wisdom
 *      Charisma
 *
 * Verify that there are no duplicates and that there
 *      aren't more than the default six.
 */
public class TestAbilitiesDefaultDnDVers40 extends TestSuper{
    AbilitiesDefaultDnDVers40 defaultAbilities = new AbilitiesDefaultDnDVers40();
    String failedMsgStrt = " ability was not added correctly!";
    String failedMsgType = " Type doesn't exist!";
    String failedMsgDescription = " Incorrect Description ";
    @Test
    @Override
    public void runTests(){
        String strDescription = "Strength (Str) measures your character's " +
                "physical power. It's important for most characters " +
                "who fight hand-to-hand.\n" +
                "* Melee basic attacks are based on Strength.\n" +
                "* Clerics, fighters, paladins, rangers, and" +
                "warlords have powers based on Strength.\n" +
                "* Your Strength might contribute to your" +
                "Fortitude defense.\n" +
                "* Strength is the key ability for Athletic skill checks.";
        String conDescription = "Constitution (Con) represents your character's " +
                "health, stamina, and vital force. All characters benefit from " +
                "high Constitution score.\n" +
                "* Your Constitution score is added to your hit points at first" +
                "level.\n" +
                "* The number of healing surges you can use each day is influenced " +
                "by your Constitution.\n" +
                "* Many warlock powers are based on Constitution.\n" +
                "* Your Constitution might contribute to your Fortitude defense.\n" +
                "* Constitution is the key ability for Endurance skill checks.";
        String dexDescription = "Dexterity (Dex) measures hand-eye coordination, " +
                "agility, reflexes, and balance.\n" +
                "* Ranged basic attacks, and balance.\n" +
                "* Many ranger and rogue powers are based on Dexterity." +
                "* Your Dexterity might contribute to your Reflex defense.\n" +
                "* If you wear light armor, your Dexterity might contribute to " +
                "your Armor Class.\n" +
                "* Dexterity is the key ability for Acrobatics, Stealth, and " +
                "Thievery skill checks.";
        String intDescription = "Intelligence (Int) describes how well your " +
                "character learns and reasons.\n" +
                "* Wizard powers are based on Intelligence.\n" +
                "* Your Intelligence might contribute to your Reflex defense.\n" +
                "* If you wear light armor, your Intelligence might contribute " +
                "to your Armor Class.\n" +
                "* Intelligence is the key ability for Arcana, History, and " +
                "Religion skill checks.";
        String wisDescription = "Wisdom (Wis) measures your common sense, " +
                "perception, self-discipline, and empathy. You use your " +
                "Wisdom score to notice details, sense danger, and get a " +
                "read on other people.\n" +
                "* Many cleric powers are based on Wisdom.\n" +
                "* Your Wisdom might contribute to your Will defensen.\n" +
                "* Wisdom is the key ability for Dungeoneering, Heal, Insight, " +
                "Nature, and Perception skill checks.";
        String chaDescription = "Charisma (Cha) measures your force of " +
                "personality, persuasiveness, and leadership.\n" +
                "* Many paladin and warlock powers are based on Charisma.\n" +
                "* Your Charisma might contribute to your Will defense.\n" +
                "* Charisma is the key ability for Bluff, Diplomacy, " +
                "Intimidate, and Streetwise skill checks.";
        testAbility("Strength", strDescription);
        testAbility("Constitution", conDescription);
        testAbility("Dexterity", dexDescription);
        testAbility("Intelligence", intDescription);
        testAbility("Wisdom", wisDescription);
        testAbility("Charisma", chaDescription);
        printResults(failedTests);
    }

    private void testAbility(String type, String description){
        ArrayList<Ability> defAbilList = new ArrayList<Ability>(defaultAbilities.getAbilitiesList());
        int index = isAbilityTypeInList(type);
        if (defAbilList.isEmpty() || index == -1){
            failedTests.add(type + failedMsgStrt + failedMsgType);
        } else if (index > -1 && !defAbilList.get(index).getDescription().equals(description)){
            failedTests.add(type + failedMsgStrt + failedMsgDescription);
        }
    }

    private int isAbilityTypeInList(String type){
        int index = -1;
        if (!defaultAbilities.getAbilitiesList().isEmpty()){
            for (int i = 0; i < defaultAbilities.getAbilitiesList().size(); i++){
                if(defaultAbilities.getAbilitiesList().get(i).toString().equals(type)){
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

}
