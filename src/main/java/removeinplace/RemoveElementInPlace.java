package removeinplace;

import java.util.Collections;

public class RemoveElementInPlace {

    private int [] elements;

    public RemoveElementInPlace(int[] elements) {
        this.elements = elements;
    }

    /**
     * "remove" in-place, a given element, but in such a way so as the first
     * "k" elements of the array do not contain element. Where k = (number of elements != elementToRemove)
     *
     * Seems like there's two distinct ways of doing this:
     *  1) Organise the array such that k elements occupies the first contiguous segment of the array
     *  2) When the condition elements[i] == elementToRemove, we strip it out of the array. Or just set it to 0.
     *      Upon setting to 0 just sort the array in descending order? Not super efficient but will meet the requirement
     *
     * @param elementToRemove element to "remove" from the array
     * @return k
     */
    public int removeElementInPlace(int elementToRemove) {
        int k = 0;

        // count k
        for (int i = 0; i < elements.length; i++){
            if(elements[i] != elementToRemove){
                k++;
            }
            else {
                elements[i] = 0;
            }
        }

        // sort array using linear sort
        for (int i = 0; i < elements.length - 1; i++) {
            if(elements[i] < elements[i+1]) { // move the smallest numbers to the end of the array
                int buffer = elements[i + 1];
                elements[i + 1] = elements[i];
                elements[i] = buffer;
            }
        }

        return k;
    }

    public int[] getElements() {
        return elements;
    }

}
