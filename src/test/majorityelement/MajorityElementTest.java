package test.majorityelement;

import majorityelement.MajorityElement;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTest {

    @ParameterizedTest
    @MethodSource("majorityElementTestSource")
    void shouldReturnMostCommonlyOccurringElement(int[] testArray, int expectedResult) {
        assertEquals(expectedResult, MajorityElement.findMajorityElement(testArray));
    }

    public static Stream<Arguments> majorityElementTestSource() {
        return Stream.of(
                Arguments.of(new int[]{2,2,1,1,1,2,2}, 2),
                Arguments.of(new int[]{2,1,1,1,1,2,2}, 1),
                Arguments.of(new int[]{3,2,3}, 3)
        );
    }
}
