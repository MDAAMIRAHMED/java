interface MyIf{
    int getNumber();

    default String getString(){
        return "Default Method";
    }

    static int getDefaultNumber(){
        return 10;
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

class c09_p11_InheritanceStaticMethods{
    public static void main(String args[]){
        MyIfImp ob = new MyIfImp();
        System.out.println(ob.getNumber());
        System.out.println(ob.getString());
        // System.out.println(ob.getDefaultNumber()); gives error because static interface methods can't be inherited
        System.out.println(MyIf.getDefaultNumber());
    }
}