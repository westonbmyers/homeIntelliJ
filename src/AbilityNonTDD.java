/**
 * Created by westonmyers on 11/14/15.
 */
public class AbilityNonTDD {
    private String name;
    private int score;
    private int scoreModifier;
    private String description;

    public AbilityNonTDD() {

    }

    public AbilityNonTDD(int score) {
        if (score > 0) {
            this.score = score;
        } else {
            this.score = 1;
        }

        /**
         * Calculate the modifier based on D&D version 4.0
         */
        this.scoreModifier = (score/2)-5;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score > 0) {
            this.score = score;
        } else {
            this.score = 1;
        }

        /**
         * Calculate the modifier based on D&D version 4.0
         */
        this.scoreModifier = (score/2)-5;
    }

    public int getScoreModifier() {
        return scoreModifier;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
