package longestcommonprefix;

public class LongestCommonPrefix {

    final String[] prefixes;

    private final int shortestStringLength;

    public LongestCommonPrefix(String[] prefixes) {
        this.prefixes = prefixes;
        shortestStringLength = findShortestString();
    }

    private int findShortestString() {
        int currentShortest = prefixes[0].length();
        for(int i = 1; i < prefixes.length; i++){
            if(currentShortest > prefixes[i].length()){
                currentShortest = prefixes[i].length();
            }
        }
        return currentShortest;
    }

    public String calculateLongestPrefix() {
        int numberOfStrings = prefixes.length;
        String longestCommonPrefix = prefixes[0];

        for (int i = 1; i < numberOfStrings; i++) {
            String subject = prefixes[i];

            for(int j = 0; j < shortestStringLength; j++){
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
