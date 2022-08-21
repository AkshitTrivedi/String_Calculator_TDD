package StringCalcFile;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class StringCalculator
{
    public static int add(String numbers)
    {
        //String nums[] = numbers.split(",");
        String nums[] = numbers.split("\n|,");
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
            if(parseInt(nums[i])>0 && parseInt(nums[i])<=1000)
            {
                tot += parseInt(nums[i]);
            }
        }
        return tot;
    }

//    public static int new_line_delimiter(String numbers)
//    {
//        String nums[] = numbers.split("\n|,");
//        int len = nums.length;
//        return sum(nums,len);
//    }


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


//    public static int greater_than_1000(String numbers)
//    {
//        String nums[] = numbers.split(",");
//        int len = nums.length;
//        int tot=0;
//        for(int i=0;i<len;i++)
//        {
//            if (parseInt(nums[i])<=1000)
//            {
//                tot+=parseInt(nums[i]);
//            }
//        }
//        return tot;
//    }
}
