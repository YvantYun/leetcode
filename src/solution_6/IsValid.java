package solution_6;

import java.util.Stack;

public class IsValid {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i <s.length();i ++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c== '{'){
                stack.push(c);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                char pop = stack.pop();
                //如果pop为'('应该的对的，则可以继续循环，但是如果是'),[].{}'那肯定是false
                //所以不能用 c == ')' && pop ==')'
                if(c == ')' && pop !='('){
                    return false;
                }
                if(c == ']' && pop != '['){
                    return false;
                }
                if(c == '}' && pop != '{'){
                    return false;
                }
            }
        }
        return true;
    }
}
