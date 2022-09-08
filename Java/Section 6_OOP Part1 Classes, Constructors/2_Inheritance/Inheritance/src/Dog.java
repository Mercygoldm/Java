public class Dog extends Animal{
    private int breed;
    private String coat;

    public Dog(String name, int weight, int breed, String coat) {
        super(name, weight);
        this.breed = breed;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("The dog is chewing");
    }
    @Override
    public void eat() {
        System.out.println("Dog.eat() is called");
        chew();
        // calls the eat in Animal (parent class)
        super.eat();
    }

    public void walk(){
        System.out.println("Dog is walking");
        super.eat();
    }

    public void run(){

    }
}
