class Overload{
    void test(){
        System.out.println("No parameters");
    }

    void test(int a){
        System.out.println("a: "+a);
    }

    void test(int a, int b){
        System.out.println("a and b: "+a+" "+b);
    }

    double test(double a){
        System.out.println("double a: "+a);
        return a*a;
    }
}

class c07_p01_overloadingmethods{
    public static void main(String args[]){

        Overload obj = new Overload();

        obj.test();
        obj.test(10);
        obj.test(10, 20);
        double result = obj.test(123.456);
        System.out.println("Result of obj.test(123.456) " + result);
    }
}