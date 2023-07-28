class UseStatic{
    static int a = 4;
    static int b;
    int c = 10;
    static void meth(int x){
        System.out.println("x = "+x);
        System.out.println("a = "+a);
        // System.out.println("a = "+this.a);
        System.out.println("b = "+b);
        // System.out.println("c = "+c);
    }

    double mult(){
        return a*b*c;
    }
    static{
        System.out.println("Static Block Initialized");
        b = a * 3;
    }
}
class c07_p12_statickeyword{
    public static void main(String args[]){
        UseStatic ob = new UseStatic();
        UseStatic.meth(20);
        System.out.println(UseStatic.a);
        ob.mult();
    }
}
