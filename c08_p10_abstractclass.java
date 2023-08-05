abstract class A{
    abstract void callme();

    void callmetoo(){
        System.out.println("This is a concrete method in abstract class");
    }

    // no object is created for abstract class
    // no abstract static methods and abstract constructors in abstract class
    // if one of the method is abstract then the whole class should be abstract
}

class B extends A{

    void callme(){
        System.out.println("B's implementation of callme() method");
    }
}

class c08_p10_abstractclass{
    public static void main(String args[]){
        B b = new B();
        b.callme();
        b.callmetoo();
    }
}