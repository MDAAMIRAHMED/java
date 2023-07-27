class Box{
    double width;
    double height;
    double depth;

    double volume(){
        return width*depth*height;
    }
}

class c06_p05_returnvalue{
    public static void main(String args[]){
        Box myBox = new Box();
        Box myBox2 = new Box();

        myBox.width = 10;
        myBox.height = 10;
        myBox.depth = 20;

        myBox2.width = 30;
        myBox2.height = 10;
        myBox2.depth = 20;

        double vol;
        vol = myBox.volume();
        System.out.println("volume is : "+vol);
        vol = myBox2.volume();
        System.out.println("volume is : "+vol);
    }
}