package mypack;

public class Balance{
    String name;
    double bal;

    public Balance(String name, double bal){
        this.name = name;
        this.bal=bal;
    }

    public void show(){
        if(bal<0)
            System.out.print("-->");
        System.out.println(name + ": $"+bal);
    }
}
class AccountBalance {
    public static void main (String args[]){
        // cd ..
        // java mypack.AccountBalance
        
    Balance current[] = new Balance[3];
    current[0] = new Balance("Jack", 5000);
    current[1] = new Balance("Ethan", 60000);
    current[2] = new Balance("Kali", -78945);

    for(int i=0; i<current.length; i++)
        current[i].show();
    }
}
