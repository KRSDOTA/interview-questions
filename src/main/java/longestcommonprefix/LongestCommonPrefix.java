package longestcommonprefix;

public class LongestCommonPrefix {

    final String[] strings;

    private final int shortestStringLength;

    public LongestCommonPrefix(String[] strings) {
        this.strings = strings;
        shortestStringLength = findShortestString();
    }

    private int findShortestString() {
        int currentShortest = strings[0].length();
        for(int i = 1; i < strings.length; i++){
            if(currentShortest > strings[i].length()){
                currentShortest = strings[i].length();
            }
        }
        return currentShortest;
    }

    public String calculateLongestPrefix() {
        final int numberOfStrings = strings.length;
        final StringBuilder longestCommonPrefix = new StringBuilder();
        longestCommonPrefix.append("");

        // for each character within a string
        for (int i = 0; i < shortestStringLength; i++) {

            //check for equality
            for (int j = 0; j < numberOfStrings - 1; j++) {
                char x = strings[j].charAt(i);
                char y = strings[j + 1].charAt(i);

                if(x != y) { // if chars aren't equal then just return the string.
                    return longestCommonPrefix.toString();
                }
            }

            longestCommonPrefix.append(strings[0].charAt(i));
        }

       return longestCommonPrefix.toString();
    }
}
