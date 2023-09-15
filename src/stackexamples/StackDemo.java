package stackexamples;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer>stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        //System.out.println(stack.pop());
        //System.out.println(stack.pop());

        int originalSize= stack.size();

        for(int i=0; i< originalSize; i++){
            System.out.println(stack.pop());
        }

        // O persoana poate se manace pringles
        // 1 chips are 30kcal
        // O cutie de pringles are 150 de chipsuri
        // clasa persoana care are metoda eatPringles -> un tub de pringles
        // dupa ce printeze cate kcal a mancat
    }
}
