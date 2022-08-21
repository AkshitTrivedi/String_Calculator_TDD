import StringCalcFile.StringCalculator;

public class Main
{
    public static void main(String[] args)
    {
        //Passing Empty String to the Function so that 0 will be returned.
        System.out.println(StringCalculator.add(""));

        //Passing 1 as String to the Function so that 1 will be returned.
        System.out.println(StringCalculator.add("1"));

        //Passing 1&2 as String to the Function so that their sum will be returned.
        System.out.println(StringCalculator.add("1,2"));
    }
}