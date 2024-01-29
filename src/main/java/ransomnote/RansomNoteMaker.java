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

        final HashMap<Character, Integer> magazineCharactersMap = constructCharacterMap(magazineCharacters);
        final HashMap<Character, Integer> ransomNoteMap = constructCharacterMap(ransomNoteCharacters);

        for (int i = 0; i < ransomNoteCharacters.length; i++){
            final char character = ransomNoteCharacters[i];
            final Integer timesInMagazine = magazineCharactersMap.get(character);
            final Integer timesInNote = ransomNoteMap.get(character);
            if(timesInMagazine == null || timesInNote > timesInMagazine) {
                return false;
            }

        }

        return true;
    }

    private HashMap<Character, Integer> constructCharacterMap(char[] input) {
        final HashMap<Character, Integer> characterMap = new HashMap<>();

        for (int i = 0; i < input.length; i++){
            final char character = input[i];
            if (characterMap.putIfAbsent(character, 1) != null) {
                Integer numberOfTimesOccurred = characterMap.remove(character) + 1;
                characterMap.put(character, numberOfTimesOccurred);
            }
        }

        return characterMap;
    }
}
