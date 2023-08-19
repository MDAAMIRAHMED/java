import java.util.Random;
interface SharedConstants{
    int NO = 0;
    int YES = 1;
    int LATER = 2;
    int SOON = 3;
    int NEVER = 5;
}

class Question implements SharedConstants{
    Random rand = new Random();
    int ask(){
        int qno = (int) (100.0*rand.nextDouble());
        if(qno < 30){
            return NO;
        }
        else if(qno < 60){
            return YES;
        }
        else if(qno < 75){
            return LATER;
        }
        else if(qno < 100){
            return SOON;
        }
        else{
            return NEVER;
        }
    }
}

class Answer implements SharedConstants{
    void answer(int result){
        switch(result){
            case NO:
                System.out.println("NO");
                break;
            
            case YES:
                System.out.println("YES");
                break;
            
            case SOON: 
                System.out.println("SOON");
                break;

            case NEVER:
                System.out.println("NEVER");
                break;
            
            case LATER:
                System.out.println("LATER");
                break;
        }
    }
}

class c09_p07_InterfaceVariables{
    public static void main(String args[]){
        Question q = new Question();
        Answer a = new Answer();

        a.answer(q.ask());
        a.answer(q.ask());
        a.answer(q.ask());
    }
}