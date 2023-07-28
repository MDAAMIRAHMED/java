class Array{
    
    int arr[];

    Array(int i){
        arr = new int[i];
    }

    void printArray(int i){
        if(i == 0) return;
        printArray(i-1);
        System.out.println("["+(i-1)+"] = " + arr[i-1] );
    }


}

class c07_p09_recursionprintarray{
    public static void main(String args[]){
        Array a = new Array(10);

        for(int i=0; i<10; i++)
            a.arr[i] = i;
        
        a.printArray(10);
    }
}
