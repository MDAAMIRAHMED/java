class A{
    int i;
}

class B extends A{
    int i;

    B(int a, int b){
        super.i = a;
        i = b;
    }

    void show(){
        System.out.println("i in A is "+super.i);
        System.out.println("i in B is "+i);
    }
}

class c08_p04_superkeyword2{
    public static void main(String args[]){
        B ob = new B(10, 20);
        ob.show();
    }
}
