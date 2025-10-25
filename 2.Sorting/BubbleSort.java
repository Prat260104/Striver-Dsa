public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Flag to check if any swapping happened in this pass
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped, array is already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        bubbleSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*
==========================================
        📘 Sorting Algorithm Summary
==========================================

Algorithm       | Best Case | Worst Case | Stable | In-place | Key Idea
-----------------------------------------------------------------------
Selection Sort  |  O(n²)    |   O(n²)    |   No   |   Yes    | Select minimum element and swap
Bubble Sort     |  O(n)     |   O(n²)    |  Yes   |   Yes    | Repeatedly swap adjacent elements
Insertion Sort  |  O(n)     |   O(n²)    |  Yes   |   Yes    | Insert element into sorted part
Merge Sort      |  O(n log n)| O(n log n)|  Yes   |   No     | Divide and merge sorted halves
Quick Sort      |  O(n log n)|   O(n²)   |   No   |   Yes    | Partition array around pivot
-----------------------------------------------------------------------

✅ Notes:
- Merge Sort is stable but needs extra space (O(n)).
- Quick Sort is in-place but not stable.
- Merge Sort is preferred when stability matters.
- Quick Sort is generally faster in practice for large arrays.
==========================================
*/
