class Box{
    private double width;
    private double height;
    private double depth;

    Box(){
        this.depth = -1;
        this.height = -1;
        this.width = -1;
    }

    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box(double len){
        this.width = this.height = this.depth = len;
    }

    Box(Box ob){
        this.depth = ob.depth;
        this.height = ob.height;
        this.width = ob.width;
    }

    double volume(){
        return this.width * this.height * this.depth;
    }
}

class BoxWeight extends Box{
    double weight;

    BoxWeight(double width, double height, double depth, double weight){
        super(width, height, depth);
        this.weight = weight;
    }

    BoxWeight(){
        super();
        this.weight = -1;
    }

    BoxWeight(double len, double weight){
        super(len);
        this.weight = weight;
    }

    BoxWeight(BoxWeight ob){
        super(ob);
        this.weight = ob.weight;
    }
}

class c08_p03_superkeyword{
    public static void main(String args[]){
        BoxWeight box1 = new BoxWeight(10, 20, 30, 120);
        BoxWeight box2 = new BoxWeight(30, 120);
        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(box1);
        double vol;
        vol = box1.volume();
        System.out.println("volume of box1 is "+vol);
        System.out.println("weigth of box1 is "+box1.weight);
        
        vol = box2.volume();
        System.out.println("volume of box2 is "+vol);
        System.out.println("color of box2 is "+box2.weight);

        vol = box3.volume();
        System.out.println("volume of box3 is "+vol);
        System.out.println("color of box3 is "+box3.weight);

        vol = box4.volume();
        System.out.println("volume of box4 is "+vol);
        System.out.println("color of box4 is "+box4.weight);
    }
}
