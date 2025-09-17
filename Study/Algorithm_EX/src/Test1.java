import java.util.HashMap;
import java.util.Stack;

public class Test1 {//匹配有效的括号
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("()"));
        System.out.println(isValid("(]"));// false
    }
    public static boolean isValid(String s){
        // 括号之间的对应规则
        HashMap<Character, Character> mappings = new HashMap<Character, Character>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (mappings.containsKey(chars[i])) {// 如果是右括号,则判断栈是否为空，栈为空则返回false
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != mappings.get(chars[i])) {
                    return false;
                }
            } else {
                stack.push(chars[i]);// 栈为空，则入栈
            }
        }
        return stack.isEmpty();
    }
}
