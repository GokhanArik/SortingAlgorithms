import static java.util.concurrent.TimeUnit.NANOSECONDS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;

public class MainMenu{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";    

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        int algorithm;
        int arraySize = 0;
        int [] mArray = new int[0];
        Sort mSort;

        do{
        //    int mArray[] = new int[]{5,2,4,12,4,3,7,8,9,5};
            if (arraySize == 0) {
                System.out.print("\nEnter array size (10, 100, 1 000, 10 000, 50 000): ");
                arraySize = in.nextInt();
            }
            mArray = initializeArray(arraySize);
    //        System.out.println("\nArray: " + Arrays.toString(mArray));
            printSortingAlgorithms();
            System.out.print("\nPlease make your selection: ");
            algorithm = in.nextInt();
            System.out.println();

            long startTime = System.nanoTime();
            long miliStart = System.currentTimeMillis();

            switch( algorithm ){

                case 0:
                    System.exit(0);
                    break;
                case 1:
                    mSort = new BubbleSort();
                    mSort.sort(mArray);
                    break;
                case 2:
                    mSort = new BucketSort();
                    mSort.sort(mArray);
                    break;
                case 3:
                    mSort = new InsertionSort();
                    mSort.sort(mArray);
                    break;
                case 4:
                    mSort = new MergeSort();
                    mSort.sort(mArray);
                    break;
                case 5:
                    mSort = new QuickSort();
                    mSort.sort(mArray);
                    break;
                case 6:
                    mSort = new SelectionSort();
                    mSort.sort(mArray);
                    break;
            }

            long elapsedTime = System.nanoTime() - startTime;
            long miliElapsed = System.currentTimeMillis() - miliStart;
            System.out.println(ANSI_RED + "> Execution time in micro seconds: " + (double) NANOSECONDS.toMicros(elapsedTime) + ANSI_RESET);
            System.out.println(ANSI_BLUE + "> Execution time in mili seconds: " + miliElapsed + ANSI_RESET);
        }
        while( algorithm > 0);


    }  

    private static int[] initializeArray(int arraySize){
        int[] mArray = new int[0];
        try {
            Scanner scanner = new Scanner(new File( "arrays/" + arraySize + ".txt"));

            mArray = new int[arraySize];
            int i = 0;
            while(scanner.hasNextInt()){
                mArray[i++] = scanner.nextInt();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return mArray;
    }
    public static void printSortingAlgorithms(){

        System.out.println("\nSorting Algorithms");
        System.out.println("\t1. Bubble Sort\t\t: Average -> O(n^2) \t\t Worst -> O(n^2) \t\t Memory -> O(1)");
        System.out.println("\t2. Bucket Sort\t\t:");
        System.out.println("\t3. Insertion Sort\t: Average -> O(n^2) \t\t Worst -> O(n^2) \t\t Memory -> O(1)");
        System.out.println("\t4. Merge Sort\t\t: Average -> O(n log(n)) \t Worst -> O(n log(n)) \t Memory -> ?");
        System.out.println("\t5. Quick Sort\t\t: Average -> O(n log(n)) \t Worst -> O(n^2) \t\t Memory -> O(log(n))");
        System.out.println("\t6. Selection Sort\t: Average -> O(n^2) \t\t Worst -> O(n^2) \t\t Memory -> O(1)");
        System.out.println("\t0. Quit");
    }
}

