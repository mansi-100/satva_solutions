//hierarchical inheritance-multiple classes derived from one base class
class A{
    A(){
        System.out.println("hi i am constructor A");
    }
    protected void m(){
        System.out.println("this is protected method");
    }
}
class B extends A{
    B(){
        // m();
        System.out.println("hi i am constructor B");
    }
}
class C extends A{
    C(){
        // m();
        System.out.println("hi i am constructor C");

    }
}
class inheritance2{
    public static void main(String args[]){
        C c=new C();
        c.m();       
    }
}