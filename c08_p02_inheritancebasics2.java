class Box{
    double width;
    double height;
    double depth;

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
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
    }
}

class BoxColor extends Box{
    String color;

    BoxColor(double width, double height, double depth, String color){
        this.width = width;
        this.depth = depth;
        this.height = height;
        this.color = color;
    }
}
class c08_p02_inheritancebasics2{
    public static void main(String args[]){
        BoxWeight box1 = new BoxWeight(10, 20, 30, 120);
        BoxColor box2 = new BoxColor(0.10, 0.90, 0.30, "cyan");
        Box plainbox = new Box();
        double vol;

        vol = box1.volume();
        System.out.println("volume of box1 is "+vol);
        System.out.println("weigth of box1 is "+box1.weight);
        
        vol = box2.volume();
        System.out.println("volume of box2 is "+vol);
        System.out.println("color of box2 is "+box2.color);

        plainbox = box1;
        vol = plainbox.volume();
        System.out.println("volume of plainbox is "+vol);
        // System.out.println("Color of plainbox "+plainbox.color);
        // System.out.println("Weight of plainbox "+plainbox.weight);
    }
}