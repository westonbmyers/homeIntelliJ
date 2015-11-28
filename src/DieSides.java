/**
 * Created by westonmyers on 11/5/15.
 */
public enum DieSides {
    TWO(2),
    FOUR(4),
    SIX(6),
    EIGHT(8),
    TEN(10),
    TWELVE(12),
    TWENTY(20),
    ONE_HUNDRED(100);

    private final int value;

    DieSides(final int newValue){
        value = newValue;
    }

    public int getValue(){
        return value;
    }
}
