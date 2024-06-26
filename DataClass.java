public class DataClass {
public static void main(String[] args) {
    // Declare arrays of different types
    String[] stringArray = {"apple", "banana", "cherry"};
        int[] intArray = {1, 2, 3};
        long[] longArray = {10000000000L, 20000000000L, 30000000000L};
        char[] charArray = {'A', 'B', 'C'};

   
       for (int i =0;i<stringArray.length;i++){
		System.out.println("Array is :"+stringArray[i]);
		}
    
		  for (int i =0;i<intArray.length;i++){
		System.out.println("Array is :"+intArray[i]);
		}
		
		  for (int i =0;i<longArray.length;i++){
		System.out.println("Array is :"+longArray[i]);
		}
		
		  for (int i =0;i<charArray.length;i++){
		System.out.println("Array is :"+charArray[i]);
		}
	}
       
}
