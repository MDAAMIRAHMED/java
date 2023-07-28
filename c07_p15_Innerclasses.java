class Outer {
    int outer_x = 10;

    void display() {
        for (int i = 0; i < 10; i++) {
            class Inner{
                int y = 20;
                void display(){
                    System.out.println("outer_x = "+outer_x);
                }
            }
            Inner ob = new Inner();
            ob.display();
        }  
    }

    // class Inner{
    //     int y = 20;
    // void display(){
    //         System.out.println("outer_x = "+outer_x);
    //     }
    // }
 
    // void showy(){ 
    //     System.out.println("y = "+y);
    // }
}

class c07_p12_Innerclasses{
    public static void main(String args[]){
        Outer ob = new Outer();
        ob.display();
    }
}
