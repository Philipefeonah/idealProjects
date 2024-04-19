import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);
//        list.removeFirst();
//        list.removeLast();
//        System.out.println(list.contains(10));
//        System.out.println(list.indexOf(20));
//        System.out.println(list.size());
//        var array = list.toArray();
//        System.out.println(Arrays.toString(array));
//        System.out.println(list);

//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        System.out.println(stack);
//        var top = stack.pop();
//        System.out.println(top);
//        System.out.println(stack);
//        var top1 = stack.peek();
//        System.out.println(top1);

        String str = "abcd";
        StringReverse reverser = new StringReverse();
        var result = reverser.reverse(str);
        System.out.println(result);


    }
}