class sample{
    int a, b;
    sample(int a, int b){
        this.a = a;
        this.b = b;
    }
    void meth(sample o){
        o.a*=2;
        o.b/=2;
    }
}

class c07_p06_callbyreference{
    public static void main(String args[]){
        sample ob = new sample(10, 20);

        System.out.println("Before call by reference: a = "+ ob.a + " b = "+ob.b);
        ob.meth(ob);
        System.out.println("After call by reference: a = "+ ob.a + " b = "+ob.b);

    }
}