package StringCalcFile;

public class StringCalculator
{
    public static int handle_Zero_and_One(String s)
    {
        if(s.isEmpty())
        {
            return 0;
        }
        else if(s=="1")
        {
            return 1;
        }
        return 100;
    }
}
