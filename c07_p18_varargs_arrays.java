class VarargsArray{
    void display(int a[]){
        System.out.print("Number of args : "+ a.length + " Contents: ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
class c07_p18_varargs_arrays{
    public static void main(String args[]){
        int a1[] = {1};
        int a2[] = {1,2};
        int a3[] = {};

        VarargsArray ob = new VarargsArray();
        ob.display(a1);
        ob.display(a2);
        ob.display(a3);
    }
}
