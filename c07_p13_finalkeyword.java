class Sample{
    final int a = 10;

    void meth(final int x){
        System.out.println("x = "+x);
        // x+=10;
    }
}

class c07_p13_finalkeyword{
    public static void main(String args[]){
        Sample ob = new Sample();
        System.out.println(ob.a);
        // ob.a += 10;
        ob.meth(20);
    }
}
