public class Main {
    public static void main(String[] args) {
        String numAsString = "2018";
        System.out.println("numAsString = " + numAsString);

        int num = Integer.parseInt(numAsString);
        double numD = Double.parseDouble(numAsString);
        System.out.println("number = " + num);
        System.out.println("number = " + numD);

        numAsString +=1;
       num +=1;

        System.out.println("numAsString = " + numAsString);
        System.out.println("number = " + num);
    }
}