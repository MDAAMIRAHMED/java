class sample{
    int a;

    sample(int a){
        this.a = a;
    }

    sample incrSampleByTen(sample o){
        sample temp = new sample(a+10);
        return temp;
    }
}

class c07_p07_returnobjects{
    public static void main(String args[]){
        sample ob1 = new sample(10);

        System.out.println("ob1.a = "+ob1.a);
        
        sample ob2 = ob1.incrSampleByTen(ob1);
        System.out.println("ob2.a = "+ob2.a);
        ob2 = ob2.incrSampleByTen(ob2);
        System.out.println("ob2.a = "+ob2.a);
    }
}