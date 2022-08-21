package TestStringCalcFile;
import StringCalcFile.StringCalculator;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestStringCalculator
{
    //First Test Case to return 0 when Empty String is passed.
    @Test
    public void ReturnZeroForEmptyString()
    {
        assertEquals(0, StringCalculator.addition(""));
    }
}
