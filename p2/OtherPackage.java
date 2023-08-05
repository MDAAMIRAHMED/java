package p2;

class OtherPackage {
    OtherPackage(){
        p1.Protection ob = new p1.Protection();
        System.out.println("other package constructor");
        // System.out.println("n: " + ob.n);
        // System.out.println("n_pri: "+ob.n_pri );
        // System.out.println("n_pro: "+ob.n_pro);
        System.out.println("n_pub:"+ob.n_pub);
    }   
}
