class Box{
    double width;
    double height;
    double depth;

    void volume(){
        System.out.println("volume is " + width*depth*height);
    }
}

class c06_p04_methods{
    public static void main(String args[]){
        Box myBox = new Box();
        Box myBox2 = new Box();

        myBox.width = 10;
        myBox.height = 10;
        myBox.depth = 20;

        myBox2.width = 30;
        myBox2.height = 10;
        myBox2.depth = 20;

        myBox.volume();
        myBox2.volume();
    }
}
