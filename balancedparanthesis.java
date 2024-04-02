    import java.util.*;
public class balancedparanthesis {
    

	// public static boolean areBracketsBalanced(String s)
	// {
	// 	int i = -1;
	// 	char[] stack = new char[s.length()];
	// 	for (char ch : s.toCharArray()) {
	// 		if (ch == '(' || ch == '{' || ch == '[')
	// 			stack[++i] = ch;
	// 		else {
	// 			if (i >= 0
	// 				&& ((stack[i] == '(' && ch == ')')
	// 					|| (stack[i] == '{' && ch == '}')
	// 					|| (stack[i] == '[' && ch == ']')))
	// 				i--;
	// 			else
	// 				return false;
	// 		}
	// 	}
	// 	return i == -1;
	// }

	// public static void main(String[] args)
	// {
	// 	String expr = "{()}[]";

	// 	// Function call
	// 	if (areBracketsBalanced(expr))
	// 		System.out.println("Balanced");
	// 	else
	// 		System.out.println("Not Balanced");
	// }
   // public class parenthesis {
        public static boolean isValid(String s){
                int n=s.length();
               Stack<Character> st=new Stack<>();
               for(int i=0;i<n;i++){
                if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='('){
                    st.push(s.charAt(i));
                }
                else if( s.charAt(i)=='}'){
                    if(!st.isEmpty() && st.peek()=='{'){
                        st.pop();
                    }
                    else{
                        return false;
                        
                      
                    }
                }
                else if( s.charAt(i)==']'){
                    if(!st.isEmpty() && st.peek()=='['){
                        st.pop();
                    }
                    else{
                        return false;
                      
                        
                    }
                }
                else if(s.charAt(i)==')'){
                    if(!st.isEmpty() && st.peek()=='('){
                        st.pop();
                    }
                    else{
                        return false;
                       
                        
                    }
                }
               }
              return st.isEmpty();
        }
        public static void main(String[] args) {
            String s="(())";
            boolean ans=isValid(s);
            System.out.println(ans);
    
        }
    }
