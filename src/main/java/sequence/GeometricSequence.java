package sequence;

public interface GeometricSequence {

    /**
     *
     * @param k series constant
     * @param r the common ratio between terms
     * @param n the number
     * @return the generated sequence
     */
    int[] computeSequence(int k, int r, int n);
}
