public class Car
{
    // the car class also inherits some function by default from the base java class
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public Car(){
        //calling one constructor from another constructor
        this("porse", "pink");
        System.out.println("Empty Constructor called");
    }

    public Car(String model, String colour){
        this.model = model;
        this.colour = colour;
    }

    public Car(int doors, int wheels, String model, String engine, String colour) {
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.engine = engine;
        this.colour = colour;
    }

    public void setModel(String model){
        String validModel = model.toLowerCase();

        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        }
        else {
            this.model = "unknown";
        }
    }

    public String getModel(){
        return model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

}
