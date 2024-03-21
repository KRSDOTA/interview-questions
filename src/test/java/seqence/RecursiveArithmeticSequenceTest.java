package seqence;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import sequence.RecursiveArithmeticSequence;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursiveArithmeticSequenceTest {

    private final RecursiveArithmeticSequence recursiveArithmeticSequence = new RecursiveArithmeticSequence();

    public static Stream<Arguments> TermsInput() {
        return Stream.of(
//                Arguments.of(1, 2, 10, new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19}),
                Arguments.of(200, 100, 5, new int[]{200, 300, 400, 500, 600})
        );
    }

    @ParameterizedTest
    @MethodSource("TermsInput")
    void shouldCorrectlyMakeArithmeticSequencesGivenTheInput(int k, int d, int n, int[] expectedSequence) {
        assertEquals(expectedSequence, recursiveArithmeticSequence.computeSequence(k, d, n));
    }

    @Test
    void shouldComputeNextTerm(){
        int k = 100;
        int d = 100;
        int n = 3;

        assertEquals(300, recursiveArithmeticSequence.computeTerm(k, n, d));
    }

}
