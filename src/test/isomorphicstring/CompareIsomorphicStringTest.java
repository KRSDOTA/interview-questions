package test.isomorphicstring;

import isomorphicstring.CompareIsomorphicString;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CompareIsomorphicStringTest {

    @ParameterizedTest
    @MethodSource("source")
    void shouldValidateInputsAreIsomorphic(String s, String t, boolean isIsomorphic) {
        final CompareIsomorphicString compareIsomorphicString = new CompareIsomorphicString(s, t);
        assertEquals(isIsomorphic, compareIsomorphicString.areStringsIsomorphic());
    }

    public static Stream<Arguments> source() {
        return Stream.of(
          Arguments.of("egg", "add", true),
          Arguments.of("foo", "bar", false),
          Arguments.of("paper", "title", true),
          Arguments.of("badc", "baba", false),
          Arguments.of("bbbaaaba", "aaabbbba", false)
        );
    }
}
