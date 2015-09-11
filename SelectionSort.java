import java.util.Arrays;

public class SelectionSort extends Sort{ 

    @Override
    public void sort( int[] mArray ){
        
        if (mArray.length == 0){
            System.out.println("Array is empty.");
            return;
        }

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
