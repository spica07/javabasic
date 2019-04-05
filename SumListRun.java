import java.util.LinkedList;

public class SumListRun {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		l1.add(7);
		l1.add(1);
		l1.add(6);
		System.out.println(l1);

		LinkedList l2 = new LinkedList();
		l2.add(5);
		l2.add(9);
		l2.add(2);
		System.out.println(l2);

		LinkedList result = new LinkedList();
		result = SumList.addLists(l1, l2);
		System.out.println(result);
	}
}
