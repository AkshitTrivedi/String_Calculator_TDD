package TestStringCalcFile;
import StringCalcFile.StringCalculator;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestStringCalculator
{
    //First Test Case to return 0 when Empty String is passed.
    @Test
    public void Return_Zero_For_Empty_String()
    {
        assertEquals(0, StringCalculator.to_Handle_Zero_and_One(""));
    }

    //Second Test Case to return 1 when String "1" is passed.
    @Test
    public void Return_One_When_One_is_Passed()
    {
        assertEquals(1, StringCalculator.to_Handle_Zero_and_One("1"));
    }
}
