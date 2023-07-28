class sample{
    void meth(int i, int j){
        i*=2;
        j/=2;
    }
}

class c07_p05_callbyvalue{
    public static void main(String args[]){
        int a = 15, b = 20;

        System.out.println("Before call by value: a = "+ a + " b = "+b);
        sample ob = new sample();
        ob.meth(a, b);
        System.out.println("After call by value: a = "+ a + " b = "+b);

    }
}
