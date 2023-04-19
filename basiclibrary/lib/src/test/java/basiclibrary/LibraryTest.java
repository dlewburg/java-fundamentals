/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;

import static basiclibrary.Library.containsDuplicates;
import static basiclibrary.Library.roll;
import static org.junit.jupiter.api.Assertions.*;
import static basiclibrary.Library.calculateAverage;

class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

    @Test void testRoll() {
        int[] rolls = roll(10);
        assertEquals(10, rolls.length, "Array length is not 10");
        for (int roll : rolls) {
            assertTrue(roll >= 1 && roll <= 6, "Roll value is out of range");
        }
    }

    @Test public void testContainsDuplicates() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 4};
        int[] arr3 = {1, 1, 1, 1, 1};
        int[] arr4 = {1, 2, 3, 4, 5, 5};

        assertFalse(containsDuplicates(arr1));  // no duplicates
        assertTrue(containsDuplicates(arr2));   // duplicate at end of array
        assertTrue(containsDuplicates(arr3));   // all elements are duplicates
        assertTrue(containsDuplicates(arr4));   // duplicate at end of longer array
    }

    @Test public void testCalculateAverage() {
        int[] arr = {1, 2, 3, 4, 5};
        double expectedAvg = 3.0;
        double actualAvg = calculateAverage(arr);
        assertEquals(expectedAvg, actualAvg, 0.001);
    }

    
}
