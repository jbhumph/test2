// John Humphrey
// 05/28/2024
// Lab 8 Sorting

/* In this lab we have 3 methods. One to implement bubble sort, one to print an array, and a main method to run the other methods
 * The bubble sort algorithm runs through ascending pairs of indices of the array. If it finds the lower side of the pair to contain a higher value, it swaps the value.
 * Multiple passes are run, however, if a loop completes without a swap occuring, the method breaks as the sorting is complete.
 */

 // Bubble sort has a complexity of O(N^2) because the outer loop runs O(N-1) and the inner loop runs O(N). O(N)*O(N-1) == O(N^2).

class BubbleSort {
    static void bubbleSort(int arr[]) {
        // This method implements the bubble sort algorithm. It passes through ascending pairs of data and if the first is larger than the last it swaps them.
        int n = arr.length; 
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                } 
            }
            // if a loop completes without a swap the array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    static void printArray(int arr[]) {
        // This method prints the contents of a given array to the console.
        int n = arr.length;
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            if (i == n-1) {
                System.out.print(arr[i] + "]\n");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    public static void main(String[] args) {
        // This main method tests the sort and print methods. It prints both the unsorted and sorted arrays.
        int arr[] = {1, 9, 2, 7, 3, 4, 12, 5};
        System.out.print("Unsorted Array: ");
        printArray(arr);
        bubbleSort(arr);
        System.out.print("Sorted Array: ");
        printArray(arr);
    }
}