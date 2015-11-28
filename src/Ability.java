/**
 * Created by westonmyers on 11/16/15.
 */
public class Ability {
    private String type;
    private int score = -10001;
    private int modifier = -10001;
    private String description;

    /**
     * No setter. The type must be set at construction.
     * That is also why there is no default constructor
     * @param type
     */
    public Ability(String type){
        this.type = type;
    }

    public Ability(String type, String description){
        this.type = type;
        this.description = description;
    }

    public String getType(){
        return type;
    }

    public int getScore() {
        return score;
    }

    public int getModifier() {
        return modifier;
    }

    public void setScore(int score) {
        if (score > 0) {
            this.score = score;
        } else {
            this.score = 1;
        }

        modifier = (score/2)-5;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String toString(){
        return type;
    }
}
