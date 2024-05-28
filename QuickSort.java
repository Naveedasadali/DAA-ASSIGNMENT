public class QuickSort {

    // Method to partition the array
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Pivot element
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Method to implement QuickSort
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partitioning index
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        int[] data = {2, 8, 7, 1, 3, 5, 6, 4};

        System.out.println("Unsorted array:");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Applying quick sort
        quickSort(data, 0, data.length - 1);

        System.out.println("Sorted array:");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}