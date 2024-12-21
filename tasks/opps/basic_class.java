class Mansi{
    //default modifier can be accessible with in same page 
    // int a=10;//fields
    protected int a;
    
    public Mansi(int a){
        this.a=a;
        System.out.println("constructor called");
    }
    //method
    public void show(){
        System.out.println("show method "+a);
    }
}
class basic_class{
   public static void main(String args[])
    {
        Mansi m=new Mansi(5);
        m.a=200; //object
        m.show();

    }
}