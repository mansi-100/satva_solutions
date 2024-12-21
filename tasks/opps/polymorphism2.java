//dynamic operator overloading - method overriding
//atm machine is best example
class shape{
    public void draw(){
        System.out.println("shape draw");
    }
}
class circle extends shape{
    public void draw(){
        System.out.println("circle draw");
    }
}
class polymorphism2{
    circle c=new circle();
    c.draw();
}
