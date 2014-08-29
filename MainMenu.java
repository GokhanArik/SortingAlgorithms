import java.util.Scanner;
import java.util.Arrays;

public class MainMenu{
    

    public static void main (String[] args){
   
        Scanner in = new Scanner(System.in);
        int mArray[] = new int[]{5,2,4,12,4,3,7,8,9,5};
        int algo = 0;
        
        Sort mSort;
        
        do{
            System.out.println("\nRandom test array: " + Arrays.toString(mArray) );
            printSortingAlgorithms();
            System.out.print("Please make your selection:");
            algo = in.nextInt(); 
            System.out.println();
            switch( algo ){

                case 0:
                    System.exit(0);
                    break;
                case 1:
                    mSort = new InsertionSort();
                    mSort.sort( mArray );

                    break;
             }
        }
        while( algo > 0);

       
    }  

    public static void printSortingAlgorithms(){
        
        System.out.println("\nSorting Algorithms");
        System.out.println("\t1. Insertion Sort");    
    }
}

