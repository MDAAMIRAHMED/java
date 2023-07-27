class Box{
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        System.out.println("Constructing Box");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double volume(){
        return width*depth*height;
    }
}

class c06_p09_thiskeyword{
    public static void main(String args[]){
        Box myBox = new Box(10, 20, 30);
        Box myBox2 = new Box(10, 10, 10);
        double vol;

        vol = myBox.volume();
        System.out.println("volume is : "+vol);
        
        vol = myBox2.volume();
        System.out.println("volume is : "+vol);
    }
}