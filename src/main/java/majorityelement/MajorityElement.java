package majorityelement;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    /**
     * Return the element which occurs the most number of times.
     * Can safely assume that there will always be a majority element within the array.
     *
     */
    public static int findMajorityElement(int[] nums) {
        final int majorityThreshold = (nums.length/2) + 1;
        final Map<Integer, Integer> map = new HashMap();

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                int numberOfTimesOccuring = map.remove(nums[i]);
                numberOfTimesOccuring++;
                if(numberOfTimesOccuring >= majorityThreshold){
                    return nums[i];
                }

                map.put(nums[i], numberOfTimesOccuring);
            } else {
                map.put(nums[i], 1);
            }
        }

        return 0;
    }


}
