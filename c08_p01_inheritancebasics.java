class A{
    int i, j;
    private int z;

    void showij(){
        System.out.println("i and j : "+ i + " " + j);
    }
}

class B extends A{
    int k;

    void showk(){
        System.out.println("k = " + k);
    }

    void sum(){
        System.out.println(" (i + j + k) = " + (i+j+k));
    }

    // void sumiz(){
    //     System.out.println(" (i + z) = " + (i+z));     gives error since z is private
    // }
}
class c08_p01_inheritancebasics{
    public static void main(String args[]){
        A superob = new A();
        B subob = new B();

        superob.i = 10;
        superob.j = 20;
        System.out.println("Contents of superob: ");
        superob.showij();

        subob.i = 20;
        subob.j = 30;
        subob.k = 70;

        System.out.println("Contents of subob: ");
        subob.showij();
        subob.showk();
        System.out.println("Sum of i, j and k is ");
        subob.sum();
    }
}
