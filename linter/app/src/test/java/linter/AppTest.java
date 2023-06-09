/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static linter.App.checkSemicolons;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }


    @Test public void testCheckSemicolonsNoErrors() {
        Path filePath = Paths.get("gates.js");
        String expected = "";
        String actual = checkSemicolons(filePath);
        assertEquals(expected, actual);
    }

    @Test public void testCheckSemicolonsOneError() {
        Path filePath = Paths.get("gates.js");
        String expected = "Line 2: Missing semicolon.\n";
        String actual = checkSemicolons(filePath);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckSemicolonsFewErrors() {
        Path filePath = Paths.get("gates.js");
        String expected = "Line 2: Missing semicolon.\nLine 5: Missing semicolon.\n";
        String actual = checkSemicolons(filePath);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckSemicolonsManyErrors() {
        Path filePath = Paths.get("gates.js");
        String expected = "Line 2: Missing semicolon.\nLine 4: Missing semicolon.\nLine 6: Missing semicolon.\nLine 8: Missing semicolon.\nLine 10: Missing semicolon.\n";
        String actual = checkSemicolons(filePath);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckSemicolonsEmptyFile() {
        Path filePath = Paths.get("gates.js");
        String expected = "";
        String actual = checkSemicolons(filePath);
        assertEquals(expected, actual);
    }
}
