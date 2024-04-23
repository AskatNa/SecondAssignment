import java.util.Stack;

public class FourthTask {
        public static void ReverseStack(Stack<Integer> stack){
            if(!stack.empty()){
                int temp = stack.pop();
                ReverseStack(stack);
                InsertElements(stack,temp);
            }
        }
        public static void InsertElements(Stack<Integer> stack,int element){
            if(stack.empty()){
                stack.push(element);
            }else{
                int temp = stack.pop();
                InsertElements(stack,element);
                stack.push(temp);
            }
        }

        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();

            stack.push(9);
            stack.push(1);
            stack.push(3);
            stack.push(5);
            stack.push(7);
            System.out.println("Original stack: " + stack);
            ReverseStack(stack);
            System.out.println("Reversed stack: " + stack);
        }
}

