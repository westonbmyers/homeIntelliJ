import java.util.ArrayList;

/**
 * Created by westonmyers on 11/17/15.
 */
abstract public class AbilitiesSuper {
    public ArrayList<Ability> abilitiesList = new ArrayList<Ability>();

    public void addAbility(String type, String description){
        Ability createAbility = new Ability(type);
        createAbility.setDescription(description);
        abilitiesList.add(createAbility);
    }

    public  void saveAbilitesList(){

    }

    public ArrayList<Ability> getAbilitiesList(){
        return abilitiesList;
    }
}
