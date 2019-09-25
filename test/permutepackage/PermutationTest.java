package permutepackage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PermutationTest {

    /* Test case to check for empty strings  */
    @Test
    public void expectedIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Permutation.permuteString("           "));
        Assertions.assertThrows(IllegalArgumentException.class, () -> Permutation.permuteString(""));
    }

    /* Test case to check for correct input */
    @Test
    public void testCorrectInput() {
        Permutation.permuteString("GOD");
    }

    /* Test case to check for correct input with spaces */
    @Test
    public void testInputWithSpaces() {
        Permutation.permuteString("     CATS      ");
    }

}
