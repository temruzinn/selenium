package untd.com;
public class ArrayPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intArray[];
		intArray= new int[20];
		
		for (int i=0;i<intArray.length;i++){
			intArray[i]=i+1;
		}
		
		for(int i=1;i<intArray.length;i++){
			
			for(int j=0;j<i;j++)
			{
				System.out.print(intArray[j]);
			}
			System.out.print("\n");
		}		
		
	}
}
