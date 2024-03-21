package sequence;

public interface ArithmeticSequence {

    /**
     *
     * @param k series constant
     * @param d difference between each term
     * @param n the number
     * @return the generated sequence
     */
    int[] computeSequence(int k, int d, int n);

}
