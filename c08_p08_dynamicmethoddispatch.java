class A{
    void callme(){
        System.out.println("A's Callme method");
    }
}

class B extends A{
    void callme(){
        System.out.println("B's Callme method");
    }
}

class C extends A{
    void callme(){
        System.out.println("C's Callme method");
    }
}

class c08_p08_dynamicmethoddispatch{
    public static void main(String args[]){
        A a = new A();
        B b = new B();
        C c = new C();

        A r;
        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();
    }
}
