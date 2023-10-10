package test.removeinplace;

import org.junit.jupiter.api.Test;
import removeinplace.RemoveElementInPlace;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RemoveElementInPlaceTest {

    @Test
    void shouldRemoveElementInPlace() {
       final int [] elements = {3, 2, 2, 3};
        final RemoveElementInPlace removeElementInPlace = new RemoveElementInPlace(elements);
        final int actualK = removeElementInPlace.removeElementInPlace(3);
        final int[] remainingElements = removeElementInPlace.getElements();

        assertEquals(2, actualK);
        assertTrue(Arrays.equals(remainingElements, new int[]{2, 2, 0, 0}));
    }
}
