package test.longestcommonprefix;

import longestcommonprefix.LongestCommonPrefix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LongestCommonPrefixTest {

    LongestCommonPrefix longestCommonPrefix;

    @Test
    void testLongestCommonPrefix() {
        String[] inputData = new String[3];
        inputData[0] = "flower";
        inputData[1] = "flow";
        inputData[2] = "flight";

        longestCommonPrefix = new LongestCommonPrefix(inputData);

        assertTrue("fl".equals(longestCommonPrefix.calculateLongestPrefix()));

    }

    @Test
    void testDegenerateCommonPrefix() {
        String[] inputData = new String[3];
        inputData[0] = "dog";
        inputData[1] = "racecar";
        inputData[2] = "annoying";

        longestCommonPrefix = new LongestCommonPrefix(inputData);

        assertTrue("".equals(longestCommonPrefix.calculateLongestPrefix()));

    }
}
