package removeinplace;

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
        int k = calculateK(elementToRemove);
        sortArrayInPlace();
        return k;
    }

    private int calculateK(int val) {
        int k = 0;

        for (int i = 0; i < elements.length; i++){
            if(elements[i] != val){
                k++;
            }
            else {
                elements[i] = 0;
            }
        }

        return k;
    }

    private void sortArrayInPlace() {
        // sort array using bubble sort as it's an in-place algorithm.
        for (int i = 0; i < elements.length; i++) {
            for(int j = i + 1; j < elements.length; j++) {
                if(elements[i] < elements[j]) { // move the smallest numbers to the end of the array
                    int buffer = elements[j];
                    elements[j] = elements[i];
                    elements[i] = buffer;
                }
            }
        }
    }

    public int[] getElements() {
        return elements;
    }

}
