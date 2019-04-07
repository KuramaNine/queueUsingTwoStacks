import java.io.*;
import java.util.*;

class queue_using_two_stacks {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Stack<Integer> stackinsert = new Stack<>();
	Stack<Integer> stackdelete = new Stack<>();		
	int q = sc.nextInt();
	while(q-- > 0) {
		int type = sc.nextInt();
		if(type == 1) {
			int x = sc.nextInt();
			stackinsert.push(x);
		} else if(type == 2) {
			if( stackdelete.isEmpty() ) {
				while( !stackinsert.isEmpty() ) {
					stackdelete.push( stackinsert.pop() );
				}
			}
			stackdelete.pop();
		} else {
			if( stackdelete.isEmpty() ) {
				while( !stackinsert.isEmpty() ) {
					stackdelete.push( stackinsert.pop() );
				}
			}
			System.out.println( stackdelete.peek() );
		}
	}
}
}