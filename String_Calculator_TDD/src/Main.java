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
        //System.out.println(StringCalculator.add("-5,10,55"));

        //Passing Multiple Negative Number so that Exception will be raised and printing Negative Numbers.
        //System.out.println(StringCalculator.add("-5,10,55,-100,-250,-90"));

        //Passing 2,1001 as String and here 1001 will be ignored as it is greater than 1000 sum of values less than 1000 will be returned.
        System.out.println(StringCalculator.add("2,1001"));

        //Passing 10\n50,20\n30 as String and their sum will be returned.
        System.out.println(StringCalculator.new_line_delimiter("10\n50,20\n30"));
    }
}