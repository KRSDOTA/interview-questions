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

    public boolean areStringsIsomorphic() {
        for (int i = 0; i < string1.length(); i++){
            char string1Char = string1.charAt(i);
            char string2Char = string2.charAt(i);

            forwardMap.putIfAbsent(string1Char, string2Char);
            backwardsMap.putIfAbsent(string2Char, string1Char);
        }

        return forwardMap.keySet().equals(backwardsMap.values()) && forwardMap.values().equals(backwardsMap.keySet());
    }
}
