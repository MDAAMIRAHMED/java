class Box{
    double width;
    double height;
    double depth;

    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    double volume(){
        return width*depth*height;
    }
}

class c06_p06_methodparameters {
    public static void main(String args[]){
        Box myBox = new Box();
        Box myBox2 = new Box();

        myBox.setDim(50, 10, 20);
        myBox2.setDim(30, 10, 20);

        double vol;
        vol = myBox.volume();
        System.out.println("volume is : "+vol);
        vol = myBox2.volume();
        System.out.println("volume is : "+vol);
    }
}