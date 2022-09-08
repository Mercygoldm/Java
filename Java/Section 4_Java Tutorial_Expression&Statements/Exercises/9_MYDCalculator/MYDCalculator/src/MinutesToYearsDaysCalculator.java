public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long years = minutes / (365 * 24 * 60);
        long rem = minutes % (365 * 24 * 60);
        long days = rem / (24*60);
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}