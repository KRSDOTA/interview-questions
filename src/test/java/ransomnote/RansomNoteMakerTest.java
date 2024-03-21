package ransomnote;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RansomNoteMakerTest {

    RansomNoteMaker ransomNoteMaker = new RansomNoteMaker();

    @ParameterizedTest
    @MethodSource("input")
    void validateCanConstructCases(String ransomNote, String magazine, boolean expectedCanConstruct) {
        final boolean actualCanConstruct = ransomNoteMaker.canConstruct(ransomNote, magazine);

        assertEquals(expectedCanConstruct, actualCanConstruct);
    }

    private static Stream<Arguments> input(){
        return Stream.of(
          Arguments.of("a", "b", false),
          Arguments.of("aa", "ab", false),
          Arguments.of("aa", "aab", true)
        );
    }

}
