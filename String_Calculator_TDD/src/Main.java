import StringCalcFile.StringCalculator;

public class Main
{
    public static void main(String[] args)
    {
        //Passing Empty String to the Function so that 0 will be returned.
        System.out.println(StringCalculator.to_Handle_Zero_and_One(""));

        //Passing 1 as String to the Function so that 1 will be returned.
        System.out.println(StringCalculator.to_Handle_Zero_and_One("1"));
    }
}