public class BubbleSort extends Sort{

    public void processSort(int[] mArray){

        int temp;
        boolean swapped = true;

        while(swapped){
            swapped = false;
            for(int i=0; i < mArray.length; i++){
                if(mArray[i] < mArray[i+1]){
                    temp = mArray[i];
                    mArray[i] = mArray[i+1];
                    mArray[i+1] = temp;
                    swapped = true;
                }
            }
        }
        printSortedArray(mArray);
    }   
}
