public class LastDigitChecker {
    public static boolean hasSameLastDigit (int a, int b, int c){
        if(isValid(a)==false || isValid(b)==false|| isValid(c)==false)
        {
            return false;
        }

        int a1,b1,c1;

        a1= a%10;
        b1=b%10;
        c1=c%10;

        if(a1==b1 || a1==c1 || b1==c1)
            return true;
        else
            return false;
    }

    public static boolean isValid(int a){
        if(a<10 || a>1000)
        {
            return false;
        }
        return true;
    }
}