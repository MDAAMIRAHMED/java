interface CallBack{
    void callBack(int param);
}

abstract class Incomplete implements CallBack{
    int a, b;
    void show(){
        System.out.println("a and b is "+ a + " " + b);
    }
}

class Sub extends Incomplete{
    public void callBack(int p){
        System.out.println("Class that inherits Incomplete");
    }
}
class c09_p04_PartialImplementation{
    public static void main(String args[]){
        CallBack c = new Sub();
        c.callBack(10);
        
    }
}