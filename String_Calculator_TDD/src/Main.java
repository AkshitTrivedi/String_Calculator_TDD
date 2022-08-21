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

        //Passing 1,2,10 as String to the Function so that their sum will be returned.
        System.out.println(StringCalculator.add("1,2,10"));

        //Passing 100,200,300,400 as String to the Function so that their sum will be returned.
        System.out.println(StringCalculator.add("100,200,300,400"));

        //Passing 60,88,33,47,55,10,500 as String to the Function so that their sum will be returned.
        System.out.println(StringCalculator.add("60,88,33,47,55,10,500"));

        //Passing Negative Number so that Exception will be raised.
        System.out.println(StringCalculator.add("-5,10,55"));
    }
}