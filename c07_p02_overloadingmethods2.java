class Overload{
    void test(){
        System.out.println("No parameters");
    }

    void test(int a, int b){
        System.out.println("a and b: "+a+" "+b);
    }

    void test(double a){
        System.out.println("double a: "+a);
    }
}

class c07_p02_overloadingmethods2{
    public static void main(String args[]){

        Overload obj = new Overload();

        obj.test();
        obj.test(10, 20);
        obj.test(10);
        obj.test(123.456);
    }
}