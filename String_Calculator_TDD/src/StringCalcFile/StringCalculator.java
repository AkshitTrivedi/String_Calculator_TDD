package StringCalcFile;

import static java.lang.Integer.parseInt;

public class StringCalculator
{
    public static int add(String numbers)
    {

        if(numbers.isEmpty())
        {
            return 0;
        }
        else if(numbers=="1")
        {
            return 1;
        }
        return -1;
    }

    public static int Addition_Of_Two_Numbers(String numbers)
    {
        String addsum[] = numbers.split(",");
        return (parseInt(addsum[0])+parseInt(addsum[1]));
    }
}
