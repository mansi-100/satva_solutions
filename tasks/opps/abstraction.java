//hiding complexity and internal details and show only necesary things to user is called abstraction
abstract class Vehicle{
    int a=10;
    //concrete meethod
    public void engine(){
        System.out.println("engine internally working");
    }
    public abstract void start();
}
class Car extends Vehicle{
    public void start(){
        System.out.println("car started");
    }
   /*we can override too
    public void engine(){
        System.out.println("engine2");
    }
    */
}
public class abstraction{

    public static void main(String args[]){
        Car c=new Car();
        // c.engine(); //we won't show this to user
        c.start();
    }
}
//diff bet abstraction and encapsulation
// - Abstraction: A car's transmission system is an abstraction. You don't need to know the intricacies of the transmission system to drive the car. You only need to know how to interact with it (e.g., shifting gears).
// - Encapsulation: The car's engine is an example of encapsulation. The engine's internal components (e.g., pistons, cylinders) are bundled together and hidden from external interference. You can interact with the engine through controlled interfaces (e.g., accelerator pedal, ignition switch).