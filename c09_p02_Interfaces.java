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

class c09_p02_Interfaces{
    public static void main(String args[]){
        Client ob = new Client();
        ob.callBack(10);
        ob.nonIfaceMeth();
    }
}