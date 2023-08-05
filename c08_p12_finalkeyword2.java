class A{
    final void meth(){
        System.out.println("A");
    }
}

class B extends A{
    // void meth(); can't be overriden
}

class c08_p12_finalkeyword2{
    public static void main(String[] args){
        B b = new B();
        b.meth();
    }
}