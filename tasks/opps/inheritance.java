//inherit properties of another class called inheritance
// single inheritance
class A{
    A(){
        System.out.println("hi i am constructor A");
    }
}
class B extends A{
    B(){
        System.out.println("hi i am constructor B");
    }
}
class inheritance{
    public static void main(String args[]){
        B b=new B();
        
    }
}