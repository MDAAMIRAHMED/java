class Box{
    double width;
    double height;
    double depth;
}

class c06_p01_simpleclass{
    public static void main(String args[]){
        Box myBox = new Box();

        myBox.width = 10;
        myBox.height = 10;
        myBox.depth = 20;

        double vol;
        vol = myBox.width* myBox.height * myBox.depth;
        System.out.println("volume is : "+vol);
    }
}