
import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        
        String a;
        System.out.println("enter word");
        Scanner input = new Scanner(System.in);
        a=input.next();
      
        functions f =  new functions(a);
        if(a.length()%2==0 ){
            System.out.println("invelid word");
        }
        else{
            f.checkIT();
        }
        
       
    
}
}