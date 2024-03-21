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

        System.out.println(computeNextTerm(k, d, n));

        return termsInSequence;
    }

    public int computeNextTerm(int k, int n, int d) {
        if(n == 1) {
            return k;
        }
        else {
            return computeNextTerm(k, n-1, d) + d;
        }

    }
}
