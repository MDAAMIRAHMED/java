package p1;

public class Protection {
    int n = 1;
    private int n_pri = 2;
    protected int n_pro = 3;
    public int n_pub = 4;

    public Protection(){
        System.out.println("Base Constructor");
        System.out.println("n: " + this.n);
        System.out.println("n_pri: "+this.n_pri );
        System.out.println("n_pro: "+this.n_pro);
        System.out.println("n_pub:"+this.n_pub);
    }
}
