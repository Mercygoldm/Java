public class EvenDigitSum {
    public static int  getEvenDigitSum(int number){
        if(number<0)
            return -1;
        else if(number ==0)
            return 0;

        int num;
        int sum =0;
        while(number!=0)
        {
            num = number % 10;
            if(num % 2 == 0)
                sum = num + sum;

            number = number / 10;
        }
        return sum;
    }
}