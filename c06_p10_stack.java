class Stack{
    int s[] = new int[5];
    int tos;

    Stack(){
        tos = -1;
    }

    void push(int data){
        if(tos == 4){
            System.out.println("Stack Overflow");
            return;
        }
        s[++tos] = data;
    }

    int pop(){
        if(tos == -1){
            System.out.println("Stack Underflow");
            return 0;
        }
        else
            return s[tos--];
    }

    void display(){
        if(tos == -1){
            System.out.println("Stack is empty");
            return;
        }

        for(int i = tos; i>=0; i--){
            System.out.print(s[i]+" ");
        }
        System.out.println();
    }
}

class c06_p10_stack{
    public static void main(String args[]){
        Stack st = new Stack();
        
        st.display();
        st.pop();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.display();
    }
}
