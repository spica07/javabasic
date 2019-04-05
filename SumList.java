import java.util.LinkedList;

public class SumList {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static LinkedList addLists(LinkedList l1, LinkedList l2) {
		LinkedList result = new LinkedList();
		
		String num1 = "";
		String num2 = "";
		
		while(!l1.isEmpty()){
			int c1 = (int)l1.getLast();
			int c2 = (int)l2.getLast();
			
			l1.removeLast();
			l2.removeLast();
			
			num1 = num1 + c1;
			num2 = num2 + c2;			
		}
		
		int num3 = Integer.parseInt(num1) + Integer.parseInt(num2);
		
		while(num3 > 0){
			result.addLast(num3%10);
			num3 = num3/10;
		}
		
		return result;
	}
}
