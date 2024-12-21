//multilevel
//A is base class B is derived class from A and c is derived class form B
// When one class is derived from another, this type of inheritance is called multilevel inheritance.class A{
 class A{
       A(){
        System.out.println("hi i am constructor A");
    }
    public void show(){
        System.out.println("this is show method");
    }
}
class B extends A{
    B(){
        // m();
        System.out.println("hi i am constructor B");
    }
    public void show2(){
        System.out.println("hi i am show B");

    }
}
class C extends B{
    C(){
        // m();
        System.out.println("hi i am constructor C");

    }
    public void show3(){
        System.out.println("hi i am show C");

    }
}
class inheritance3{
    public static void main(String args[]){
        C c=new C();
        c.show();
        c.show2();
        c.show3();
        // c.m();       
    }
}