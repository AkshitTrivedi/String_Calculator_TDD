package TestStringCalcFile;
import StringCalcFile.StringCalculator;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestStringCalculator
{
    //1st Test Case to return 0 when Empty String is passed.
    @Test
    public void Return_Zero_For_Empty_String()
    {
        assertEquals(0, StringCalculator.add(""));
    }

    //2nd Test Case to return 1 when String "1" is passed.
    @Test
    public void Return_One_When_One_is_Passed()
    {
        assertEquals(1, StringCalculator.add("1"));
    }

    //3rd Test Case to return Sum of 2 Numbers Passed as String.
    @Test
    public void Return_Sum_Of_Two_Numbers()
    {
        assertEquals(1+2,StringCalculator.add("1,2"));
    }

    //4th Test Case to return Sum of Unknown Numbers Passed as String.
    @Test
    public void Return_Sum_Of_Unknown_Values_Passed_To_It()
    {
        assertEquals(10+20+30+40+50,StringCalculator.add("10,20,30,40,50"));
    }

    //5th Test Case to pass Negative Number and throw Exception.
    @Test
    public void Exception_When_Negative_Number_Passed()
    {
        try
        {
            StringCalculator.add("10,-5,20");
        }
        catch(RuntimeException e)
        {
            System.out.println("Negatives not allowed: -5");
        }
    }


}
