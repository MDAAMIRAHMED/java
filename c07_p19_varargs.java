class Varargs{
    void display(int ... a){
        System.out.print("Number of args : "+ a.length + " Contents: ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
class c07_p19_varargs{
    public static void main(String args[]){
        Varargs ob = new Varargs();
        ob.display(1);
        ob.display(1,2);
        ob.display();
    }
}
