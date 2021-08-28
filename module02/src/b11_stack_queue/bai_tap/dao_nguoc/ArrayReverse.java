package b11_stack_queue.bai_tap.dao_nguoc;

import b11_stack_queue.thuc_hanh.su_dung_LinkedList.MyGenericStack;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.LinkedList;
import java.util.Stack;

import static java.lang.Integer.parseInt;

public class ArrayReverse {

    public static void main(String[] args) {
        //Interger
        Stack<Integer> stack = new Stack<>();
        int[] number = {1,2,5,7,9,4,3};
    for( int i=0; i< number.length ; i++) {
        stack.push(number[i]);
        }
        System.out.println(stack);
    int index = 0;
    while(!stack.isEmpty()) {
        number[index] = stack.pop();
        index++;
    }
    for(index=0; index<number.length;index++) {
        stack.push(number[index]);
    }
        System.out.println(stack);
    //String
        Stack<String> wstack = new Stack<>();
        String[] StringReserve = {"hai","con","ga","con"};

        for( int i=0; i< StringReserve.length ; i++) {
            wstack.push(StringReserve[i]);
        }
        System.out.println(wstack);
        int indexString = 0;
        while(!wstack.isEmpty()) {
            StringReserve[indexString] = wstack.pop();
            indexString++;
        }
        for(indexString=0; indexString<StringReserve.length;indexString++) {
            wstack.push(StringReserve[indexString]);
        }

        System.out.println(wstack);
    }
}
