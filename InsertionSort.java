import java.util.Arrays;

public class InsertionSort extends Sort{ 

    @Override
    public void sort( int[] mArray ){
        int key;
        int i;
        int j;

        for ( j = 1; j < mArray.length; j++){
            
            key = mArray[j];
            
            i = j-1;
            
            while( i>= 0 && mArray[i] > key ){
                mArray[i+1] = mArray[i];
                i = i-1;
            }
            
            mArray[i+1] = key;        
        }      
        
        printSortedArray(mArray);  
    }
}
