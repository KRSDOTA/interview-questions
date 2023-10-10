package test.removeduplicatesfromsortedarray;

public class RemoveDuplicatesFromSortedArrayTest {

    private int[] elements;

    public RemoveDuplicatesFromSortedArrayTest(int[] elements) {
        this.elements = elements;
    }

    /**
     * Remove duplicates in place, keeping the relative order the same.
     * Let k be the distinct number of elements within the array
     *
     *  1) Could remove duplicates, then return the length of the array
     *  2) Could smush the duplicates at the back of the array and keeping some distinct count of k.
     *  As long as the first "k" elements are distinct. All is good. where n - k elements are not distinct and
     *  sit between k < x < k + n
     *
     * @return
     */
    public int removeDuplicatesInPlace() {

    }

    public int[] getElements() {
        return elements;
    }

}
