/**
 * Created by westonmyers on 11/17/15.
 */
public class AbilitiesDefaultDnDVers40 extends AbilitiesSuper{
    String strength = "Strength";
    String strDescription = "Strength (Str) measures your character's " +
            "physical power. It's important for most characters " +
            "who fight hand-to-hand.\n" +
            "* Melee basic attacks are based on Strength.\n" +
            "* Clerics, fighters, paladins, rangers, and" +
            "warlords have powers based on Strength.\n" +
            "* Your Strength might contribute to your" +
            "Fortitude defense.\n" +
            "* Strength is the key ability for Athletic skill checks.";

    String constitution = "Constitution";
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

    String dexterity = "Dexterity";
    String dexDescription = "Dexterity (Dex) measures hand-eye coordination, " +
            "agility, reflexes, and balance.\n" +
            "* Ranged basic attacks, and balance.\n" +
            "* Many ranger and rogue powers are based on Dexterity." +
            "* Your Dexterity might contribute to your Reflex defense.\n" +
            "* If you wear light armor, your Dexterity might contribute to " +
            "your Armor Class.\n" +
            "* Dexterity is the key ability for Acrobatics, Stealth, and " +
            "Thievery skill checks.";

    String intelligence = "Intelligence";
    String intDescription = "Intelligence (Int) describes how well your " +
            "character learns and reasons.\n" +
            "* Wizard powers are based on Intelligence.\n" +
            "* Your Intelligence might contribute to your Reflex defense.\n" +
            "* If you wear light armor, your Intelligence might contribute " +
            "to your Armor Class.\n" +
            "* Intelligence is the key ability for Arcana, History, and " +
            "Religion skill checks.";

    String wisdom = "Wisdom";
    String wisDescription = "Wisdom (Wis) measures your common sense, " +
            "perception, self-discipline, and empathy. You use your " +
            "Wisdom score to notice details, sense danger, and get a " +
            "read on other people.\n" +
            "* Many cleric powers are based on Wisdom.\n" +
            "* Your Wisdom might contribute to your Will defensen.\n" +
            "* Wisdom is the key ability for Dungeoneering, Heal, Insight, " +
            "Nature, and Perception skill checks.";

    String charisma = "Charisma";
    String chaDescription = "Charisma (Cha) measures your force of " +
            "personality, persuasiveness, and leadership.\n" +
            "* Many paladin and warlock powers are based on Charisma.\n" +
            "* Your Charisma might contribute to your Will defense.\n" +
            "* Charisma is the key ability for Bluff, Diplomacy, " +
            "Intimidate, and Streetwise skill checks.";

    public AbilitiesDefaultDnDVers40(){
        addAbility(strength, strDescription);
        addAbility(constitution, conDescription);
        addAbility(dexterity, dexDescription);
        addAbility(intelligence, intDescription);
        addAbility(wisdom, wisDescription);
        addAbility(charisma, chaDescription);
    }
}
