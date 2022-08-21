package StringCalcFile;

import static java.lang.Integer.parseInt;

public class StringCalculator
{
    public static int add(String numbers)
    {
        String nums[] = numbers.split(",");
        int len = nums.length;

        if(numbers.isEmpty())
        {
            return 0;
        }
        else if(numbers.equals("1"))
        {
            return 1;
        }
        return sum(nums,len);
    }

    static int sum(String nums[], int len)
    {
        int tot=0;
        for(int i=0;i<len;i++)
        {
            tot+=parseInt(nums[i]);
        }
        return tot;
    }



}
