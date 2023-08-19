class A{
    public interface NestedIf{
        boolean isNotNegative(int p);
    }
}

class B implements A.NestedIf{
    public boolean isNotNegative(int p){
        return p<0?false:true;
    }
}

class c09_p05_NestedInterfaces{
    public static void main(String args[]){
        A.NestedIf nif = new B();
        if(nif.isNotNegative(10)){
            System.out.println("10 is not negative");
        }
        if(nif.isNotNegative(-12)){
            System.out.println("It won't be displayed");
        }
    }
}