public class Main {
    public static void main(String[] args)
    {
        System.out.println("Test Data");
        System.out.println(DigitSumChallenge.sumDigits(321));
        System.out.println(DigitSumChallenge.sumDigits(125));
        System.out.println(DigitSumChallenge.sumDigits(1000));
    }

    public static class DigitSumChallenge
    {
        public static int sumDigits(int number)
        {
            int iTotal = 0;
            if(number < 0) return -1;
            else
            {
                while(number > 0)
                {
                    iTotal = iTotal + number % 10;
                    number = number / 10;
                }
            }
            return iTotal;
        }
    }
}