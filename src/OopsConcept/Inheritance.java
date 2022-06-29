package OopsConcept;

public class Inheritance {
    public static void main(String[] args) {
        B b= new B();
        b.printMsg();
        b.printshow() ;
        System .out.println(b.j );
        System .out.println(b.i ) ;
    }

}
class A {
    int i=18;
    void printMsg()
    {
        System.out.println("class A");
    }
}

class B extends A {
    int j =12;
    void printshow (){
        System.out.println("class B");
    }

}