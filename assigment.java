import java.util.Stack;

class  assigment{

    public String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {

        solation obj = new solation();

        System.out.println(obj.removeDuplicates("abbaca"));
        System.out.println(obj.removeDuplicates("azxxzy"));
        System.out.println(obj.removeDuplicates("abcd"));
        System.out.println(obj.removeDuplicates("aabbcc"));
    }
}
