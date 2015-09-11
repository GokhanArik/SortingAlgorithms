import java.util.Arrays;

public class Sort{
   
    public void processSort(int[] mArray){
    }

    public void sort(int[] mArray){
        if (mArray == null || mArray.length==0){
            System.out.println("Array is empty.");
            return;
        } else {
            processSort(mArray);
        }
    }
    public void printSortedArray( int[] mArray ){
        System.out.println("Sorted Array: " + Arrays.toString(mArray));
    }

    public void swap(int[] mArray, int i, int j) {
        int temp = mArray[i];
        mArray[i] = mArray[j];
        mArray[j] = temp;
    }
}



