public class BinarySearchDesc {

    // Binary search in descending order
    public static int binarySearchDesc(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // If key is found at mid
            if (arr[mid] == key) {
                return mid;
            }

            // If key is less than the middle element, search in the left half
            if (key < arr[mid]) {
                left = mid + 1; // move left boundary to mid + 1
            } else { // If key is greater than the middle element, search in the right half
                right = mid - 1; // move right boundary to mid - 1
            }
        }

        // If key is not present in array
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 50, 40, 30, 20, 10, 0, -10, -20, -30 };

        int key = 20;
        int index = binarySearchDesc(arr, key);

        if (index != -1) {
            System.out.println("Element " + key + " found at index " + index);
        } else {
            System.out.println("Element " + key + " not found in the array");
        }
    }
}
