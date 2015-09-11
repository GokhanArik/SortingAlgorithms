public class QuickSort extends Sort{

    public void processSort(int[] mArray){

        quickSort(mArray, 0, mArray.length-1);
        printSortedArray(mArray);                 
    }

    public void quickSort(int[] mArray, int left, int right){
        int i = left, j = right;

        int pivot = mArray[left + (right-left)/2];

        while (i <= j){

            while (mArray[i] < pivot){
                i++;
            }

            while (mArray[j] > pivot){
                j--;
            }

            if (i <= j){
                swap(mArray,i, j);
                i++;
                j--;
            }
        }

        if (left < j)
            quickSort(mArray, left, j);

        if (i < right)
            quickSort(mArray, i, right);
    }
} 
