/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static basiclibrary.Library.*;
import static org.junit.jupiter.api.Assertions.*;

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

    @Test public void testFindArrayWithLowestAverage() {
        int[][] arrays = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] expected = {1, 2, 3};
        int[] result = lowestAverage(arrays);
        assertArrayEquals(expected, result);
    }

    @Test public void testAnalyseWeatherData() {
        int[][] temperaturesArray = {
            {77, 81, 76, 85, 80, 92, 75},
            {86, 83, 81, 77, 82, 82, 83},
            {88, 92, 88, 85, 83, 89, 92}
        };

        String expected =
                """
                        High: 92
                        Low: 75
                        Never saw temperature: 78
                        Never saw temperature: 79
                        Never saw temperature: 84
                        Never saw temperature: 87
                        Never saw temperature: 90
                        Never saw temperature: 91
                        """;
        String actual = analyzeWeatherData(temperaturesArray);

        assertEquals(expected, actual);
    }

    @Test public void testTally() {
        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String expectedWinner = "Bush";
        String actualWinner = tally(votes);

        assertEquals(expectedWinner, actualWinner);
    }
}
