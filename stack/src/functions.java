public class functions {
    int stack [];
    int len;
    int top=-1;
    int tempLen;
    functions(int length){
        len=length;
        stack = new int [length];
        tempLen=len;
        --tempLen;
    }
    
    void push(int a){
        
       if(isFull()){
           System.out.println("stack ha no space");
        }
       else{
          top++;//0
           System.out.println("value pushed in stack--->"+a);
        stack[top]=a;// stack[0]=343;
       }
     }//end of push method
    
    void pop(){
        if(isEmpty()){
            System.out.println("stack is empty no pop can be performed");
        }
        else{
            System.out.println("value poped out--->"+stack[top]);
            top--; 
            
        }
    }//end of pop method
    
    boolean isFull(){
        if(top==tempLen){
            return true;
        }
        else{
            return false;
        }
        
    }//end of isFull method
    
    boolean isEmpty(){
        if(top<--len){
            return true;
        }
        else{
            return false;
        }
    }//end of isEmpty method
    
    void peek(){
        
        System.out.println("peak value of our stack is ---->"+stack[top]);
    }
    
    void print_Stack(){
        System.out.println("printing stack values");
        for(int i=top; i>=0; i--){
            System.out.println(stack[i]);
        }
    }//end of printing stack
    
}
