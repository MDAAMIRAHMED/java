class Box{
    double width;
    double height;
    double depth;
}

class c06_p03_objectreference{
    public static void main(String args[]){
        Box myBox = new Box();
        Box myBox2 = myBox;

        myBox.width = 10;
        myBox.height = 10;
        myBox.depth = 20;

        myBox2.width = 30;
        myBox2.height = 10;
        myBox2.depth = 20;

        double vol;
        vol = myBox.width* myBox.height * myBox.depth;
        System.out.println("volume is : "+vol);

        
        vol = myBox2.width* myBox2.height * myBox2.depth;
        System.out.println("volume is : "+vol);
    }
}
