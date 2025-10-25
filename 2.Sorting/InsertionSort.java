public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        insertionSort(arr);

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

