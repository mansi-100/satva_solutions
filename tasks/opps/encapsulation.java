//wrapping up everthing in single unit(class) called encapsulation
//Encapsulation is a fundamental concept in object-oriented programming (OOP) that binds together the data and the methods that manipulate that data, and keeps both safe from outside interference and misuse.
//some methods is predefined for car to access it without knowledge about internal things.
class car{
    private String engineType;
     
    // private int hp;
    // private String fuelTye;
    public String getType(){
        return engineType;
    }
    public void setType(String engineType){
        this.engineType=engineType;
        // if(val=="n"){
        //     engineType=val;
        // }else{
        //     engineType="new";
        // }
    }
   
}
public class encapsulation{
    public static void main(String args[]){
        car c=new car();
        c.setType("n");
        System.out.println(c.getType());

        c.setType("ultra");
        System.out.println(c.getType());
        
    }
}