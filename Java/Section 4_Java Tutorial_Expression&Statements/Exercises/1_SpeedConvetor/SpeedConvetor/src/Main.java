public class SpeedConverter
{
    public static long toMilesPerHour (double kilometersPerHour)
    {
        if(kilometersPerHour<0)
            return -1;
        else
        {
            double mph = kilometersPerHour / 1.609;
            int value = (int)mph;
            double check = mph - value;

            if(check < 0.5)
                return (long)Math.round(mph);
            else
                return (long)Math.round(mph);
        }
    }
    public static void printConversion(double kilometersPerHour)
    {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }

        double mph = kilometersPerHour/ 1.609;
        long mphr = Math.round(mph);
        System.out.println(kilometersPerHour + " km/h = " + mphr + " mi/h");
    }
}