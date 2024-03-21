package seqence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import sequence.ImpArithmeticSequence;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class ArithmeticSequenceTest {

    private final ImpArithmeticSequence arithmeticSequence = new ImpArithmeticSequence();

    public static Stream<Arguments> TermsInput() {
        return Stream.of(
            Arguments.of(1, 2, 10, new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19}),
            Arguments.of(1, 2, 10, new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19})
        );
    }

    @ParameterizedTest
    @MethodSource("TermsInput")
    void shouldCorrectlyMakeArithmeticSequencesGivenTheInput(int k, int d, int n, int[] expectedSequence) {
        assertThat(expectedSequence).isEqualTo(arithmeticSequence.computeSequence(k, d, n));
    }

}
