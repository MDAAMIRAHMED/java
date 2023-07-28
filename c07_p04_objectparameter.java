class Box{
    double width;
    double height;
    double depth;

    Box(Box ob){
        this.width = ob.width;
        this.depth = ob.depth;
        this.height = ob.height;
    }
    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box(){
        this.width = -1;
        this.height = -1;
        this.depth = -1;
    }

    Box(double len){
        this.depth = this.height = this.width = len;
    }

    double volume(){
        return this.width * this.depth * this.height;
    }
}

class c07_p04_objectparameter{
    public static void main(String args[]){

        Box mybox1 = new Box(10, 20, 30);
        Box mybox2 = new Box();
        Box mycube = new Box(50);
        Box myclone = new Box(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is: "+vol);
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is: "+vol);
        vol = mycube.volume();
        System.out.println("Volume of mycube is: "+vol);
        vol = myclone.volume();
        System.out.println("Volume of myclone is: "+vol);
    }
}
