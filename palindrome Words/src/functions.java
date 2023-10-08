public class functions {
    
    String word;
    int len;
    char arr [];
    char stack[];
    int top=-1;
    boolean check=false;
    functions(String a){
        word=a;
        len=a.length();
        len=len/2;
        
        arr = new char[word.length()];
        stack = new char[word.length()];
    }
    
    void checkIT(){
        for(int i=0; i<word.length(); i++){
            
            arr[i]=word.charAt(i); //LEVEL
            
            if(i<len){
                push(arr[i]);
            }
            
           else if(i==len){
              //  do nothing
            }
            
            
           else if(i>len){
               char a = pop(); 
               if(a==arr[i]){
                   check=true;
               }
               else{
                   check=false;
               }
            }//end of else if
            
        }//end of for loop
        
        if(check){
            System.out.println("its a palindrome word");
        }
        else{
            System.out.println("not a palindrome word");
        }
        
    }//end of check it method
    
   void push(char a){
       ++top;
       stack[top]=a;
   }
   
   char pop(){
     return stack[top--];
   }
   
}//end of class
