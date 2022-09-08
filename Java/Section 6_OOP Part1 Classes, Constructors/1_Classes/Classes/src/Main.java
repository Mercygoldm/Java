public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car("ferrari", "white");
        porsche.setModel("C");
        System.out.println("The car model is " + porsche.getModel());
        System.out.println("The holden model is "+ holden.getModel() + " colour is " + holden.getColour());
    }
}