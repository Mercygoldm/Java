public class Main
{
    public static void main(String[] args)
    {
       int myValue = 10000;
       int minInt = Integer.MIN_VALUE;
       int maxInt = Integer.MAX_VALUE;

       System.out.println("Integer Minimum Value = " + minInt);
       System.out.println("Integer Maximum value = " + maxInt);

        int myValue2 = 10000;
        int minByte = Byte.MIN_VALUE;
        int maxByte = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " + minByte);
        System.out.println("Byte Maximum value = " + maxByte);

        int minShort = Short.MIN_VALUE;
        int maxShort = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + minShort);
        System.out.println("Short Maximum value = " + maxShort);

        long myLongValue = 100L;
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;

        System.out.println("Long Minimum Value = " + minLong);
        System.out.println("Long Maximum value = " + maxLong);

        byte newByte = (byte) (minByte / 2);

        int myInt = 5;
        float myFloat = 5.25f;
        double myDouble = 5.25;
    }
}