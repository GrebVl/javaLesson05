import java.util.Random;

/**
 * Реализовать алгоритм пирамидальной сортировки (HeapSort).
 */


public class task03 {

    public static int[] sort(int arr[]){
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        for (int i=n-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
        return arr;
    }

    public static int[] heapify(int arr[], int n, int i)
    {
        int largest = i; 
        int l = 2*i + 1; 
        int r = 2*i + 2; 
        if (l < n && arr[l] > arr[largest]) largest = l;
        if (r < n && arr[r] > arr[largest]) largest = r;
        if (largest != i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
        return arr;
    }

    static void printArray(int[] arr)
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String args[])
    {
        int[] arr = new int[10];
        Random rnd = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = rnd.nextInt(100);
        }
        printArray(arr);
        int[] arrSort = sort(arr);
        printArray(arrSort);

    }
}
    

