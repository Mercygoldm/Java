public class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if(number<1)
            return false;

        int i=1;
        int sum = 0;
        while(i<=number){
            if((number % i) == 0) {
                sum = sum + i;
                System.out.println("sum " + sum);
                System.out.println("i " + i);
            }
            i++;
        }

        if(sum==number)
            return true;
        else
            return false;
    }
}