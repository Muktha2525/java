public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize arrays
        int[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"one", "two", "three", "four", "five"};
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        short[] shortArray = {10, 20, 30, 40, 50};
        byte[] byteArray = {1, 2, 3, 4, 5};
        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        double[] doubleArray = {1.11, 2.22, 3.33, 4.44, 5.55};
        boolean[] booleanArray = {true, false, true, false, true};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};

    // Generic method to print array elements and length
		for (int i =0;i<intArray.length;i++){
		System.out.println("Array is :"+intArray[i]);
		}
    
		for (int i =0;i<stringArray.length;i++){
		System.out.println("Array is :"+stringArray[i]);
		}
		for (int i =0;i<charArray.length;i++){
		System.out.println("Array is :"+charArray[i]);
		}
		for (int i =0;i<shortArray.length;i++){
		System.out.println("Array is :"+shortArray[i]);
		}
		for (int i =0;i<byteArray.length;i++){
		System.out.println("Array is :"+byteArray[i]);
		}
		for (int i =0;i< floatArray.length;i++){
		System.out.println("Array is :"+floatArray[i]);
		}
		for (int i =0;i<doubleArray.length;i++){
		System.out.println("Array is :"+doubleArray[i]);
		}
		for (int i =0;i<longArray.length;i++){
		System.out.println("Array is :"+longArray[i]);
		}
		}
	}


   