public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        int value = 100;
        CalculateScore(value);

        int highScore = HighScore();
        System.out.println("The high score is = " + highScore);
    }
    public static void CalculateScore(int score)
    {
        System.out.println("Calculating Score ... = " + score);
    }

    public static int HighScore()
    {
        return 100;
    }

}