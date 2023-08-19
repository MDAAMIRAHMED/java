interface A{
    void meth1();
    void meth2();
}

interface B extends A{
    void meth3();
}

class IfInheritance implements B{
    public void meth1(){
        System.out.println("Implements meth1()");
    }

    public void meth2(){
        System.out.println("Implements meth2()");
    }

    public void meth3(){
        System.out.println("Implements meth3()");
    }
}

class c09_p08_InterfaceInheritance{
    public static void main(String args[]){
        IfInheritance ii = new IfInheritance();
        ii.meth1();
        ii.meth2();
        ii.meth3();
    }
}