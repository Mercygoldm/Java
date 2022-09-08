public class Main {
    public static void main(String[] args) {
        // for loop
        for(int i =0; i<5; i++){
            System.out.println("Loops " + i);
        }

        // while loop
        int count =0;
        while(count !=6){
            System.out.println("Count value is " + count);
            count++;
        }

        //do-while loop
        count =1;
        do{
            System.out.println("count value was " + count);
            count++;
        }while(count <= 6);
    }
}