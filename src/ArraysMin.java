public class ArraysMin {

    // Method to find the minimum value in an array
    public static int findMin(int[] arr) {
        return arr[0];
    }

    // method to sort an array
    public static int[] sort(int[] arr) {
        return arr;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2};
        int min = findMin(numbers);
        System.out.println("The minimum value is: " + min);

        // How create new arrays
        int[] newArray = new int[numbers.length];
    }
}
