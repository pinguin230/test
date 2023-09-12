/**
 * Represents a Luke number.
 * <p>
 * This class provides methods to calculate the value of a Luke number
 * and its square based on its position in the sequence.
 * </p>
 */
public class LukeNumberDoc {

    /** Value of the Luke number */
    private long value;

    /**
     * Constructs a LukeNumber object based on its position in the sequence.
     *
     * @param position Position of the Luke number in the sequence.
     */
    public LukeNumberDoc(int position) {
        this.value = calculateLuke(position);
    }

    /**
     * Recursive method to calculate the Luke number.
     *
     * @param n Position of the Luke number in the sequence.
     * @return Value of the Luke number at position n.
     */
    private long calculateLuke(int n) {
        if (n == 1) return 1;
        if (n == 2) return 3;
        return calculateLuke(n - 1) + calculateLuke(n - 2);
    }

    /**
     * Returns the value of the Luke number.
     *
     * @return Value of the Luke number.
     */
    public long getValue() {
        return value;
    }

    /**
     * Returns the square of the Luke number.
     *
     * @return Square of the Luke number.
     */
    public long getSquare() {
        return value * value;
    }
}
