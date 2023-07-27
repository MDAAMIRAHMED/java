class Box{
    double width;
    double height;
    double depth;

    Box() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }
    double volume(){
        return width*depth*height;
    }
}

class c06_p07_simpleconstructor{
    public static void main(String args[]){
        Box myBox = new Box();
        Box myBox2 = new Box();
        double vol;
        
        vol = myBox.volume();
        System.out.println("volume is : "+vol);
        
        vol = myBox2.volume();
        System.out.println("volume is : "+vol);
    }
}
