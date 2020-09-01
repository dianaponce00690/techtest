package file;

import org.junit.jupiter.api.Test;
import scanerFile.ScannerFile;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class FileTests {

    @Test
    public void testLongestWord() {
        String expectedLongestWord = "abcde";
        var scanner = new ScannerFile();
        scanner.getLongestWord();

        assertEquals(expectedLongestWord, scanner.longestWord, "Incorrect longest word");

        //Verify size of the longest word
        assertEquals(expectedLongestWord.length(), scanner.longestWord.length(), "Incorrect size of the longest word");

        assertEquals("edcba",scanner.reverseLongestWord(),"Incorrect reverse letter");

        //Verify Longest word is alphabetic
        assertTrue(scanner.isLongestWordAlphabetic(),"Longest word is not alphabetic");

    }

}
