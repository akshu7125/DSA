import java.util.*;
public class validparanthesis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        Stack<Character> s=new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)=='('||input.charAt(i)=='{'||input.charAt(i)=='[')
            s.push(input.charAt(i));
            else if(input.charAt(i)==')'){
               if(s.peek()=='(' && s.isEmpty()!=true){
                s.pop();
                 }
 
            } 
            else if(input.charAt(i)==']'){
                if(s.peek()=='[' && s.isEmpty()!=true){
                 s.pop();
                  }
        }
        
        }
        
    }}

