import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main (String[] args){
		// creating list
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(0,1);                            // adds 1 at 0 index and likewise
		l1.add(1,2);

		System.out.println(l1);


		// creating another list
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(1);
		l2.add(2);
		l2.add(3);

		// now lets add l2 to l1
		l1.addAll(1, l2);
		System.out.println(l1);


		// lets remove element frm index 1
		l1.remove(1);
		System.out.println(l1);

		// lets print element at index 3
		System.out.println(l1.get(3));

		// lets replace 0th element with 5
		l1.set(0,5);
		System.out.println(l1);


		// creating another list
		List<String> list = new ArrayList<String>(5);
		list.add("Geeks");
		list.add("for");
		list.add("Geeks");

		// lets use my favourite indexOf and lastIndexOf to the list
		System.out.println("first index of Geeks: " + list.indexOf("Geeks"));
		System.out.println("first lastIndex of Geeks: " + list.lastIndexOf("Geeks"));
		System.out.println("index of element not present: " + list.indexOf("Hello"));



		// Type safe array list, stores only string
		List<String> l = new ArrayList<String>(5);

		l.add("GeeksforGeeks");
		l.add("Practice");
		l.add("GeeksQuiz");
		l.add("IDE");
		l.add("Courses");

		List<String> range = new ArrayList<String>();

		// return list between 2nd (including) and 4th element (excluding)
		range = l.subList(2,4);
		System.out.println(range);
	}
}

