package majorityelement;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    /**
     * Return the element which occurs the most number of times.
     * axiom #1 Assume that there will always be a majority element within the array.
     */
    public static int findMajorityElement(int[] nums) {
        final int majorityThreshold = (nums.length/2) + 1;
        final Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length - 1; i++) {
            final Integer element = nums[i];
            final Integer mapValue = map.putIfAbsent(element, 1);
            if(mapValue != null) {
                incrementExistingElementInMap(map, element);
            }
            if(map.get(element) >= majorityThreshold){
                return element;
            }
        }

        return nums[nums.length - 1]; // refer to axiom #1
    }

    private static void incrementExistingElementInMap(Map<Integer, Integer> map, Integer element) {
        int numberOfTimesOccuring = map.remove(element);
        numberOfTimesOccuring++;
        map.put(element, numberOfTimesOccuring);
    }

}
