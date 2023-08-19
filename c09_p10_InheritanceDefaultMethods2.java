interface MyIf{
    int getNumber();

    default String getString(){
        return "Default Method";
    }
}

class MyIfImp implements MyIf{
    
    public int getNumber(){
        return 100;
    }

    public String getString(){
        return "Overriden Method";
    }
}

class c09_p10_InheritanceDefaultMethods2{
    public static void main(String args[]){
        MyIfImp ob = new MyIfImp();
        System.out.println(ob.getNumber());
        System.out.println(ob.getString());
    }
}