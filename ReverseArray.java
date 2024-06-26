public class ReverseArray {
    public static void main(String[] args) {
        
        int[] numbers = {7, 18,17,45,9};
        int[] reversedArray = new int[numbers.length];
        for (int array = 0; array < numbers.length; array++) {
            reversedArray[array] = numbers[numbers.length - 1 - array];
        }
        System.out.println("Reversed array:");
        for (int element : reversedArray) {
            System.out.print(element + " ");
        }
    }
}