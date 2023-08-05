final class A{
    void meth(){
        System.out.println("A");
    }
}

// class B extends A{} can't be inherited since class A is final 

class c08_p13_finalkeyword3{
    public static void main(String args[]){
        // new B().meth(); //B
    }
}