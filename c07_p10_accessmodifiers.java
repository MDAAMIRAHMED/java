class Access{
    int a;
    public int b;
    private double c;

    void setc(int c){
        this.c = c;
    }

    double getc(){
        return c;
    }
}

class c07_p10_accessmodifiers{
    public static void main(String args[]){
        Access ob = new Access();

        ob.a = 10;
        ob.b = 20;

        // ob.c = 30;
        ob.setc(30);

        System.out.println("a = "+ob.a);
        System.out.println("b = "+ob.b);
        System.out.println("c = "+ob.getc());
    }
}