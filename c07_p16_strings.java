class c07_p16_strings{
    public static void main(String args[]){
        String obj1 = "Hello";
        String obj2 = "Chatgpt";
        String obj3 = obj1;

        System.out.println("length of string object obj1 is "+obj1.length());
        System.out.println("Char at index 2 of obj1 is " + obj1.charAt(2));
        if(obj1.equals(obj3)){
            System.out.println("obj1 == obj3");
        }

        obj3 = obj1 + " " + obj2;
        System.out.println("concatinating two strings: "+obj3);

        String arr[] = {"one", "two", "three"};

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
