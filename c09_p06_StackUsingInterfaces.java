interface IntStack{
    void push(int data);
    int pop();
}

class FixedStack implements IntStack{
    int[] st;
    int tos;

    FixedStack(int size){
        this.st = new int[size];
        this.tos = -1;
    }

    public void push(int data){
        if(tos >= st.length -1){
            return;
        }
        else{
            st[++tos] = data;
        }
    }

    public int pop(){
        if(tos < 0){
            System.out.println("Stack Underflow");
            return -999;
        }
        else{
            return st[tos--];
        }
    }
}

class DynamicStack implements IntStack{
    int[] st;
    int tos;

    DynamicStack(int size){
        this.st = new int[size];
        this.tos = -1;
    }

    public void push(int data){
        if(tos >= st.length-1){
            int temp[] = new int[st.length*2];
            for(int i=0; i<st.length; i++){
                temp[i] = st[i];
            }
            st = temp;
            st[++tos] = data;
        }
        else{
            st[++tos] = data;
        }
    }

    public int pop(){
        if(tos < 0){
            System.out.println("Stack Underflow");
            return -999;
        }
        else{
            return st[tos--];
        }
    }
}
class c09_p06_StackUsingInterfaces{
    public static void main(String args[]){
        IntStack stack;
        FixedStack fs= new FixedStack(3);
        DynamicStack ds = new DynamicStack(3);
        stack = fs;
        for(int i=0; i<3; i++){
            stack.push(i);
        }
        stack = ds;
        for(int i=0; i<6; i++){
            stack.push(i);
        }
        stack = fs;
        for(int i=0; i<3; i++){
            System.out.println(stack.pop());
        }
        stack = ds;
        for(int i=0; i<6; i++){
            System.out.println(stack.pop());
        }
    }
}