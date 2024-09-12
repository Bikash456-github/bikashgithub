package assinment;
import java.util.ArrayList;
import java.util.List;
public class Listarray {

	public static void main(String[] args) {
		//create an arraylist
		List<String>arrayList=new ArrayList<>();
		//Add elements
		arrayList.add("Dhungana");
		arrayList.add("Pokhara");
		arrayList.add("Nepal");
		//Display the Arraylist
		System.out.println("ArrayList:"+arrayList);
		//Access an element by index
		System.out.println("Element at indaex 3:"+arrayList.get(1));
	}

}
