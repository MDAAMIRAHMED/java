class Stack{
    private int arr[];
    private int tos;

    Stack(int i){
        this.arr = new int[i];
        this.tos = -1;
    }

    void push(int data){
        if(this.tos == 4){
            System.out.println("Stack Overflow");
            return;
        }
        else{
            this.tos+=1;
            // System.out.println(tos);
            arr[tos] = data;
        }
    }

    int pop(){
        if(tos == -1){
            System.out.println("Stack Underflow");
            return 0;
        }
        else
            return arr[tos--];
    }
}

class c07_p11_accessmodifiers2{
    public static void main(String args[]){
        Stack mystack1 = new Stack(5);
        mystack1.pop();
        mystack1.push(1);
        mystack1.push(2);
        mystack1.push(3);
        mystack1.push(4);
        mystack1.push(5);
        mystack1.push(6);
        mystack1.pop();
        mystack1.pop();
        mystack1.pop();
        mystack1.pop();
        mystack1.pop();
        mystack1.pop();
        mystack1.pop();
    }
}