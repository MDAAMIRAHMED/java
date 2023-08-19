interface CallBack{
    void callBack(int param);
}

class Client implements CallBack{
    public void callBack(int p){
        System.out.println("callback with "+ p);
    }

    void nonIfaceMeth(){
        System.out.println("Non interface methods can also be implemented");
    }
}

class AnotherClient implements CallBack{
    public void callBack(int p){
        System.out.println("Another version of Callback ");
        System.out.println("square of p is "+p*p);
    }
}
class c09_p03_ImplementationUsingInterfaceReferences{
    public static void main(String args[]){
        CallBack c = new Client();
        AnotherClient ob = new AnotherClient();
        c.callBack(10);
        //c.nonIfaceMeth(); gives error
        c = ob;
        ob.callBack(12);
        
    }
}
