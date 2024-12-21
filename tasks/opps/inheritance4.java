//multiple inheri.
//through interface
interface A{
    public void show();
    default void m(){ //interface can contain body of the method too using default keyword
        System.out.println("hi method");
    }
}
interface B{
    public  void show2();//method signature
}
public class inheritance4 implements A,B{
    public void show(){
        System.out.println("this is show");

    }
    public void show2(){
        System.out.println("this is show2");
    }
    public static void main(String args[]){
        inheritance4 d=new inheritance4();
        d.show();
        d.show2();
        d.m();
    }
}