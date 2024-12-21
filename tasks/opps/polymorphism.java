//one thing many forms
//static polymorphism-using method overloading
class Poly{
    int c;
    public int cal(int a,int b){
        c=a+b;
        return c;
    }

    public int cal(int a,int b,int c){
        c=(a*b)+c;
        return c;
    }
}
class polymorphism{
    public static void main(String args[]){
        Poly p=new Poly();
        System.out.println(p.cal(5,10));
        System.out.println(p.cal(5,10,2));

    }
} 