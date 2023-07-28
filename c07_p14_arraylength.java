class Stack{
    private int arr[];
    private int tos;

    Stack(int size){
        arr = new int[size];
        tos = -1;
    }

    void push(int data){
        if(tos == arr.length-1){
            System.out.println("Stack Overflow");
            return;
        }
        arr[++tos] = data;
    }

    void pop(){
        if(tos < 0){
            System.out.println("Stack Underflow");
            return;
        }
        else
            tos--;
    }
}

class c07_p12_arraylength{
    public static void main(String args[]){
        Stack mystack1 = new Stack(5);

        mystack1.pop();
        mystack1.push(1);
        mystack1.push(2);
        mystack1.push(3);
        mystack1.push(4);
        mystack1.push(5);
        mystack1.push(6);
    }
}
