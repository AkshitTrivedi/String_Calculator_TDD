package StringCalcFile;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.signum;

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
        //Negative_Numbers_Exception(nums,len);
        return sum(nums,len);
    }

    static int sum(String nums[], int len)
    {
        ArrayList<String> negative_nums = new ArrayList<String>();
        for(int i=0;i<len;i++)
        {
            if(parseInt(nums[i])<0)
            {
                negative_nums.add(nums[i]);
            }
        }
        if(negative_nums.size()>0)
        {
            throw new RuntimeException("Negatives not allowed: "+ negative_nums);
        }
        int tot=0;
        for(int i=0;i<len;i++)
        {
            if(parseInt(nums[i])>0)
            {
                tot += parseInt(nums[i]);
            }
        }
        return tot;
    }


//    static void Negative_Numbers_Exception(String nums[],int len)
//    {
//        ArrayList<String> negative_nums = new ArrayList<String>();
//        for(int i=0;i<len;i++)
//        {
//            if(parseInt(nums[i])<0)
//            {
//                negative_nums.add(nums[i]);
//            }
//        }
//        if(negative_nums.size()>0)
//        {
//            throw new RuntimeException("Negatives not allowed: "+ negative_nums);
//        }
//    }



}
