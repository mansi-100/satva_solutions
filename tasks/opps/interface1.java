interface Mansi{
    int a=10;//static,final,abstract
    void show();//considered as abstract methods
}
class Myname implements Mansi{
    //explicit implementation not supported in java
    //public void Mansi.show(){}
    public void Mansi.show(){
        System.out.println("show method");
    }   
    public void Search()
    {
        System.out.println("search method");
    }
}
class interface1{
    public static void main(String args[]){
        Myname m=new Myname();
        m.show();
        System.out.println(m.a);
        //implicitly implementation=just call directly method of intetrface in class
        Mansi mm=new Myname();
        mm.show();

    }   
}