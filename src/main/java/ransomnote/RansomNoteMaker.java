package ransomnote;

import java.util.*;

public class RansomNoteMaker {

    /**
     * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
     * Each letter in magazine can only be used once in ransomNote.
     *
     * @param ransomNote note to make from magazine
     * @param magazine magazine to construct the note
     * @return boolean indicating if the note can be constructed based on the input magazine.
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        final char[] magazineCharacters = magazine.toCharArray();
        final char[] ransomNoteCharacters = ransomNote.toCharArray();

        if(ransomNoteCharacters.length > magazineCharacters.length) {
            return false;
        }

        // Make a hashmap where key == string value == # times occurred for ransomNote and magazine
        final HashMap<Character, Integer> magazineCharactersMap = new HashMap<>();

        for (int i = 0; i < magazineCharacters.length; i++){
            final char character = magazineCharacters[i];
            if (magazineCharactersMap.putIfAbsent(character, 1) != null) {
                Integer numberOfTimesOccurred = magazineCharactersMap.remove(character) + 1;
                magazineCharactersMap.put(character, numberOfTimesOccurred);
            }
        }

        final HashMap<Character, Integer> ransomNoteMap = new HashMap<>();
        for (int i = 0; i < ransomNoteCharacters.length; i++){
            final char character = ransomNoteCharacters[i];
            if (ransomNoteMap.putIfAbsent(character, 1) != null) {
                Integer numberOfTimesOccurred = ransomNoteMap.remove(character) + 1;
                ransomNoteMap.put(character, numberOfTimesOccurred);
            }
        }

        // compare the hashmaps
        for (int i = 0; i < ransomNoteCharacters.length; i++){

        }
    }

}
