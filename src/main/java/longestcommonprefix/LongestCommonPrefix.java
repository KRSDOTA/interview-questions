package longestcommonprefix;

public class LongestCommonPrefix {

    final String[] prefixes;

    public LongestCommonPrefix(String[] prefixes) {
        this.prefixes = prefixes;
    }

    public String calculateLongestPrefix() {
        // while largest prefix not found
        // for each str in strs
        // check equality with other strs
        // if equals. increment index
        // otherwise return string
        // (exclude degenerate condition for first index and return "")
        // need to figure out what the upperBound is for legnth. As not all strings are the same size ?

        int numberOfStrings = prefixes.length;
        String longestCommonPrefix = prefixes[0];

        for (int i = 1; i < numberOfStrings; i++) {
            String subject = prefixes[i];

            for(int j = 0; j < subject.length(); j++){
                String subjectCharacter = subject.substring(j, j+1);
                String currentLongestPrefixCharacter = longestCommonPrefix.substring(j, j+1);

                if (!subjectCharacter.equals(currentLongestPrefixCharacter)) {
                    // stop where we are and truncate the rest of the string
                    longestCommonPrefix = longestCommonPrefix.substring(0, j);
                    break;
                }
            }
        }

       return longestCommonPrefix;
    }

}
