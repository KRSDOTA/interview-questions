package isomorphicstring;

import java.util.HashMap;
import java.util.Map;

public class CompareIsomorphicString {

    private final String string1;
    private final String string2;

    private final Map<Character, Character> forwardMap = new HashMap<>();
    private final Map<Character, Character> backwardsMap = new HashMap<>();

    public CompareIsomorphicString(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }

    /**
     *
     * "Isomorphic" - measure of sameness, How do we consider two strings to be mathematically
     * "the same"
     *
     * One way is by seeing if the characters appear in the same order. But what if the crystalline structure of the string
     * is also the same
     *
     * Two strings s and t are isomorphic if the characters in s can be replaced to get t. (And backwards!!)
     *
     */
    public boolean areStringsIsomorphic() {
        for (int i = 0; i < string1.length(); i++){
            char string1Char = string1.charAt(i);
            char string2Char = string2.charAt(i);

            forwardMap.putIfAbsent(string1Char, string2Char);
            backwardsMap.putIfAbsent(string2Char, string1Char);
        }

        final StringBuilder forwardTransformation = new StringBuilder(string1.length());
        final StringBuilder backwardTransformation = new StringBuilder(string2.length());
        for (int i = 0; i < string1.length(); i++) {
            forwardTransformation.append(forwardMap.get(string1.charAt(i)));
            backwardTransformation.append(backwardsMap.get(string2.charAt(i)));
        }

        return string2.contentEquals(forwardTransformation) && string1.contentEquals(backwardTransformation);
    }
}
