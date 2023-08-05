class A{
    int i, j;

    A(int a, int b){
        this.i = a;
        this.j = b;
    }

    void show(){
        System.out.println("i and j : "+i+" "+j);
    }
}

class B extends A{
    int k;

    B(int a, int b, int c){
        super(a, b);
        this.k = c;
    }

    void show(){
        super.show();
        System.out.println("k : "+k);
    }

    void show(String msg){
        System.out.println(msg+k);
    }
}

class c08_p07_methodoverriding{
    public static void main(String args[]){
        B ob = new B(10, 20, 30);
        ob.show();
        ob.show("k is ");
    }
}