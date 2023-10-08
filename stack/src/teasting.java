public class teasting {
    public static void main(String[] args) { //pscm+tab
        
        functions f = new functions(3);//0,1,2
        f.push(34);//0
        f.push(244);//1
        f.push(94);//2
        f.push(04);//stack full no enter
        f.pop();
        f.pop();//34-->0
        f.push(74);//1
        f.push(12);//2---<pop
        f.pop();
        f.print_Stack();
        f.peek();
    }
    
}
