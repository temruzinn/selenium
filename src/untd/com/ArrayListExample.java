package untd.com;
//arraylist example adding and removing elements.
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<String> arrayIteration= new ArrayList<String>();
		ArrayList<String> arrStrList= new ArrayList<String>();
		ArrayList<Integer> arrIntList=new ArrayList<Integer>();	
		arrStrList.add("Steve");//adding strings
		arrStrList.add("John");
		arrStrList.add(0,"praveen");//adding strings at 0 position
		arrIntList.add(10);//adding integers
		arrIntList.add(20);//adding 
		arrStrList.remove("John");
		arrayIteration.add("Praveen");
		arrayIteration.add("singh");
		arrayIteration.add("Vishnu");
		arrayIteration.add("Saanvi");
		arrayIteration.add("Vijaya");
		arrayIteration.set(4,"Vijaya Lakshmi");//updating vijay with vijaya lakshmi
		
		
		System.out.println(arrStrList);
		System.out.println(arrIntList);
		for(String str:arrayIteration)
		{
			System.out.println(str);
			
		}
		
		String str2=arrayIteration.get(1);//getting string from arraylist
		System.out.println(str2);
		int posi=arrayIteration.indexOf("singh");//getting string position from arrylist
		System.out.println(posi);
		int sizeofarraylist=arrayIteration.size();//gettign size of an arraylist
		System.out.println(sizeofarraylist);
		
		// arrayIteration.clear();
		
	}

}