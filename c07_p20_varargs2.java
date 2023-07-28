class Varargs{
    void display(int ... a){
        System.out.print("Number of args : "+ a.length + " Contents: ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    void display(boolean ... a){
        System.out.print("Number of args : "+ a.length + " Contents: ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    void display(String msg, int ... a){
        System.out.print(msg + " Contents: ");
        for(int v: a){
            System.out.print(v+" ");
        }
        System.out.println();
    }

    // void display(String msg, int ... a, boolean flag){}
    // void display(String msg, int ... a, boolean... flag){}
    // void display(int b, int ... a){} varargs ambiguity
}
class c07_p20_varargs2{
    public static void main(String args[]){
        Varargs ob = new Varargs();
        ob.display(1,2);
        ob.display(true, false, true);
        // ob.display(); varargs ambiguity;
        ob.display("Two Arguments", 2,3);

    }
}