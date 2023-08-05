class Figure{
    double dim1;
    double dim2;

    Figure(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    double area(){
        System.out.println("Figure is still undefined");
        return 0;
    }
}

class Rectangle extends Figure{

    Rectangle(double dim1, double dim2){
        super(dim1, dim2);
    }

    double area(){
        System.out.println("Inside area of Rectangle");
        return dim1*dim2;
    }
}

class Triangle extends Figure{

    Triangle(double dim1, double dim2){
        super(dim1, dim2);
    }

    double area(){
        System.out.println("Inside area of Triangle");
        return dim1*dim2/2;
    }
}

class c08_p09_methodoverriding2{
    public static void main (String[] args) {
        Figure a = new Figure(10,10);
        Rectangle b = new Rectangle(5, 6);
        Triangle c = new Triangle(4,3);

        Figure r;
        r = a;
        System.out.println("Area is "+ r.area());
        r = b;
        System.out.println("Area is "+ r.area());
        r = c;
        System.out.println("Area is "+ r.area());
    }
}