public class SelectionSort extends Sort{

    @Override
    public void processSort(int[] mArray){
        int min;
        int i, j;

        for (i=0; i < mArray.length-1; i++){
        
            min = i;

            for (j=i+1; j < mArray.length; j++){
                if (mArray[j]<mArray[min])
                    min = j;
            }

            int temp = mArray[i];
            mArray[i] = mArray[min];
            mArray[min] = temp;

        }
        
        printSortedArray(mArray);  
    }
}
