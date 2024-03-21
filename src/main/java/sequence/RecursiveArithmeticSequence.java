package sequence;

public class RecursiveArithmeticSequence implements ArithmeticSequence {

    /**
     * Recursively compute terms in sequence, then add to the array.
     * @param k series constant
     * @param d difference between each term
     * @param n the number
     * @return
     */
    @Override
    public int[] computeSequence(int k, int d, int n) {
        int[] termsInSequence = new int[n];

        for (int i = 0; i < termsInSequence.length; i++){
            termsInSequence[i] = computeTerm(k, d, i);
        }

        return termsInSequence;
    }

    public int computeTerm(int k, int n, int d) {
        if(n == 0) {
            return k;
        }
        else {
            return computeTerm(k, n-1, d) + d;
        }

    }
}
